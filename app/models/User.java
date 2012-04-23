package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.*;

@Entity
@Table(name="blog_user")
public class User extends Model {

	public String email,
					password,
					fullName;
	public boolean isAdmin;
	
	public User(String email, String password, String fullName) {
		this.email = email;
		this.password = password;
		this.fullName = fullName;
	}

	public static User connect(String email, String password) {
		return find("byEmailAndPassword", email, password).first();
	}
}
