package com.Form.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Form.Model.FormModel;
import com.Form.data.FormData;



@Service
public class FormService {
	
	@Autowired
	private FormData formdata;
	
	
	public void show() {
		System.out.println("I M In Service");
	}

	public boolean saveDetail(FormModel fm) {
		formdata.save(fm);
		if(fm != null) {
			return true;
		}else {
		return false;
		}
	}
}
