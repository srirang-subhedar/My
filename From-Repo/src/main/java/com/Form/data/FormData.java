package com.Form.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Form.Model.FormModel;

@Repository
public class FormData {
	
 @Autowired
 private HibernateTemplate hibernatetemplate;
 
 public void view() {
	 System.out.println("I m In Repo");
 }

 public FormModel save(FormModel fm) {
	 if(fm!=null) {
	 hibernatetemplate.saveOrUpdate(fm);
	 System.out.println("Data inserted");
	 return fm;
	 }else {
		 return null;
	 }
 }
}
