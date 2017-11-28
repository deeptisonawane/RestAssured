package com.test;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class RestClient 
{
	//----------------REST---------------------//
	String restURL="https://reqres.in/api/users";
	String restType="application/json";
	String restBody="{\r\n    \"name\": \"morpheus\",\r\n    \"job\": \"leader\"\r\n}";

	//----------------SOAP---------------------//
	String soapURL="http://www.webservicex.com/globalweather.asmx";
	String soapType="text/xml";
	String soapBody="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <web:GetCitiesByCountry>\r\n         <!--Optional:-->\r\n         <web:CountryName>Nepal</web:CountryName>\r\n      </web:GetCitiesByCountry>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>";

	@Test(priority=1)
	public void restScript()
	{
		RestAssured.baseURI=restURL;
		RestAssured.
		given().
		contentType(restType).
		body(restBody).
		when().post("").
		then().statusCode(201);
	}

	@Test(priority=2)
	public void soapScript()
	{
		RestAssured.baseURI=soapURL;
		RestAssured.
		given().
		contentType(soapType).
		body(soapBody).
		when().post("").
		then().statusCode(200);
	}

}
