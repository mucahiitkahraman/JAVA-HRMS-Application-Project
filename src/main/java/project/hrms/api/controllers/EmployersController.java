package project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.DataResult;
import project.hrms.entities.concretes.Employer;

public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService)
	{
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll()
	{
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<Employer> add(Employer employer){
		
		return (DataResult<Employer>) this.employerService.add(employer);
	}
	
}
