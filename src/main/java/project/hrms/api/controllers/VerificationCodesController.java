package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import project.hrms.business.abstracts.VerificationCodeService;
import project.hrms.core.utilities.Result;

public class VerificationCodesController {
	
	private VerificationCodeService verificationCodeService;
	
	@Autowired
	public VerificationCodesController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}
	
	@GetMapping("/active/{code}")
	public Result activeUser(@PathVariable String code) {
		
		return verificationCodeService.activateUser(code);
	}
	
}
