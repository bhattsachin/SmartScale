package model;

import java.util.Date;

public interface Updateable {
	
	public Effect getUpdate(String emailId,Date currentDate,UserDetails details);

}
