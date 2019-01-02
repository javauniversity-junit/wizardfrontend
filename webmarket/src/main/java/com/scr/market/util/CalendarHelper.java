package com.scr.market.util;
import java.sql.Timestamp;
import java.util.Calendar;

public class CalendarHelper 
{

     public boolean hasNotExpired(Timestamp startTime, Timestamp endTime) {
       
          Calendar start = Calendar.getInstance();
          start.setTimeInMillis( startTime.getTime() );
          
          Calendar end = Calendar.getInstance();
          start.setTimeInMillis( endTime.getTime() );
          
          Calendar currentTime = Calendar.getInstance();
          
          boolean expired = currentTime.after(startTime) && currentTime.before(endTime);
   
          
        return expired; 
     }



}
