package com.cws.springbootapi.EmployeeAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cws.springbootapi.EmployeeAPI.entities.Schedule;
import com.cws.springbootapi.EmployeeAPI.services.ScheduleServices;

@RestController
public class ScheduleController {
	
	
	/*
	 * @RequestMapping(value = "/sched", method = RequestMethod.GET) public Schedule
	 * getSchedules() { Schedule se = new Schedule(null, null, null, null,
	 * null,false, null); se.setEmployeeid(905972); se.setStartDate("03 June 2021");
	 * se.setEndDate("O7 June 2021"); se.setTime(10.00); se.setDuration(10);
	 * se.setRepeat(true); se.setFrequency("Daily"); return se; }
	 */

   @Autowired
   private ScheduleServices schservice;
     
   @GetMapping("/schedules")
   public List<Schedule> listschedules(){
	   return  this.schservice.getAllSchedule();
   }
   
   @GetMapping("/schedules/{id}")
   public Schedule singleschedule(@PathVariable("id") int id) {
	   
	   return schservice.getSchedulebyId(id);
   }
   
   @PostMapping("/schedules")
   public String  postschedule(@RequestBody Schedule schedule) {
	   return  this.schservice.addSchedule(schedule);

   }
   
  @DeleteMapping("/schedules/{id}")
public void cancelschedule(@PathVariable("id") int id) {
	  this.schservice.deleteSchedule(id);
  }
  

  @PutMapping("/schedules/{id}")
  public String updateschedule(@RequestBody Schedule sc,@PathVariable("iD") int iD) {
                  return  this.schservice.replaceschedule(sc,iD); 
                     
  } 
 
}