package com.example.demo.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.demo.board.mapper"})
public class SpringbootMvcJspApplication {

	/**
	 * @title SpringBoot class 작성
	 * @descriptio 아래와 같은 클래스를 생성하면 @EnableAutoConfiguration에 의해
	 *             Spring MVC 기본 설정을 사용
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcJspApplication.class, args);
	}

}