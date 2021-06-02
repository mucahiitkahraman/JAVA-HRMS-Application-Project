package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.DataResult;
import project.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
	DataResult<Candidate> add(Candidate candidate);
	DataResult<List<Candidate>> getAll();
	
}
