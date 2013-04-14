package controllers;

import java.text.ParseException;
import java.util.Date;

import model.User;
import model.UserDetails;
import model.UserWeight;
import model.Util;
import play.mvc.*;

public class Application extends Controller {

	public static Result index() {
		//return ok("welcome to UB Hackathon");
		//return ok(views.html.index1.render(null));
		return ok("ok");
	}

	public static Result createProfile() {
		User.create("ubhacks@gmail.com", "AkcisRi", "Arnab", "Goswami");
		//return bit("welcome to Smart weight");
		return ok("ok");
		
	}

	
	public static Result accessProfile(String emailID) {
		UserDetails udetails = UserDetails.findByEmail(emailID);
		if(udetails == null) {
			UserWeight uWt = UserWeight.findByEmail(emailID);
			return ok(uWt.toString());
		}
		else {
			return ok(udetails.toString());
		}
		

	}

	public static Result update(String weight) {
		UserWeight.create("ubhacks@gmail.com",Util.getCurrentTimeStamp() , Long.parseLong(weight));
		return ok("Weight updated");
	}
	
	
	public static Result fetch(String start,String end) throws NumberFormatException, ParseException {
		Date startDate = Util.getCurrentTimeStampFromString(start);
		Date endDate = Util.getCurrentTimeStampFromString(end);
		UserDetails.findByEmail("ubhacks@gmail.com");
		return ok("Target updated");
	}
	
}