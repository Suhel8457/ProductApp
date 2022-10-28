package com.training.controller;
import com.training.Model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class Employee {
	@GetMapping("/home/{empname}")
	public String didj(@PathVariable("empname")String ename)
	{
		return "from Employee"+ename;
	}
	@GetMapping("/home")
	public String didj()
	{
		return "from Employee suhel";
	}
	@GetMapping("/home/{num1}/and/{num2}/add")
	public int add(@PathVariable ("num1") int a ,@PathVariable ("num2") int b )
	{
		return a/b;
	}
	@GetMapping("/home/{num1}/and/{num2}/sub")
	public int sub(@PathVariable ("num1") int a ,@PathVariable ("num2") int b )
	{
		return a-b;
	}
	
	@GetMapping("/checkstatus/{empid}/manager/{manaid}")
	public String future(@PathVariable("empid")int empid,@PathVariable("manaid")int manaid)
	{
		return empid+" belongs to manager "+manaid;
	}
	@GetMapping
	public String getEmployee(@RequestBody Employeeone employee)
	{
		return "hello"+employee;
	}
	@PostMapping
	public String saveEmployee(@RequestBody Employeeone employee)
	{
		return "employee entered::"+employee.getEmpname()+"after entered got" +employee;
	}
	@PutMapping("/{empid}")
	public String updateEmployee(@PathVariable("empid") int empid,@RequestBody Employeeone employee)
	{	employee.setEmpid(empid);
		return "employee entered::"+employee.getEmpid()+"after entered got" +employee;
	}
	

}
