package com.cg.mentorservice.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.entity.Mentor;
import com.cg.mentorservice.mapper.MentorMapper;
import com.cg.mentorservice.repository.MentorRepository;
import com.cg.mentorservice.service.MentorService;


@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {

    private MentorRepository mentorRepository;

 @Override
 public MentorDto saveMentor(MentorDto mentorDto) {
        Mentor mentor = MentorMapper.mapToMentor(mentorDto);

        Mentor savedMentor = mentorRepository.save(mentor);

MentorDto savedMentorDto = MentorMapper.mapToMentorDto(savedMentor);

        return savedMentorDto;
    }

    @Override
    public MentorDto getMentorById(Long id) {

        Mentor mentor = mentorRepository.findByid(id);

 MentorDto mentorDto = MentorMapper.mapToMentorDto(mentor);

        return mentorDto;
    }
}
