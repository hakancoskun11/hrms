package kodamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodamaio.hrms.business.abstracts.EmployerService;
import kodamaio.hrms.core.utilities.results.DataResult;
import kodamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	@Autowired
	private EmployerService employerService;
	
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService=employerService;
	}
	
	
	

}
