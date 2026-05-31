package com.dev.spring.mvc.thymeleafdemo.Model;

import com.dev.spring.mvc.thymeleafdemo.validation.CourseCode;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
	
	
	@NotNull(message="Please enter your PhoneNumber")
	@Size(min=1, message="Please enter your fullname")
	private String fullname;
	
	@NotNull(message="Please enter your PhoneNumber")
	@Size(min=1, message="Please enter your password")
	private String password;
	
	@NotNull(message="Please enter your PhoneNumber")
	@Size(min=1, message="Please enter your email")
	private String email;
	@NotNull(message="Please enter your PhoneNumber")
	@Size(min=1, message="Please enter your PhoneNumber")
	private String phonenumber;
	
	
	@NotNull(message="Please enter your freepases")
	@Min(value=0, message="must be greater that  one")
	@Max(value=10,message="must be less than or equal ten")
	private Integer freepass;
	
	@NotNull(message="Please enter your Postacode")
	@Size(min=1)
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String PostaCode;
	
	@NotNull(message="Please enter your CourseCode")
	@CourseCode(value="LUV", message="must start with LUV")
	private String courseCode;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getFreepass() {
		return freepass;
	}

	public void setFreepass(Integer freepass) {
		this.freepass = freepass;
	}

	public String getPostaCode() {
		return PostaCode;
	}

	public void setPostaCode(String postaCode) {
		PostaCode = postaCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	


}
