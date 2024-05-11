package com.all.projects.presignedurl.service;

import com.all.projects.configuration.ResponseWithError;
import com.amazonaws.HttpMethod;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class S3PreSignedUrlService {

    @Autowired
    private AmazonS3 s3Client;

    @Value("${aws.s3.bucket}")
    private String bucketName;

    @Value("${aws.s3.folder1}")
    private String prabhakarFolder;

    @Value("${aws.s3.folder2}")
    private String ShopByPetsFolder;

    @Value("${aws.s3.folder3}")
    private String OffersImgFolder;

    @Value("${aws.s3.folder4}")
    private String CategoryImgFolder;


    public String generateUrl(String fileName, HttpMethod httpMethod, String folderName) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.add(Calendar.MINUTE,10);
        Date expireTime = getExpirationTime();
        String objectKey = folderName + "/" + fileName;
        URL url = s3Client.generatePresignedUrl(bucketName, objectKey, expireTime, httpMethod);
        return url.toString();
    }

    private Date getExpirationTime() {
        long expirationMillis = System.currentTimeMillis() + (1000 * 60 * 10); // 10 minutes from now // 1 hour from now (1000 * 60 * 60)
        return new Date(expirationMillis);
    }

    @NotNull
    private List<String> getListOfUrls(List<String> fileNames, HttpMethod httpMethod, String folderName) {
        List<String> urlList = new ArrayList<>();

        for (String fileName : fileNames) {
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(new Date());
//            calendar.add(Calendar.MINUTE,10);
            Date expireTime = getExpirationTime();
            String objectKey = folderName + "/" + fileName;
            URL url = s3Client.generatePresignedUrl(bucketName, objectKey, expireTime, httpMethod);
            urlList.add(url.toString());
        }
        return urlList;
    }


    // for upload, download, update, delete preSigned urls functions with s3
    public String generatedUrlForPrabhakar(String fileName) {
        return generateUrl(fileName, HttpMethod.PUT, prabhakarFolder);
    }

    public String generateUrlForDownloadPrabhakar(String fileName) {
        return generateUrl(fileName, HttpMethod.GET, prabhakarFolder);
    }

    public String generateUrlForUpdateFile(String existFile, String updateFile) {
        // Check if the existing file exists in the bucket
        String sourceFolder = bucketName + "/" + prabhakarFolder;
        boolean fileExists = s3Client.doesObjectExist(sourceFolder, existFile);

        if (!fileExists)
            return "file does not exist";

        // Generate preSigned URL for update
        String delete = generateUrlForDeleteFile(existFile);
        return "delete file using this url: \n" + delete + "\n update file using url: \n" +
                generateUrl(updateFile, HttpMethod.PUT, prabhakarFolder);
    }

    public String generateUrlForDeleteFile(String filename) {
        return generateUrl(filename, HttpMethod.DELETE, prabhakarFolder);
    }


    public ResponseWithError<String> uploadFile(MultipartFile file) {

        File fileObj = convertMultiPartFileToFile(file);
        String fileName = file.getOriginalFilename();
        s3Client.putObject(new PutObjectRequest(bucketName, fileName, fileObj));
        fileObj.delete();

        return ResponseWithError.of("File uploaded : " + fileName);
    }

    private File convertMultiPartFileToFile(MultipartFile file) {
        File convertedFile = new File(Objects.requireNonNull(file.getOriginalFilename()));
        try (FileOutputStream fos = new FileOutputStream(convertedFile)) {
            fos.write(file.getBytes());
        } catch (IOException e) {
            log.error("Error converting multipartFile to file", e);
        }
        return convertedFile;
    }
}

