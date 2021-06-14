package com.sms.studentportal.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.studentportal.module.StudentDetails;
import com.sms.studentportal.repository.StudentDetailsRepository;


@Service
public class StudentDetailsService {
		
	@Autowired
	StudentDetailsRepository studentDetailsRepository;

	public StudentDetails saveStudentDetails(StudentDetails studentDetails) {
		// TODO Auto-generated method stub
		return studentDetailsRepository.save(studentDetails);
	}

	public List<StudentDetails> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return (List<StudentDetails>)studentDetailsRepository.findAll();
	}

	public StudentDetails getById(int id) {
		// TODO Auto-generated method stub
		return studentDetailsRepository.findById(id);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentDetailsRepository.deleteById(id);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		studentDetailsRepository.deleteAll();
	}

	public StudentDetails updateStudent(StudentDetails studentDetails) {
		// TODO Auto-generated method stub
		return studentDetailsRepository.save(studentDetails);
	}
}

