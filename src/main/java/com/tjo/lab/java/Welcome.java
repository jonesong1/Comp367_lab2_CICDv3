package com.tjo.lab.java;
/*
 * Author: Timothy Jones Ong 300983486
 * COMP367 Lab 2
 * Date started: Oct 26, 2022
 */

import java.util.Calendar;

public class Welcome {
	// declare variables
	private final String NAME = "Timothy Jones Ong";
	private String timePeriod;
	private final String MORNING = "Good morning, ";
	private final String AFTERNOON = "Good afternoon, ";
	private final String EVENING = "Good evening, ";
	
	// methods
	public String getSetTimePeriod() {
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY);
		if (hour >= 18) {
			timePeriod = EVENING;
        } else if (hour >= 12) {
        	timePeriod = AFTERNOON;
        } else {
        	timePeriod = MORNING;
        }
		return timePeriod;
	}
	
	// getter
	public String getNAME() {
		return NAME;
	}
	public String getTimePeriod() {
		return timePeriod;
	}
	
}
