package com.tone.amazted.service;

import com.tone.amazted.Interface.ListService;

public class WindowsListService implements ListService {
    @Override
    public String showListCmd(){
        return "dir";
    }
}
