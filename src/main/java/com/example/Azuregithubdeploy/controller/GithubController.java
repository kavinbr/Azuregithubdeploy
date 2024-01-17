package com.example.Azuregithubdeploy.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/kec")
public class GithubController {
    @GetMapping("/msc3")
    public String kec() {
        return "welcome Kavin you are best coder.";
    }
}
