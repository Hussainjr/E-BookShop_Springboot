package com.E_BookShop_Springboot.adminportal;

import com.E_BookShop_Springboot.adminportal.domain.User;
import com.E_BookShop_Springboot.adminportal.domain.security.Role;
import com.E_BookShop_Springboot.adminportal.domain.security.UserRole;
import com.E_BookShop_Springboot.adminportal.utility.SecurityUtility;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AdminportalApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		User user1 = new User();
		user1.setUsername("admin");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
		user1.setEmail("admin@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));
	}


}
