package com.cws.springbootapi.EmployeeAPI.entities;

public class Schedule {

	private Integer employeeid;
	private String startDate;
	private String endDate;
	private Double time;
	private Integer duration;
	private boolean repeat;
	private String frequency;

	public Schedule(Integer employeeid, String startDate, String endDate, Double time, Integer duration,
			boolean repeat, String frequency) {
		super();
		this.employeeid = employeeid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.time = time;
		this.duration = duration;
		this.repeat = repeat;
		this.frequency = frequency;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "ScheduleEntities [employeeid=" + employeeid + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", time=" + time + ", duration=" + duration + ", repeat=" + repeat + ", frequency=" + frequency + "]";
	}

}
