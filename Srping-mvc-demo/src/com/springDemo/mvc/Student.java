package com.springDemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private ArrayList<String> favoriteOS;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String,String> favoriteLanguageOptions;
	private LinkedHashMap<String,String> favoriteOSOptions;
	
	public Student() {
		//populate country option: used ISO country code
		
		 populatetLinkedHashMap();
		
	}
	
	public void  populatetLinkedHashMap()
	{
		populatetOsOptions();
		populateContryOptions();
		 populatePogrammingLanguageOptions();
	}
	
	public void populatetOsOptions()
	{
		favoriteOSOptions = new LinkedHashMap<>();
		favoriteOSOptions.put("Windows", "Windows");
		favoriteOSOptions.put("Linux", "Linux");
		favoriteOSOptions.put("Mac OS", "Mac OS");

	}
	public void populateContryOptions()
	{
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
		countryOptions.put("RO","Romania");
		countryOptions.put("US","United States of America");
		
	}
	public void populatePogrammingLanguageOptions()
	{
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("C++", "C++");
		favoriteLanguageOptions.put("Ruby", "Ruby");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public ArrayList<String> getFavoriteOS() {
		return favoriteOS;
	}

	public void setFavoriteOS(ArrayList<String> favoriteOS) {
		this.favoriteOS = favoriteOS;
	}

	public LinkedHashMap<String, String> getFavoriteOSOptions() {
		return favoriteOSOptions;
	}
	
	

}
