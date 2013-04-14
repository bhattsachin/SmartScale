package model;

import java.util.Date;

import play.db.ebean.Model;
import javax.persistence.Entity;

import java.util.*;

import javax.persistence.*;

import org.apache.commons.lang3.RandomStringUtils;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="userdetails")
public class UserDetails extends Model {

	public static Model.Finder<String, UserDetails> find = new Finder<String, UserDetails>(
            String.class, UserDetails.class);

	
	@Id
	public String emailID;

	@Constraints.Required
	@Formats.NonEmpty
	public UserWeight Weight;

	@Constraints.Required
	@Formats.NonEmpty
	public long targetWeight;

	public Date startDate;
	public Date endDate;

	public UserWeight getWeight() {
		return Weight;
	}
	public void setWeight(UserWeight weight) {
		Weight = weight;
	}
	public long getTargetWeight() {
		return targetWeight;
	}
	public void setTargetWeight(long targetWeight) {
		this.targetWeight = targetWeight;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}	
	
	public UserDetails(String emailID, UserWeight weight, long targetWeight,
			Date startDate, Date endDate) {
		super();
		this.emailID = emailID;
		Weight = weight;
		this.targetWeight = targetWeight;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public static UserDetails update(String emailID, long weight, long targetWeight,
			Date startDate, Date endDate){
		
		UserWeight uwt = new UserWeight(emailID, Util.getCurrentTimeStamp(), targetWeight);
		UserDetails userDetails = new UserDetails(emailID, uwt, targetWeight, startDate, endDate);
		userDetails.update();
		return userDetails;
	}
	
	public static UserDetails create(String emailID, UserWeight weight, long targetWeight,
			Date startDate, Date endDate){
		UserDetails userDetails = new UserDetails(emailID, weight, targetWeight, startDate, endDate);
		userDetails.save();
		return userDetails;
	}
	
	public static UserDetails findByEmail(String email) {
		return find.where().eq("emailID", email).findUnique();
	}
	
	@Override
	public String toString() {
		return this.getWeight() + " : "  + this.Weight.getWeight() + ":" + this.getTargetWeight(); 
	}
	

}
