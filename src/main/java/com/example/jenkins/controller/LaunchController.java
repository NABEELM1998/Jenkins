package com.example.jenkins.controller;

import com.example.jenkins.model.Name;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchController {

@GetMapping("/launch")
    public ResponseEntity<String> launch(@RequestBody Name name){
        String response = "Hello" + " "+ name.getName() + "welcome!";
        return new ResponseEntity<>(response,HttpStatus.OK);

    }
}
