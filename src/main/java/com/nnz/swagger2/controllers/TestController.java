package com.nnz.swagger2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnz.swagger2.entitys.TestEmployee;
import com.nnz.swagger2.repositorys.TestEmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "Operations pertaining to employee in Test Employee Management System")
public class TestController {
	@Autowired
	private TestEmployeeRepository testemployeeRepository;

	@ApiOperation(value = "Add an test employee")
	@PostMapping("/testEmployees")
	public TestEmployee createTestEmployee(@Valid @RequestBody TestEmployee testemployee) {
		return testemployeeRepository.save(testemployee);
	}
}
