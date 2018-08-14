package com.learning.ka.SpringGoogleCalendar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// making google api as primary bean
//@Primary
@Component
public class GoogleEvent implements ExtEvents {
	
	public int extEventFetcher(String email) {
		// call google api to get events based on input mail
		System.out.println("Fetching events for "+ email+"...Calling google API");
		
		//hardcoding response as of now
		return 7;
	}

}
