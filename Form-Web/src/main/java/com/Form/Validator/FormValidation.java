package com.Form.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.Form.Model.FormModel;

@Component
public class FormValidation implements Validator {
	
		 private Pattern pattern;  
		 private Matcher matcher;  
	  
		 private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"  
		   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";  
		 String ID_PATTERN = "[0-9]+";  
		 String STRING_PATTERN = "[a-zA-Z]+";  
		 String MOBILE_PATTERN = "[0-9]{10}";  

	@Override
	public boolean supports(Class<?> clazz) {
		return FormModel.class.isAssignableFrom(clazz);
	}
	
	public void   validate(Object list, Errors errors) {
	
	FormModel rm = (FormModel) list;
	
	ValidationUtils.rejectIfEmpty(errors, "name", "error.fn");
	ValidationUtils.rejectIfEmpty(errors, "contact", "error.cn");
	ValidationUtils.rejectIfEmpty(errors, "email", "error.email");
	ValidationUtils.rejectIfEmpty(errors, "profession", "error.prof");
	ValidationUtils.rejectIfEmpty(errors, "comment", "error.com");
	ValidationUtils.rejectIfEmpty(errors, "promotion", "error.info");
	
	  if (!(rm.getName() != null && rm.getName().isEmpty())) {  
			   pattern = Pattern.compile(STRING_PATTERN);  
			   matcher = pattern.matcher(rm.getName());  
		   if (!matcher.matches()) {  
			    errors.rejectValue("name", "name.containNonChar",  
			      "Enter a valid name");  
			   }  
			  }  
	  
	  if (!(rm.getEmail() != null && rm.getEmail().isEmpty())) {  
		  	   pattern = Pattern.compile(EMAIL_PATTERN);  
		 	   matcher = pattern.matcher(rm.getEmail());  
			   if (!matcher.matches()) {  
		  	    errors.rejectValue("email", "email.incorrect",  
		 	      "Enter a correct email");  
		 	   }  
			  }  
	  
	  if (!(rm.getContact() != null && rm.getContact().isEmpty())) {  
		 	   pattern = Pattern.compile(MOBILE_PATTERN);  
			   matcher = pattern.matcher(rm.getContact());  
		 	   if (!matcher.matches()) {  
		 	    errors.rejectValue("contact", "contact.incorrect",  
		  	      "Enter a correct phone number");  
			   }  
			  }  


	  

	}	
	
}
