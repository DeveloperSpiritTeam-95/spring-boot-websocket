// package com.all.projects.presignedurl.productImages.service;


// import com.all.projects.configuration.ResponseWithError;
// import com.amazonaws.services.s3.AmazonS3;
// import com.amazonaws.services.s3.model.PutObjectRequest;
// import com.amazonaws.services.s3.model.S3ObjectInputStream;
// import com.amazonaws.util.IOUtils;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Service;
// import org.springframework.web.multipart.MultipartFile;

// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;

// @Service
// @Slf4j
// public class ProductImageService {

//     @Autowired
//     private AmazonS3 amazonS3;

// //    @Autowired
// //    private S3Client s3Client;


//     @Value("${aws.s3.bucket1}")
//     private String bucketName;


//     public ResponseWithError<String> uploadFile(String productId, MultipartFile file) {

//         File fileObj = convertMultiPartFileToFile(file);
//         String fileName = productId + "_" + file.getOriginalFilename();
//         amazonS3.putObject(new PutObjectRequest(bucketName, fileName, fileObj));
//         fileObj.delete();

//         return ResponseWithError.of("File uploaded : " + fileName);
//     }

//     private String generateS3FileUrl(String fileName) {
//         String s3Url = "https://" + bucketName + ".s3.amazonaws.com/" + fileName;
//         return s3Url;
//     }

//     public byte[] downloadFile(String fileName){
//         com.amazonaws.services.s3.model.S3Object
//                 s3Object = amazonS3.getObject(bucketName,fileName);
//         S3ObjectInputStream inputStream = s3Object.getObjectContent();

//         try {
//             byte[] content = IOUtils.toByteArray(inputStream);
//             return content;
//             //return generateUrl(fileName,HttpMethod.GET);
//         }catch (IOException e){
//             e.printStackTrace();
//         }
//         return null;
//     }

//     private File convertMultiPartFileToFile(MultipartFile file) {
//         File convertedFile = new File(file.getOriginalFilename());
//         try (FileOutputStream fos = new FileOutputStream(convertedFile)) {
//             fos.write(file.getBytes());
//         } catch (IOException e) {
//             log.error("Error converting multipartFile to file", e);
//         }
//         return convertedFile;
//     }

// //    public String generateUrl(String fileName, HttpMethod httpMethod){
// //        Calendar calendar = Calendar.getInstance();
// //        calendar.setTime(new Date());
// //        calendar.add(Calendar.MINUTE,10);
// //        URL url = amazonS3.generatePresignedUrl(bucketName,fileName,calendar.getTime(),httpMethod);
// //        return url.toString();
// //    }


// //    public ResponseWithError<String> uploadFile(String productId, MultipartFile file) {
// //        try {
// //            File fileObj = convertMultiPartFileToFile(file);
// //            String fileName = productId + "_" + file.getOriginalFilename();
// //
// //            // Upload the file to Amazon S3
// //            amazonS3.putObject(new PutObjectRequest(bucketName, fileName, fileObj));
// //
// //            // Delete the temporary local file
// //            fileObj.delete();
// //
// //            // Return success response
// //            String fileUrl = generateUrl(fileName,HttpMethod.PUT);
// //            return ResponseWithError.of("File uploaded successfully. File URL: " + fileUrl+" "+fileName);
// //        } catch (Exception e) {
// //            // Log the exception for debugging purposes
// //            e.printStackTrace();
// //
// //            // Return error response
// //            return ResponseWithError.ofError("File upload failed. Reason: " + e.getMessage());
// //        }
// //    }

// }
