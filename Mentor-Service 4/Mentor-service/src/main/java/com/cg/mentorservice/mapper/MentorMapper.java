package com.cg.mentorservice.mapper;

import java.util.Optional;

import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.entity.Mentor;

public class MentorMapper {

    public static MentorDto mapToMentorDto(Mentor mentor){
        MentorDto mentorDto = new MentorDto(
                mentor.getId(),
                mentor.getMentorName(),
                mentor.getCourseName(),
                mentor.getStartDate(),
                mentor.getEndDate(),
                mentor.getHours()
        );
        return mentorDto;
    }

    public static Mentor mapToMentor(MentorDto mentorDto){
        Mentor mentor = new Mentor(
                mentorDto.getId(),
                mentorDto.getMentorName(),
                mentorDto.getCourseName(),
                mentorDto.getStartDate(),
                mentorDto.getEndDate(),
                mentorDto.getHours()
        );
        return mentor;
    }
}
