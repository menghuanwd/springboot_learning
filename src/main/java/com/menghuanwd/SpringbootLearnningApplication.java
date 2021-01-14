package com.menghuanwd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.menghuanwd.dao")
public class SpringbootLearnningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearnningApplication.class, args);
	}

}
