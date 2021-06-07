package com.cws.springbootapi.EmployeeAPI.entities;

/*import java.time.LocalDate;
import java.time.LocalTime;*/
import java.util.HashMap;
import java.util.Map;

public class Schedule {

	private Integer employeeid;
	
	private  ScheduleDetails schedule;


      
	public Schedule(Integer employeeid, String startDate, String endDate, Double time, Integer duration,
			boolean repeat, String frequency) {
		super();
		 this.employeeid = employeeid; 
		 schedule = new ScheduleDetails(startDate,endDate,time,duration,repeat,frequency);
		 
	}

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	
	
	

	public ScheduleDetails getScheduleDetails() {
		return schedule;
	}

	public void setScheduleDetails(ScheduleDetails schedule) {
		this.schedule = schedule;
	}


	@Override
	public String toString() {
		return "Schedule [employeeid=" + employeeid + ", schedule=" + schedule + "]";
	}
	
	
	


}
