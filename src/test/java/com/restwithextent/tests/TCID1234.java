package com.restwithextent.tests;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restwithextent.genaric.BaseTest;
import com.restwithextent.utilities.GetResponse;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TCID1234  extends BaseTest
{

	@Test
	public void TCID12345()
	{
	/*	logger = extent.createTest("PostReq", "TC ID : 1234");
		logger.info("PostReq Started");*/
		File jsonBody = new File("./JSONFiles/CreateUser.json");
		RestAssured.baseURI = "https://reqres.in/";
		httprequest = RestAssured.given();
		httprequest.body(jsonBody);
		response = httprequest.request(Method.POST, "/api/users");
		
	    GetResponse getresponse = new GetResponse(response);
		
		int ActualStatusCode = getresponse.getStausCode();
		
			Assert.assertEquals(201, ActualStatusCode);
	

}
	}
