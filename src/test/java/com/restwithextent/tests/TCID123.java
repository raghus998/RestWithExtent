package com.restwithextent.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restwithextent.genaric.BaseTest;
import com.restwithextent.utilities.GetResponse;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TCID123  extends BaseTest
{
	@Test
	public void TCID1234()
	{
		/*logger = extent.createTest("GetReq", "TC ID : 123");
		logger.info("GetReq Started");*/
		RestAssured.baseURI = "https://reqres.in/";
		httprequest = RestAssured.given();
		response = httprequest.request(Method.GET, "api/users?page=2");
		
		GetResponse getresponse = new GetResponse(response);
		
		int ActualStatusCode = getresponse.getStausCode();
		
			Assert.assertEquals(200, ActualStatusCode);
			

		
	}
}
