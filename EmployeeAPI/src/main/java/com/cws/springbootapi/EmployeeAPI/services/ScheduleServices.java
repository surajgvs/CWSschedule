package com.cws.springbootapi.EmployeeAPI.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


import com.cws.springbootapi.EmployeeAPI.entities.Schedule;

@Component
public class ScheduleServices {
	
	
	//create schedules as list
	private static Map<Integer,Schedule> map = new HashMap<>();
	
	static{
	
	map.put(905,new Schedule(905,"06 June 2021","07 June 2021",10.00,60,false,"null"));
	map.put(972,new Schedule(972,"03 June 2021","06 June 2021",12.00,70,true,"weekly"));
	map.put(963,new Schedule(963,"11 June 2021","12 June 2021",16.00,80,true,"Monthly"));
	
}

	
	
	//list all schedules
	public List<Schedule> getAllSchedule(){
		 final List<Schedule> l = new ArrayList<>();
		 System.out.println("map "+map);
		 map.forEach((key,value)-> l.add(value) );
		 System.out.println("l "+l);
		 return l;
	}
	
	
	
	//single schedule by id
	public Schedule getSchedulebyId(int Id){
		Schedule sch = null;
		sch = map.get(Id);
		/* sch = list.stream().filter(e->e. getEmployeeid() == Id).findFirst().get(); */
	return   sch;
}
	
	//add schedule in list
	public String addSchedule( Schedule sc ) {
		System.out.print(sc.getScheduleDetails());
		System.out.print(sc.getScheduleDetails().getStartDate());
	map.put(sc.getEmployeeid(), sc);
	return "Successfully added";
}
	
	//cancel schedule by id 

	public String deleteSchedule(int sid) {
		/*
		 * list = list.stream().filter(se -> se.getEmployeeid() !=
		 * sid).collect(Collectors.toList());
		 */
		map.remove(sid);
		return "Successfully Deleted";
	}
    
	//modify or replace schedule by id 
	public String replaceschedule(Schedule sch,int id ) {
		/*
		 * list = (List<Schedule>) list.stream().map(s -> { if(sch.getEmployeeid() ==
		 * id) { s.setStartDate(sch.getStartDate()); s.setEndDate(sch.getEndDate());
		 * s.setTime(sch.getTime()); s.setDuration(sch.getDuration()) ;
		 * s.setRepeat(sch.isRepeat()); s.setFrequency(sch.getFrequency()); } return s;
		 * }).collect(Collectors.toList());
		 */
		map.put(id, sch);
		/*
		 * if(sch.getEmployeeid() == id) { s.setStartDate(sch.getStartDate());
		 * s.setEndDate(sch.getEndDate()); s.setTime(sch.getTime());
		 * s.setDuration(sch.getDuration()) ; s.setRepeat(sch.isRepeat());
		 * s.setFrequency(sch.getFrequency()); } return s;
		 */
				return "Successfully updated";
	}
}

	
