package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.DataResult;
import project.hrms.core.utilities.Result;
import project.hrms.entities.abstracts.User;
import project.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	DataResult<List<VerificationCode>> getAll();
	
	String createActivationCode(User user);
	Result activateUser(String activationCode);
	VerificationCode getByCode(String code);
	
}
