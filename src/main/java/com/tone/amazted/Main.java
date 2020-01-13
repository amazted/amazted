package com.tone.amazted;
import com.tone.amazted.config.DiConfig;
import com.tone.amazted.config.PrePostConfig;
import com.tone.amazted.service.BeanWayService;
import com.tone.amazted.service.JSR250WayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		context.close();
	}
}