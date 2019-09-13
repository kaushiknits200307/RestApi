package jsonCreation;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import com.w2a.APIBatch3.basics.SetUp;

import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Method1 extends SetUp {

	@Test
	public void createdUser() {

		String jsonBody=Method1.createJson();
		
		Response response=given().contentType(ContentType.JSON).body(jsonBody).log().all().post("users");

		System.out.println("============================================");
		//response.prettyPrint();
	}

	public static String createJson() {
		
		JSONArray array= new JSONArray();
		

		JSONObject json = new JSONObject();

		json.put("name", "Rahul");
		json.put("job", "Developer");
		json.put("designation", "Team Lead");

		JSONArray jsonArray = new JSONArray();
		jsonArray.put("c++");
		jsonArray.put("java");
		jsonArray.put("python");

		json.put("technology", jsonArray);

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("city", "New Delhi");
		jsonObj.put("countyr", "India");

		json.put("address", jsonObj);
		
		
		JSONObject json1 = new JSONObject();

		json1.put("name", "Raman");
		json1.put("job", "Trainer");
		json1.put("designation", "director");

		JSONArray jsonArray1 = new JSONArray();
		jsonArray1.put("selenium");
		jsonArray1.put("appium");
		jsonArray1.put("protractor");

		json1.put("technology", jsonArray1);

		JSONObject jsonObj1 = new JSONObject();
		jsonObj1.put("city", "Noida");
		jsonObj1.put("countyr", "India");

		json1.put("address", jsonObj1);
		
		array.put(json);
		array.put(json1);
		
		System.out.println(array);	
		return array.toString();

	}

}
