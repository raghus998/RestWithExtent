package com.restwithextent.utilities;

import org.testng.Reporter;

import io.restassured.response.Response;

public class GetResponse 
{
	public Response response;

	public GetResponse(Response response)
	{
		this.response = response;
	}
	
	
	
	public String getResponseBody()
	{
		String responseBody = response.getBody().asString();
		Reporter.log("Response Body is : "+responseBody,true);
		return responseBody;
	}
	
	public int getStausCode()
	{
		int statusCode = response.getStatusCode();
		Reporter.log("Status Code is :"+statusCode,true);
		return statusCode;
	}
	
	public String getStatusLine()
	{
		String statusLine = response.getStatusLine();
		Reporter.log("Status Line is :"+statusLine,true);
		return statusLine;
	}
	
	
	/*//Verify response Body city node
	 String city = response.jsonPath().get("City").toString();
	System.out.println(city);
	Assert.assertEquals(city, "Hyderabad");
	 
		 JsonPath JSONEVE = response.jsonPath();
		 Object data = JSONEVE.get("ad");
		 System.out.println(data);
		 
		 
		 //6. get the headers:
		Headers headers = response.getHeaders();
		System.out.println(headers);
		
		String contentType = response.getHeader("Content-Type");
		System.out.println("the value of content-type header is: "+ contentType);
		
		String contentLength = response.getHeader("Content-Length");
		System.out.println("the value of Content-Length header is: "+ contentLength);

		//get the key value by using JsonPath:
		JsonPath jsonPathValue = response.jsonPath();
		String cityVal = jsonPathValue.get("City");
		System.out.println("the value of city is: "+ cityVal);
		
		Assert.assertEquals(cityVal, city);
		
		String temp = jsonPathValue.get("Temperature");
		System.out.println("the value of Temperature is: "+ temp);
		Assert.assertEquals(temp, temperature);


		String Humidity = jsonPathValue.get("Humidity");
		System.out.println("the value of Humidity is: "+ Humidity);

		String WeatherDescription = jsonPathValue.get("WeatherDescription");
		System.out.println("the value of WeatherDescription is: "+ WeatherDescription);

		String WindSpeed = jsonPathValue.get("WindSpeed");
		System.out.println("the value of WindSpeed is: "+ WindSpeed);

		String WindDirectionDegree = jsonPathValue.get("WindDirectionDegree");
		System.out.println("the value of WindDirectionDegree is: "+ WindDirectionDegree);

		
	*
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
