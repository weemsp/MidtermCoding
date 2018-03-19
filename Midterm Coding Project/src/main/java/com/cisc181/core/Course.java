package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(String name, int points, eMajor major) {
		CourseID = UUID.randomUUID();
		CourseName = name;
		GradePoints = points;
		Major = major;
	}
	
	public UUID getID() {
		return CourseID;
	}
}
