package com.cg.mentorservice.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.service.MentorService;

@RestController
@RequestMapping("api/mentors")
@AllArgsConstructor
public class MentorController {

    private MentorService mentorService;


@PostMapping
public ResponseEntity<MentorDto> saveMentor(@RequestBody MentorDto mentorDto){
MentorDto savedMentor = mentorService.saveMentor(mentorDto);
return new ResponseEntity<>(savedMentor, HttpStatus.CREATED);
    }

 @GetMapping("{Id}")
  public ResponseEntity<MentorDto> getMentor(@PathVariable("Id") Long id){
  MentorDto mentorDto = mentorService.getMentorById(id);
   return new ResponseEntity<>(mentorDto, HttpStatus.OK);
    }
}
