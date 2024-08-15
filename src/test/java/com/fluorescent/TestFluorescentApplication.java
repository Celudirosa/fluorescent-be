package com.fluorescent;

import org.springframework.boot.SpringApplication;

public class TestFluorescentApplication {

	public static void main(String[] args) {
		SpringApplication.from(FluorescentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
