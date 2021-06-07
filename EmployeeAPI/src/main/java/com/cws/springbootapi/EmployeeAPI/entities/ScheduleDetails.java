package com.cws.springbootapi.EmployeeAPI.entities;

public class ScheduleDetails {

	private String startDate;
	private String endDate;
	private Double time;
	private Integer duration;
	private boolean repeat;
	private String frequency;
	

	public ScheduleDetails(String startDate, String endDate, Double time, Integer duration, boolean repeat,
			String frequency) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.time = time;
		this.duration = duration;
		this.repeat = repeat;
		this.frequency = frequency;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getEndDate() {
		return endDate;
	}

	public Double getTime() {
		return time;
	}

	public Integer getDuration() {
		return duration;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	


}
