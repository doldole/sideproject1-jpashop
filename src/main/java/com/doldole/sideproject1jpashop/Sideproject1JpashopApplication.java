package com.doldole.sideproject1jpashop;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sideproject1JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sideproject1JpashopApplication.class, args);
	}

	@Bean
	Hibernate5Module hibernate5Module() {
		// 강제로 지연로딩하여 데이터 조회
		/*Hibernate5Module hibernate5Module = new Hibernate5Module();
		hibernate5Module.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING,true);*/

		return new Hibernate5Module();
	}
}
