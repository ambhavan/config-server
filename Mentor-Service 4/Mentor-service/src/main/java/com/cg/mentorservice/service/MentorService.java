package com.cg.mentorservice.service;

import com.cg.mentorservice.dto.MentorDto;

public interface MentorService {
   public  MentorDto saveMentor(MentorDto mentorDto);

   public  MentorDto getMentorById(Long id);
}
