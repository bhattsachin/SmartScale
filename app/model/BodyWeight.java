package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name="bodyweight")
public class BodyWeight extends Model {
	
	@Id
    public String id;
	
	public Double weight;
	public String email;
	public Date timestamp;
	
	public BodyWeight(Double weight, String email, Date timestamp){
		this.weight = weight;
		this.email = email;
		this.timestamp = timestamp;
	}
	
	 public static Finder<String, BodyWeight> find = new Finder<String, BodyWeight>(
             String.class, BodyWeight.class);

	public static List<BodyWeight> findAll() {
	     return find.all();
	}
	
	public static BodyWeight findById(String id) {
	     return find.byId(id);
	}
	
	public static BodyWeight find(){
		 return find.where().eq("email", "ubhack@gmail.com").findUnique();
	}
	
	public static BodyWeight create(Double weight, String email, Date timestamp) {
		BodyWeight e = new BodyWeight(weight, email, timestamp);
	     e.save();
	     return e;
	}

}
