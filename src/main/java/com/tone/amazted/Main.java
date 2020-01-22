package com.tone.amazted;
import com.tone.amazted.Interface.ListService;
import com.tone.amazted.config.ConditionConfig;
import com.tone.amazted.config.DiConfig;
import com.tone.amazted.config.PrePostConfig;
import com.tone.amazted.config.TaskExcutorConfig;
import com.tone.amazted.controller.GreetingController;
import com.tone.amazted.controller.HelloController;
import com.tone.amazted.service.AsyncTaskService;
import com.tone.amazted.service.BeanWayService;
import com.tone.amazted.service.JSR250WayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(Main.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Main.class,args);
	}
}