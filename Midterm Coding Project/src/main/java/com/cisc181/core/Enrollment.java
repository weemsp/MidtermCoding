package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public Enrollment(Student Student, Section Section) {
		this.StudentID = Student.getID();
		this.SectionID = Section.getID();
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public void SetGrade(double grade) {
		Grade = grade;
	}
	
	public double GetGrade() {
		return Grade;
	}
}
