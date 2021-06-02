package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.DataResult;
import project.hrms.entities.abstracts.User;

public interface UserService {
	
	DataResult<List<User>> getAll();
	User add(User user);
	
}
