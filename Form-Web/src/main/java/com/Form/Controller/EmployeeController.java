package com.Form.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Form.Model.EmployeeModel;

@Controller
public class EmployeeController {

	@RequestMapping(method=RequestMethod.GET, value="/emp/{id}")
	public ModelAndView getEmployee(@PathVariable int id) {
	
	EmployeeModel e = new EmployeeModel();
	e.setEid("1");
	System.out.println(e.getEid());
	
	System.out.println(id);
	return new ModelAndView("emp","EmployeeModel",e);
}
	@RequestMapping(method=RequestMethod.POST, value="/Employee") 
	@ResponseBody
	public ModelAndView addEmployee(@RequestBody 
	EmployeeModel e) 
	{
		System.out.println("I m In Post Service");
		return new ModelAndView("Employee","EmployeeModel", e);
		
	}
	
}