package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	@Test
	public void studenttest(){
		ArrayList<Course> Courselist = new ArrayList<Course>();
		ArrayList<Semester> Semesterlist = new ArrayList<Semester>();
		ArrayList<Section> Sectionlist = new ArrayList<Section>();
		ArrayList<Student> Studentlist = new ArrayList<Student>();
		ArrayList<Enrollment> Enrollmentlist = new ArrayList<Enrollment>();
		UUID PHYS208 = UUID.randomUUID();
		Course Physics = new Course(PHYS208,"Physics 208", 20 );
		UUID CHEM104 = UUID.randomUUID();
		Course Chemistry = new Course(CHEM104, "Chemistry 104", 20);
		UUID PHIL100 = UUID.randomUUID();
		Course Philosophy = new Course(PHIL100, "Philosophy 100", 20);
		Courselist.add(Physics);
		Courselist.add(Chemistry);
		Courselist.add(Philosophy);
		UUID FALL2016 = UUID.randomUUID();
		UUID SPRING2016 = UUID.randomUUID();
		Date Startdate = new Date();
		Date Enddate = new Date();
		Semester Fall = new Semester(FALL2016,Startdate, Enddate);
		Semester Spring = new Semester(SPRING2016,Startdate, Enddate);
		Semesterlist.add(Fall);
		Semesterlist.add(Spring);
		for(Semester se : Semesterlist){
			for (Course c : Courselist) {
				int i = 1;
				Section s = new Section(i);
				Sectionlist.add(s);
				i++;
			}
		}
		
		for(Section s : Sectionlist){
			Student student1 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(75));
			Student student2 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(70));
			Student student3 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(65));
			Student student4 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(60));
			Student student5 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(80));
			Student student6 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(85));
			Student student7 = new Student("a","b","c",  Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(90));
			Student student8 = new Student("a","b","c",  Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(95));
			Student student9 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(100));
			Student student10 = new Student("a","b","c", Startdate, eMajor.BUSINESS, "@USA", "202-316-4376","ABC@gmail.com",Student.setGrade(85));
			Studentlist.add(student1);
			Studentlist.add(student2);
			Studentlist.add(student3);
			Studentlist.add(student4);
			Studentlist.add(student5);
			Studentlist.add(student6);
			Studentlist.add(student7);
			Studentlist.add(student8);
			Studentlist.add(student9);
			Studentlist.add(student10);
			}
		
	
		assertEquals(80.500,(Studentlist.get(0).getGrade()+Studentlist.get(1).getGrade()+Studentlist.get(2).getGrade()+Studentlist.get(3).getGrade()+Studentlist.get(4).getGrade()
				+Studentlist.get(5).getGrade()+Studentlist.get(6).getGrade()+Studentlist.get(7).getGrade()+Studentlist.get(8).getGrade()+Studentlist.get(9).getGrade())/10,5);

		 Studentlist.get(0).setMajor(2);
		 System.out.println(Studentlist.get(0).getMajor(2));
		
		
	}
}
