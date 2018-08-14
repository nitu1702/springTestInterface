package com.learning.ka.SpringGoogleCalendar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class MicroSoftEvent implements ExtEvents {

	public int extEventFetcher(String email) {
		// call microsoft api to get events based on input mail
		System.out.println("Fetching events for "+ email+"...Calling MS API");
		
		//hardcoding response as of now
		return 13;
	}
}
