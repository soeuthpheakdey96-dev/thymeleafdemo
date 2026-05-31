package com.dev.spring.mvc.thymeleafdemo.Model;

import java.util.ArrayList;

	public class Student {
	
		private String firstname;
	
		private String lastname;
	
		private String Country;
	
		private String countries;
	
		private String favoritelangue;
	
		private String language;
	
		private String favoriteSystem;
	
		private String system;

	public Student() {
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getFavoritelangue() {
		return favoritelangue;
	}

	public void setFavoritelangue(String favoritelangue) {
		this.favoritelangue = favoritelangue;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFavoriteSystem() {
		return favoriteSystem;
	}

	public void setFavoriteSystem(String favoriteSystem) {
		this.favoriteSystem = favoriteSystem;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

}
