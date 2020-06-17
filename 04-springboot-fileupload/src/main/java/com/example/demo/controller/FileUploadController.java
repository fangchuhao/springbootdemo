package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传Controller
 */
@RestController
public class FileUploadController {
    @PostMapping("/fileUploadController")
    public String fileupload(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        try {
            file.transferTo(new File("F:/"+ UUID.randomUUID().toString().substring(0,10)+System.currentTimeMillis()+originalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "OK";
    }
}
