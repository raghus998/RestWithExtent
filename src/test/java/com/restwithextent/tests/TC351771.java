package com.restwithextent.tests;

import java.io.File;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC351771 {
	
	@Test
	public void Test351771()
	{
		int expectedStatusCode = 200;
		
		File jsonBody = new File("./Data/351771.json");

		RestAssured.baseURI = "https://greenwayapiqa.greenwayhealth.com/RESTv1.0/PrimeSuiteAPIService/";
		RequestSpecification httprequest = RestAssured.given();
		httprequest.body(jsonBody);
		httprequest.header("Content-Type", "application/json");
		 Response response = httprequest.request(Method.POST, "Patient/PatientDemographicsSummaryGet?api_key=bk7txvs8j6ksdmahm6h4fsbn");
		 
		//GetResponse getresponse = new GetResponse(response);

		//int actualStatusCode = getresponse.getStausCode();
		 int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(actualStatusCode, expectedStatusCode);
		Reporter.log("Actual Status code is : " + actualStatusCode + "Expected Status Code is : " + expectedStatusCode,true);

	}

}
