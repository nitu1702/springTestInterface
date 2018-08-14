package com.learning.ka.SpringGoogleCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGoogleCalendarApplication {

	public static void main(String[] args) {
		
		// traditional java way
		
		// EventFetch eventFetching = new EventFetch(new GoogleEvent());
		//EventFetch eventFetching = new EventFetch(new MicroSoftEvent());
		//int retEventCount=eventFetching.eventFetcher("nitu.gupta@fosteringlinux.com");
		//System.out.println("in main, returned event count="+retEventCount);
		
		// spring way
	ApplicationContext applicationContext=SpringApplication.run(SpringGoogleCalendarApplication.class, args);
	EventFetch eventFetching=applicationContext.getBean(EventFetch.class);
	
	int retEventCount=eventFetching.eventFetcher("nitu.gupta@fosteringlinux.com");
	System.out.println("in main, returned event count="+retEventCount);
	
	}
}
