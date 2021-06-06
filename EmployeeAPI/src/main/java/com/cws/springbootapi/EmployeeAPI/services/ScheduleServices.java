package com.cws.springbootapi.EmployeeAPI.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.cws.springbootapi.EmployeeAPI.entities.Schedule;

@Component
public class ScheduleServices {
	
	
	//create schedules as list
	private static List<Schedule> list = new ArrayList<>();
	
	static{
	
	list.add(new Schedule(905,"06 June 2021","07 June 2021",10.00,60,false,"null"));
	list.add(new Schedule(972,"03 June 2021","06 June 2021",12.00,70,true,"weekly"));
	list.add(new Schedule(963,"11 June 2021","12 June 2021",16.00,80,true,"Monthly"));
	
}
	//list all schedules
	public List<Schedule> getAllSchedule(){
		
		return list;
	}
	
	//single schedule by id
	public Schedule getSchedulebyId(int Id){
		Schedule sch = null;
		sch = list.stream().filter(e->e. getEmployeeid() == Id).findFirst().get();
		
		
	return   sch;
}
	
	//add schedule in list
	public Schedule addSchedule(@RequestBody Schedule sc) {
	list.add(sc);
	return sc;
}
	
	//cancel schedule by id 
	public void deleteSchedule(int sid) {
		list = list.stream().filter(se -> se.getEmployeeid() != sid).collect(Collectors.toList());
}
       
	//modify or replace schedule by id 
	public void replaceschedule(Schedule sch, int id) {
		list = (List<Schedule>) list.stream().map(s -> {
			if(sch.getEmployeeid() == id) {
				s.setStartDate(sch.getStartDate());
				s.setEndDate(sch.getEndDate()); 
				s.setTime(sch.getTime()); 
				s.setDuration(sch.getDuration()) ;
				s.setRepeat(sch.isRepeat());
				s.setFrequency(sch.getFrequency()); 
			}
				return s;
		}).collect(Collectors.toList());

	
}
