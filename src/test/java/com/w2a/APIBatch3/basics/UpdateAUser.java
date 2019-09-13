package com.w2a.APIBatch3.basics;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class UpdateAUser extends SetUp {

	@Test
	public void updateUserInfo() {
		String endPoint = "users/1";
		File f = new File("E:\\Workspace\\APIBatch3\\src\\test\\resources\\payloadJsonFiles\\UpdatedUserInfo.json");

		Response response = given().contentType(ContentType.JSON).body(f).put(endPoint);

		response.prettyPrint();
		//System.out.println(response);
	}

}
