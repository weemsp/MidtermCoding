package com.cisc181.core;
import java.util.UUID;

public class Section {
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
	public Section(UUID course, UUID semester, int room) {
		SectionID = UUID.randomUUID();
		SemesterID = semester;
		CourseID = course;
		RoomID = room;
	}
	
	public Section(Course course, Semester semester, int room) {
		SectionID = UUID.randomUUID();
		SemesterID = semester.getID();
		CourseID = course.getID();
		RoomID = room;
	}
	
	public UUID getID() {
		return SectionID;
	}
}
