package com.SpringBootWebMVC.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootWebMVC.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	//1. show Edit Form with Data
	@GetMapping("/edit")
	public String showEdit(Model model) {
		Employee e=new Employee();
		e.setEmpId(7);
		e.setEmpName("MS DHONI");
		e.setEmpGen("Male");
		//e.setEmpDept("DEV");
		e.setEmpDept("1");
		e.setEmpLangs(Arrays.asList("ENG","TEL"));
		model.addAttribute("employee", e);
		
		//dynamic dropdown data (Consider we got from DB)
		Map<String, String> data=Map.of(
							"1","QA",
							"2","BA",
							"3","DEV",
							"4","PROD"
							);
		model.addAttribute("map", data);
		
		Map<String, String> langs=Map.of(
				"ENG","ENGLISH",
				"TEL","TELUGU",
				"HIN","HINDI",
				"TAM","TAMIL"
				);
		model.addAttribute("langs", langs);
		
		return "EmployeeEdit";
	}
	//2. Read Form data back to controller on submit
}
