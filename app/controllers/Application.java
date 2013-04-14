package controllers;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

import model.BodyWeight;
import model.UserDetails;
import model.UserWeight;
import model.Util;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result index() {
		//return ok("welcome to UB Hackathon");
		//return ok(views.html.index1.render(null));
		return ok("ok");
	}

	public static Result createProfile() {
		BodyWeight weight = new BodyWeight(new Double(65), "ubhack@gmail.com", Util.getCurrentTimeStamp());
		weight.save();
		return ok("added");
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
		BodyWeight bd = new BodyWeight(Double.parseDouble(weight), "ubhacks@gmail.com",Util.getCurrentTimeStamp());
		bd.save();
		return ok("Weight updated");
	}
	
	public static Result getConfiguration(){
		return ok(views.html.configure.render());
	}
	
	public static Result getToday(){
		//generate random number every request
		//generate a tip
		double weight = (Math.random()*10 + 65);
		String tip = null;
		if(weight>70){
			tip = "Exercise next week";
		}else{
			tip = "You are doing good";
		}
		DecimalFormat f = new DecimalFormat("00.0");
		return ok(views.html.today.render(String.valueOf(f.format(weight)), tip));
	}
	
	public static Result getProfile(){
		
		return ok(views.html.profile.render());
	}
	
	public static Result getFeed(){
		//feed page
		return ok(views.html.feed.render());
	}
	
	
	public static Result fetch(String start,String end) throws NumberFormatException, ParseException {
		Date startDate = Util.getCurrentTimeStampFromString(start);
		Date endDate = Util.getCurrentTimeStampFromString(end);
		UserDetails.findByEmail("ubhacks@gmail.com");
		return ok("Target updated");
	}
	
}