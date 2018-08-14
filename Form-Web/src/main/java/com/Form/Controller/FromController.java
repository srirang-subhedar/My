package com.Form.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Form.Model.FormModel;
import com.Form.Service.FormService;
import com.Form.Validator.FormValidation;

@Controller
public class FromController {

	@Autowired
	private FormService formservice;

	@Autowired
	private FormValidation formvalidation;
/* this method show the first page of application i.e Enquiry 
 * 
 * return String
 * */
	@RequestMapping("/Form")
	public String showForm(Model model) {
		model.addAttribute("list", new FormModel());
		return "Form";

	}

	public String detail(Map<String, Object> map) {
		FormModel fm = new FormModel();
		map.put("list", fm);
		System.out.println("I m In Controller");
		return "Form";

	}
/*this method is used for validation purpose
 * 
 * returns String
 * */
	@RequestMapping(value = "/Form", method = RequestMethod.POST)
	public String insert(@ModelAttribute("list") FormModel fm, BindingResult result) {
		formvalidation.validate(fm, result);
		if (result.hasErrors()) {
			return "Form";
		} else {
			formservice.saveDetail(fm);
			return "Form";
		}
	}
	
	
	
}
