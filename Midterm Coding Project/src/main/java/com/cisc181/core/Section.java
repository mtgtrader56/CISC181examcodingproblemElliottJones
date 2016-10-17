package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private int SectionID;
	private UUID RoomID;
	
	public Section(int SectionID){
		this.SectionID = SectionID;
	}

	public Section ( UUID CourseID, UUID SemesterID, int SectionID, UUID RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}
	public UUID getCourseID(){
		return this.CourseID;
		
	}
	public UUID getSemesterID(){
		return this.SemesterID;
		
	}
	public int getSectionID(){
		return this.SectionID;
		
	}
	public UUID getRoomID(){
		return this.RoomID;
		
	}
	
	public void setCourseID (UUID CourseID)
    {
        this.CourseID = CourseID;    
    }
	
	public void setSemesterID (UUID SemesterID)
    {
        this.SemesterID = SemesterID;    
    }
	
	public void setSectionID (int SectionID)
    {
        this.SectionID = SectionID;    
    }
	
	public void setRoomID (UUID RoomID)
    {
        this.RoomID = RoomID;    
    }
	

}
