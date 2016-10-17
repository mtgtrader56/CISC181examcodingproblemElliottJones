package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private int SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double grade;
	
	public Enrollment(int SectionID, UUID StudentID, double grade){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.grade = grade;
	}
	
	public int getSectionID(){
		return this.SectionID;
		
	}
	public UUID getStudentID(){
		return this.StudentID;
		
	}
	public void setSectionID (int SectionID)
    {
        this.SectionID = SectionID;    
    }
	public void setStudentID (UUID StudentID)
    {
        this.StudentID = StudentID;    
    }
	public void setGrade(double grade)
	{
		this.grade = grade;
	}
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID SectionID, UUID StudentID){
		this();
		setEnrollmentID(EnrollmentID);		
	}
	

}
