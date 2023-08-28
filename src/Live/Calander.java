package Live;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calander {
	
	public String da()
	{
	Calendar Cal= Calendar.getInstance();
	Cal.add(Calendar.DAY_OF_YEAR, -50);

      Date da=Cal.getTime();
      SimpleDateFormat sdf= new SimpleDateFormat("ddmmyyyy");
      String fdate=sdf.format(da);
      return fdate;
	}
	

}
