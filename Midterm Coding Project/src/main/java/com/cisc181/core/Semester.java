package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(Date start, Date end) {
		SemesterID = UUID.randomUUID();
		StartDate = start;
		EndDate = end;
	}
	
	public UUID getID() {
		return SemesterID;
	}
}

