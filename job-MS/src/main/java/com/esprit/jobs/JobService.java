package com.esprit.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;

	public Job updateEtatJob(int id, boolean newEtat) {
		if (jobRepository.findById(id).isPresent()) {
			Job existingJob = jobRepository.findById(id).get();
			existingJob.setEtat(newEtat);
			return jobRepository.save(existingJob);
		} else
			return null;
	}
	
	
}
