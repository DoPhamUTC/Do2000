package com.globits.da.rest;

import com.globits.da.dto.StudentDTO;
import com.globits.da.service.MyFirstApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Scanner;

@RestController
public class MyFirstController {

    @Autowired
    MyFirstApiService apiService;

    //Ex#4
    @GetMapping("/firstApi")
    public String getFirstApi() {
        return "My First Api";
    }

    //Ex#5
    @GetMapping("/firstApiService")
    public String getFirstApiSrv() {
        return apiService.getFirstApiService();
    }

    //Ex#6
    @PostMapping("/MyfirstApi")
    public StudentDTO showInfo(@RequestBody StudentDTO studentDTO) {
        return studentDTO;
    }

    //    //Ex#9
//    @GetMapping("/firstApi/requestPr")
//    public String getParams(){
//        return "My First Api";
//    }

    //Ex#12
    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public void create(@RequestParam("file") MultipartFile[] files) throws IOException {
        for (MultipartFile file:files) {
            String content = new String(file.getBytes());
            System.out.println(content);
        }
    }
}
