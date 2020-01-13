package com.tone.amazted.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionnService {
    @Autowired
    FunctionService functionService;

    public String SayHi(String word) {
        return functionService.sayHi(word);
    }
}

