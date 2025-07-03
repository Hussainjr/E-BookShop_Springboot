package com.E_BookShop_Springboot.adminportal;

import com.E_BookShop_Springboot.adminportal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminportalApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		User user1 = new User();

	}


}
