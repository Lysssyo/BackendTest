package com.example.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/poi")
public class PoiController {

    @RequestMapping("/list")
    public String list(int pageNum,int pageSize){

        return "This is a list";
    }

    @RequestMapping("/detail")
    public String detail(){
        return "This is detail";
    }

    @PostMapping("/add")
    public String add(){
        return "this is add";
    }

    @PostMapping("/edit")
    public String edit(){
        return "this is edit";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "This is delete";
    }



}
