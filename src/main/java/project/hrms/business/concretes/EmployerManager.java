package project.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.DataResult;
import project.hrms.core.utilities.Result;
import project.hrms.core.utilities.SuccessDataResult;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll() + "Is verenler basarili bir sekilde listelendi");
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}
}
