package com.tone.amazted.service;

import com.tone.amazted.Interface.ListService;

public class LinuxListService implements ListService {
    @Override
    public String showListCmd(){
        return "ls";
    }
}
