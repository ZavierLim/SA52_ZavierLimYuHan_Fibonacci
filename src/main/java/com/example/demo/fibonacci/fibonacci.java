package com.example.demo.fibonacci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fibonacci {
    private List<Long> fibonacci;
    private List<Long> sorted;

    public fibonacci(){}

    public fibonacci(List<Long> fibonacci, List<Long> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }


    public List<Long> getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(List<Long> fibonacci) {
        this.fibonacci = fibonacci;
    }

    public List<Long> getSorted() {
        return sorted;
    }

    public void setSorted(List<Long> sorted) {
        this.sorted = sorted;
    }

    public List<Long> getfibo(Long n){
        List<Long> fibolist=new ArrayList<>();
        long firstnumber=0;
        long secondnumber=1;
        long sum=0;

        for(long i=0;i<n;i++){
            if(i<1) {
                fibolist.add(i); //first number is 0
                sum+=1;
            }
            else{
                fibolist.add(sum); //second number is 1
                sum=firstnumber+secondnumber; //set the total to sum of both number
                firstnumber=secondnumber; //set the first number to be the n-2
                secondnumber=sum; //set the 2nd number to be n-1
            }

        }
        return fibolist;
    }

    public List<Long> sortedfibo(Long n){
        List<Long>fibolist=getfibo(n);
        Collections.sort(fibolist,Collections.reverseOrder());
        List<Long> Evenlist=new ArrayList<>();
        List<Long> OddList=new ArrayList<>();

        for(Long eachelement:fibolist){
            if(eachelement%2==0){
                Evenlist.add(eachelement);
            }
            else{
                OddList.add(eachelement);
            }
        }
        List<Long> finallist=new ArrayList<>();
        for(Long evenelement:Evenlist)
            finallist.add(evenelement);

        for(Long oddelement:OddList)
            finallist.add(oddelement);

        return finallist;

    }
}
