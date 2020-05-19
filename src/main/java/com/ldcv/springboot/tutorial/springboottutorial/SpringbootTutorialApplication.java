package com.ldcv.springboot.tutorial.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(SpringbootTutorialApplication.class, args);
		
		String beans[] = appCtx.getBeanDefinitionNames();
		for( String bean: beans ) {
			System.out.println("LDCV --- Bean name = " + bean);
		}
		
	}

}
