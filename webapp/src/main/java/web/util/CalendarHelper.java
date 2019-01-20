package web.util;
import java.sql.Timestamp;
import java.util.*;
import java.text.*;

public class CalendarHelper 
{

     public static boolean hasExpired(Timestamp startTime, Timestamp endTime) {
          SimpleDateFormat dateFormat = new SimpleDateFormat(
            "yyyy-MM-dd hh:mm:ss");
       
          Calendar start = Calendar.getInstance();
          start.setTimeInMillis( startTime.getTime() );
          
          System.out.println(" cal start "  + dateFormat.format(start.getTime()));
          
          Calendar end = Calendar.getInstance();
          end.setTimeInMillis( endTime.getTime() );
           System.out.println(" cal end "  +dateFormat.format(end.getTime()));
          
          Calendar currentTime = Calendar.getInstance();
          
          
          
           boolean isCurrentTimeAfterStartTime = currentTime.after(start);
          boolean isCurrentTimeBeforEndTime  = currentTime.before(end);
          
          System.out.println("currentTime.after(start) " + isCurrentTimeAfterStartTime);
          System.out.println("currentTime.before(end) " + isCurrentTimeBeforEndTime);
          
          boolean expired = true;
          if (isCurrentTimeAfterStartTime &&  isCurrentTimeBeforEndTime) {
              return false;
          }
   
          
        return expired; 
   
         
     }



}
