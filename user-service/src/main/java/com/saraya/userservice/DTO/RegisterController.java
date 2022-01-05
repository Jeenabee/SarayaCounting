package com.saraya.userservice.DTO;


import com.saraya.userservice.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    
	@Autowired
	private UserDTO userDTO;
	
	@RequestMapping("/check")
	public String registercheck() {
		return "check register !!!";
	}
	
	@RequestMapping("/register-user/{userName}/{password}")
	public String registerUser(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		System.out.println("=====In register microservice from login microservice start");

		User u=new User();
		u.setId(5);
		u.setName(userName);
		u.setPassword(password);
		userDTO.save(u);
		
		return "Successfully registered !!!";
	}
    
}
