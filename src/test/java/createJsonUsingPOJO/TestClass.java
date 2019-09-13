 package createJsonUsingPOJO;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.w2a.APIBatch3.basics.SetUp;

import io.restassured.http.ContentType;

public class TestClass extends SetUp {

	@Test
	public void createUser()
	{
		
		User user = new User("Rahul.jha@gmail.com","Raman","Arora");
		
		user.addTechnologies("C#");
		user.addTechnologies("c");
		user.addTechnologies("abc");
		
		Address address= new Address("s-11","4","New Delhi","Delhi","India",110087);
		user.setAddress(address);
		
		given().contentType(ContentType.JSON).log().body().body(user).post("users");
	}
}
