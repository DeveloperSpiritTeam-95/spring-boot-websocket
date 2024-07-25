// package com.all.projects.presignedurl.controller;

// import com.all.projects.presignedurl.service.S3PreSignedUrlService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class S3PreSignedUrlController {


//     @Autowired
//     private S3PreSignedUrlService preSignedUrlService;

//     @GetMapping("/upload-url")
//     public String getUploadUrl(@RequestParam String filename) {
//         return preSignedUrlService.generatedUrlForPrabhakar(filename);
//     }

//     @GetMapping("/download-url/{fileName}")
//     public String getDownloadUrl(@PathVariable("fileName") String fileName) {
//         return preSignedUrlService.generateUrlForDownloadPrabhakar(fileName);
//     }

//     @GetMapping("/update-url")
//     public String getUpdateUrl(@RequestParam String existFile,
//                                                @RequestParam String updateFile) {
//         return preSignedUrlService.generateUrlForUpdateFile(existFile,updateFile);
//     }

//     @GetMapping("/delete-url/{fileName}")
//     public String getDeleteUrl(@PathVariable("fileName") String fileName) {
//         return preSignedUrlService.generateUrlForDeleteFile(fileName);
//     }



// }

