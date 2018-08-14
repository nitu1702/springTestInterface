package com.learning.ka.SpringGoogleCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventFetch {
	
	// making interface instance
	@Autowired
	private ExtEvents extEvent;
	
	// making constructor taking interface as input
	public EventFetch (ExtEvents extEvent)
	{
		this.extEvent=extEvent;
	}
	
	
		// returns count of events based on mail
		public int eventFetcher(String email) {
			//return null;
			// can fetch from google, microsoft
			// return 3;
			
			//GoogleEvent googleEvent = new GoogleEvent();
			//int eventCount= googleEvent.extEventFetcher("nitu.gupta@fosteringlinux.com");
			
			//MicroSoftEvent msEvent = new MicroSoftEvent();
			//int eventCount= msEvent.extEventFetcher("nitu.gupta@fosteringlinux.com");
			
			
			//using interface
			int eventCount= extEvent.extEventFetcher("nitu.gupta@fosteringlinux.com");
			System.out.println(extEvent);
			
			return eventCount;
			
			
		}

	}

