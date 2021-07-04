package com.example.demo.fibonacci;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="fibonacci")
public class fibonacciController {

    private final fibonacciService fservice;

    @Autowired
    public fibonacciController(fibonacciService fibonacciService){
        this.fservice=fibonacciService;
    }

    @RequestMapping("")
    @ResponseBody
    public Map<String,List<Long>> dosomething(@RequestBody elements input){
        return fservice.getfibonacci((Long.parseLong(input.getElements())));
    }


}
