package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.DataResult;
import project.hrms.core.utilities.Result;
import project.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	Result delete(JobPosition jobPosition);
	
}
