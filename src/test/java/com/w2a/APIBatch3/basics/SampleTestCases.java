package com.w2a.APIBatch3.basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;

public class SampleTestCases extends SetUp {


	

	/*
	 * @Test public void sendGetRequest() {
	 * 
	 * 
	 * APi Name-> List Users URI:-https://reqres.in/api/users?page=2 method
	 * type:-GET Content-Type with header -Optional
	 * 
	 * step1:- send request step2:- store the response step3:- validate the
	 * response
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Response response = get("https://reqres.in/api/users?page=2");
	 * 
	 * // System.out.println(res); response.prettyPrint();
	 * 
	 * // System.out.println(response.asString());
	 * System.out.println("Status code in response:- " + response.statusCode());
	 * System.out.println("Response time:- " + response.getTime());
	 * 
	 * // System.out.println(response.);
	 * 
	 * }
	 */

	// how to send a post request using rest-assured

/*	@Test
	public void sendPostRequest() {
		
		
		
		File f = new File("E:\\Workspace\\APIBatch3\\src\\test\\resources\\payloadJsonFiles\\NewUser.json");

		
		//Response response=given().contentType(ContentType.JSON).body(f).log().all().post("https://reqres.in/api/users");
		
	//	response.prettyPrint();
		RequestSpecification req = given().contentType(ContentType.JSON).body(f).log().all();
		Response response = req.post("users");//https://reqres.in/api/abc

		response.prettyPrint();
		System.out.println(response.statusCode());

	}
	*/
	@Test
	public void deleteACustomer()
	{
		Response response=given().contentType(ContentType.JSON).log().all().delete("users/2");
		response.prettyPrint();
		System.out.println("Status code->"+response.statusCode());
	}
	

	// how to send a put request
	
	 	 	 	

	// how to send a delete request

}

