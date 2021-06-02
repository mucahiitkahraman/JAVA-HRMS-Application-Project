package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobPositionService;
import project.hrms.core.utilities.DataResult;
import project.hrms.core.utilities.Result;
import project.hrms.core.utilities.SuccessDataResult;
import project.hrms.core.utilities.SuccessResult;
import project.hrms.dataAccess.abstracts.JobPositionDao;
import project.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	

	@Override
	public Result add(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
		return new SuccessResult(true, "Yeni is pozisyonun basarili bir sekilde eklendi");
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		this.jobPositionDao.delete(jobPosition);
		return new SuccessResult(true, "Deletion is successful");
	}



	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>> 
		(this.jobPositionDao.findAll(),false, "Listed");
	}
	
}
