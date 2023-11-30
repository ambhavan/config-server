package com.cg.mentorservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MentorDto {
	private Long id;
	private String mentorName;
	private String courseName;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private int hours;
 
}
