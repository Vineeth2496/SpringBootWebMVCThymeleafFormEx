package com.SpringBootWebMVC.model;

import java.util.List;

import lombok.Data;

@Data
public class Employee {
	private  Integer empId;
	private  String empName;
	private  String empGen;
	private  String empDept;
	private  List<String> empLangs;
}
