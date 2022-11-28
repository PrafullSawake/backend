package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Employee;

@Controller
public class HomeController {
		@RequestMapping("/")
		public String login() {
			
			return "login";
		}
		@RequestMapping("/log")
		public String log(@RequestParam("uname") String uname,@RequestParam("pass") String pass) {
			System.out.println(uname);
			System.out.println(pass);
			
			return "success";
		}
		@RequestMapping("/regis")
		public String register() {
			return "register";
		}
}
