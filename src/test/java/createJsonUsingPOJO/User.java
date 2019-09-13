package createJsonUsingPOJO;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	
	public String email;
	public String firstName;
	public String lastName;
	
	public List<String> technologies;
	
	public Address address;
	
	
	public User(String email,String firstName,String lastName)
	{
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		technologies= new ArrayList<String>();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	
	public void addTechnologies(String technology)
	{
		this.technologies.add(technology);
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	

}
