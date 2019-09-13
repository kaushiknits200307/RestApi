package jsonCreation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.w2a.APIBatch3.basics.SetUp;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Method2 extends SetUp {

	@Test
	public void sendPostRequestUsingHashMapJson() {

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Rahul");
		map.put("job", "trainer");
		map.put("designation", "TL");

		List<String> list = new ArrayList<String>();
		list.add("c++");
		list.add("java");
		map.put("technology", list);
		
		given().contentType(ContentType.JSON).log().body().body(map).post("users");
		

		/*
		 * System.out.println(map);
		 * 
		 * ArrayList<String> listOftechnology=new ArrayList<String>();
		 * listOftechnology.add("c++"); listOftechnology.add("java");
		 * map.put("technology", listOftechnology.toString());
		 * System.out.println(map);
		 */

	}

}
