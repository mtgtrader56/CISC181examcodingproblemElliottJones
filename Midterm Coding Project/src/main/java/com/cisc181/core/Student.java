package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	private static double Grade;
	
	public eMajor getMajor (int i)
    {
        return eMajor.values()[i];
    }
    public eMajor setMajor (int i)
    {
       eMajor.values()[i] = Major;  
       return Major;
       
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
    public double getGrade(){
    	return this.Grade;
    }
    
    public static double setGrade(double grade){
    	Grade = grade;
    	return grade;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email, double Grade)
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}