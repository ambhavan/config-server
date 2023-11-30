package com.cg.mentorservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mentorservice.entity.Mentor;


public interface MentorRepository extends JpaRepository<Mentor, Long> {

	public Mentor findByid(Long id);
	
}
