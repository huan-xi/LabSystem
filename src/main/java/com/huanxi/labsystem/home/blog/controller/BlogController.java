package com.huanxi.labsystem.home.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @GetMapping("/writeBlog")
    public String writeBlog(){
        return "blog/writeBlog";
    }
}
