package kodamaio.hrms.business.abstracts;

import java.util.List;

import kodamaio.hrms.core.utilities.results.DataResult;
import kodamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<JobTitle> add(JobTitle title);
	DataResult<JobTitle> delete(JobTitle jobPositio);
	DataResult<List<JobTitle>> getAll();
	
}
