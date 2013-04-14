package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
@Table(name="userweight")
public class UserWeight extends Model{

	public static Model.Finder<String, UserWeight> find = new Finder<String, UserWeight>(
            String.class, UserWeight.class);
	
	@Id
	public String emailID;
	
	public Date timeStamp;
	
	@Constraints.Required
	@Formats.NonEmpty
	public long weight;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = Util.getCurrentTimeStamp();
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}
	
	public static UserWeight findByEmail(String email) {
		return find.where().eq("emailID", email).findUnique();
	}
	
	@Override
	public String toString() {
		return  this.getEmailID() + ":" + this.getWeight(); 
	}
	
	
	public UserWeight(String emailID, Date timeStamp, long weight) {
		super();
		this.emailID = emailID;
		this.timeStamp = timeStamp;
		this.weight = weight;
	}

	public static UserWeight create(String emailID, Date timeStamp, long weight){
		UserWeight uWt = new UserWeight("ubhacks@gmail.com", Util.getCurrentTimeStamp(), weight);
		uWt.save();
		return uWt;
	}
	
	
}
