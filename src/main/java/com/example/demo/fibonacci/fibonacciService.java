package com.example.demo.fibonacci;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class fibonacciService {

    public Map<String,List<Long>> getfibonacci(Long n){
        Map<String,List<Long>> response=new HashMap<>();
        fibonacci f=new fibonacci();
        List<Long> fibolist=f.getfibo(n);

        fibonacci f2=new fibonacci();
        List<Long> fibolist2=f.sortedfibo(n);

        response.put("fibonacci",fibolist);
        response.put("sorted",fibolist2);



        return response;
    }

}
