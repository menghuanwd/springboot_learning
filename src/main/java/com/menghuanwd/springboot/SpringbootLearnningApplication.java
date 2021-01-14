package com.menghuanwd.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.menghuanwd.springboot.dao")
public class SpringbootLearnningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearnningApplication.class, args);
	}

}
