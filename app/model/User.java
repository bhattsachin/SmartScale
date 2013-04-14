package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
@Table(name="user")
public class User extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Finder<String, User> find = new Finder<String, User>(String.class, User.class);
	
	@Id
	public String emailId;

	@Constraints.Required
	@Formats.NonEmpty
	public String passWord;

	public String firstName;

	public String LastName;

	public User() {
		super();
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public static List<User> findAll() {
		return find.all();
	}

	
	public User(String emailId, String passWord, String firstName,
			String lastName) {
		super();
		this.emailId = emailId;
		this.passWord = passWord;
		this.firstName = firstName;
		LastName = lastName;
	}


	public static User create(String emailId, String passWord, String firstName,
			String lastName){
		User user = new User(emailId,passWord,firstName,lastName);
		user.save();
		return user;
	}

}


