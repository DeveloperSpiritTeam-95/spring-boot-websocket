// package com.all.projects.presignedurl.productImages.controller;

// import com.all.projects.configuration.ResponseWithError;
// import com.all.projects.presignedurl.productImages.service.ProductImageService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.core.io.ByteArrayResource;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.multipart.MultipartFile;

// @RestController
// @RequestMapping("/productImage")
// public class ProductImageController {

//     @Autowired
//     private ProductImageService service;

// //    @PostMapping("/{productId}")
// //    public String uploadImage(@PathVariable String productId, @RequestParam("file") MultipartFile file) {
// //        return service.uploadImage(productId,file);
// //    }

//     @PostMapping("/uploadFile/{productId}")
//     public ResponseWithError<String> uploadFile(
//             @PathVariable("productId") String productId,
//             @RequestParam(value = "file") MultipartFile file) {
//         return service.uploadFile(productId,file);
//     }

//     @GetMapping("/downloadFile/{fileName}")
//     public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable(value = "fileName") String filename) {
//         byte[] data = service.downloadFile(filename);
//         ByteArrayResource resource = new ByteArrayResource(data);
//         return ResponseEntity.ok()
//                 .contentLength(data.length)
//                 .header("content-type", "application/octest-stream")
//                 .header("content-disposition", "attachment; filename=\"" + filename + "\"")
//                 .body(resource);
//     }

// }
