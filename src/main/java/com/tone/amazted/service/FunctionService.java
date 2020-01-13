package com.tone.amazted.service;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHi(String word){
        return "hello "+ word +"!";
    }

}
