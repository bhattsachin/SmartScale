package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DAO implements Updateable {
	
		Map<String,UserDetails> userDetailMap;
		Map<String,Status> statusMap;
		
		private DAO () {
			userDetailMap = new HashMap<String, UserDetails>();
			statusMap = new HashMap<String,Status>();
		}
		
		public static void getDAOInstance() {
			
		}
		
		public void populateUserDetails (String uID,UserDetails uDetails) {
			userDetailMap.put(uID, uDetails);
		}	
		
		public void populateGetUserDetails (String uID,UserDetails uDetails) {
			userDetailMap.put(uID, uDetails);
		}	
		
		public void populateUserStauts (String uID) {
			statusMap.get(uID);
		}
		
		public void getUserStatus (String uID) {
			statusMap.get(uID);
		}

		
		@Override
		public Effect getUpdate(String emailId,Date currentDate,UserDetails userDetails) {
		
			return Effect.GREEN;
		}
		
		
	
}
