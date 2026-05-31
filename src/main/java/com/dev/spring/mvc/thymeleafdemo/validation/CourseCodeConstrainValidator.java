package com.dev.spring.mvc.thymeleafdemo.validation;

public class CourseCodeConstrainValidator implements jakarta.validation.ConstraintValidator<CourseCode, String> {

	  private String coursePrefix;
	  
	  @Override
	  public void initialize(CourseCode theCurseCode) {
	    coursePrefix = theCurseCode.value();
	  }
	  
	  @Override
	  public boolean isValid(String theCode, jakarta.validation.ConstraintValidatorContext theConstraintValidatorContext) {
	    
	    boolean result;
	    
	    if (theCode != null) {
	      result = theCode.startsWith(coursePrefix);
	    }
	    else {
	      result = true;
	    }
	    
	    return result;
	  }

	}
