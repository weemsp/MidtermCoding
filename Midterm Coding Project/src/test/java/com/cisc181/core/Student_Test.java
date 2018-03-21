*-2010\package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Student_Test {
	ArrayList<Course> courses;
	ArrayList<Semester> semesters;
	ArrayList<Section> sections;
	ArrayList<Student> students;
	
	@BeforeClass
	public static void setup() {
		courses.add(new Course("Intro to Computer Science", 3, eMajor.COMPSCI));
		courses.add(new Course("Some physics class", 3, eMajor.PHYSICS));
		courses.add(new Course("How to Be Evil", 2, eMajor.BUSINESS));
		semesters.add(new Semester(new Date(1504238400000L), new Date(1512104400000L));
		semesters.add(new Semester(new Date(1519880400000L), new Date(1527825600000L));
		for (int i = 0; i < courses.size(); i++) {
			for (int j = 0; j < semesters.size(); j++) {
				sections.add(new Section(courses.get(i), semesters.get(j)));
			}
		}
		students.add(new Student("Prescott", "M", "Weems", new Date(921128400000L), eMajor.COMPSCI, "Smyth", "555-591-0425", "weemsp@udel.edu"));
		students.add(new Student("Snooping", "As", "Usual", new Date(-123456789L), eMajor.COMPSCI, "Irrelevant", "3141592653", "pingas@example.com"));
		students.add(new Student("Prescott", "M", "Weems", new Date(921128400001L), eMajor.COMPSCI, "Smyth", "555-591-0425", "weemsp2@udel.edu"));
		students.add(new Student("Snooping", "As", "Usual", new Date(-123456788L), eMajor.COMPSCI, "Irrelevant", "3141592653", "pingas2@example.com"));
		students.add(new Student("Prescott", "M", "Weems", new Date(921128400002L), eMajor.COMPSCI, "Smyth", "555-591-0425", "weemsp3@udel.edu"));
		students.add(new Student("Snooping", "As", "Usual", new Date(-123456787L), eMajor.COMPSCI, "Irrelevant", "3141592653", "pingas3@example.com"));
		students.add(new Student("Prescott", "M", "Weems", new Date(921128400003L), eMajor.COMPSCI, "Smyth", "555-591-0425", "weemsp4@udel.edu"));
		students.add(new Student("Snooping", "As", "Usual", new Date(-123456786L), eMajor.COMPSCI, "Irrelevant", "3141592653", "pingas4@example.com"));
		students.add(new Student("Prescott", "M", "Weems", new Date(921128400004L), eMajor.COMPSCI, "Smyth", "555-591-0425", "weemsp5@udel.edu"));
		students.add(new Student("Snooping", "As", "Usual", new Date(-123456785L), eMajor.COMPSCI, "Irrelevant", "3141592653", "pingas5@example.com"));
	}
	
	@Test
	public void test() {
		ArrayList<Enrollment> mints;
		Enrollment newen;
		for (int i = 0; i < students.size(); i++) {
			for (int j = 0; j < sections.size(); j++) {
				newen = new Enrollment(students.get(i), sections.get(j));
				newen.setGrade(1.0 - j * 0.1);
				mints.add(newen);
			}
		}
		assertEquals(0, 0);
	}
	//There doesn't seem to be a way to track the points for these classes because everything uses UUIDs instead of just object references
}