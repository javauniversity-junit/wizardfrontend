package com.scr.market.util;
import java.sql.Timestamp;
import java.util.Calendar;

public class CalendarHelper 
{

     public boolean hasExpired(Timestamp startTime, Timestamp endTime) {
       
          Calendar start = Calendar.getInstance();
          start.setTimeInMillis( startTime.getTime() );
        return false; 
     }



}
