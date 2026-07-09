package com.controll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	List<String> l=new ArrayList<>();
	
	@GetMapping("/employees")
	public List<String> getNames(){
		return List.of("AJAY","Vijay","Sujay");
	}
}
