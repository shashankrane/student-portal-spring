package com.sms.studentportal.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sms.studentportal.module.StudentDetails;

@Repository
public interface StudentDetailsRepository extends CrudRepository<StudentDetails, Integer> {
	
	StudentDetails findById(int id);

}

