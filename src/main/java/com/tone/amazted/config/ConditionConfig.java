package com.tone.amazted.config;

import com.tone.amazted.Interface.ListService;
import com.tone.amazted.domain.LinuxCondition;
import com.tone.amazted.domain.WindowsCondition;
import com.tone.amazted.service.LinuxListService;
import com.tone.amazted.service.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListservice(){
        return new LinuxListService();
    }
}
