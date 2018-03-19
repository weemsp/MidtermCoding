package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		try {
			staffs.add(new Staff("Staff", "Member", "1", new Date(921128400000L), "Somewhere", "(555)555-0001", "example1@example.com", "Only during your classes", 1, 10.0, new Date(), eTitle.MR));
			staffs.add(new Staff("Staff", "Member", "2", new Date(921128400001L), "Somewhere", "(555)555-0002", "example2@example.com", "Only during your classes", 2, 20.0, new Date(), eTitle.MR));
			staffs.add(new Staff("Staff", "Member", "3", new Date(921128400002L), "Somewhere", "(555)555-0003", "example3@example.com", "Only during your classes", 3, 30.0, new Date(), eTitle.MR));
			staffs.add(new Staff("Staff", "Member", "4", new Date(921128400003L), "Somewhere", "(555)555-0004", "example4@example.com", "Only during your classes", 4, 40.0, new Date(), eTitle.MR));
			staffs.add(new Staff("Staff", "Member", "5", new Date(921128400004L), "Somewhere", "(555)555-0005", "example5@example.com", "Only during your classes", 5, 50.0, new Date(), eTitle.MR));
		} catch (PersonException e) {
			fail("Staff constructor used wrong: " + e.getJustWhy());
			
		}
		int totalSalary = 0;
		for (int i = 0; i < staffs.size(); i++) {
			totalSalary += staffs.get(i).getSalary();
		}
		assertEquals(totalSalary / 5, 30.0, 0.0001);
		
		Staff pingas;
		try {
			pingas = new Staff("Snooping", "As", "Usual", new Date(-123456789L), "Irrelevant", "3141592653", "pingas@example.com", "Never", 0, 0.0, new Date(), eTitle.DR);
			fail("Exception not thrown");
		} catch (PersonException e) {
			
		}
	}	

}
