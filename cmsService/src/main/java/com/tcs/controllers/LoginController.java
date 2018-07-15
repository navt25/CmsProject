package com.tcs.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.inf.StudentOperationsDao;
import com.tcs.request.LoginDetails;
import com.tcs.response.CustomResponse;
import javax.transaction.Transactional;

@RestController
@Transactional
public class LoginController {
	
	@Autowired
	StudentOperationsDao studentOperationsDao;
	
	@RequestMapping(method = RequestMethod.POST, value= "/login")
	public  ResponseEntity<?> methodGetStudent(@RequestBody LoginDetails b) {
		System.out.println("inside Login Controller");
		String user  =  b.getUsername();
		String pswrd =  b.getPassword();
		System.out.println(user);
		System.out.println(pswrd);
		
		
	
		if((user.equals("administarator")) && (pswrd.equals("admin")))
		{
			System.out.println("inside if 1");
			CustomResponse customResponse = new CustomResponse();
			customResponse.setStatus("success");
			System.out.println("inside if 2");
			return new ResponseEntity<>(customResponse, HttpStatus.OK);
		
		}
		
		else {
			System.out.println("inside else 1");
			CustomResponse customResponse = new CustomResponse();
			customResponse.setStatus("failure");
			System.out.println("inside else 2");
			return new ResponseEntity<>(customResponse, HttpStatus.OK);
		}
		
		
	

	
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/testService")
	public  ResponseEntity<?> testService() {
		System.out.println("inside testService");
		studentOperationsDao.getStudents();
		return new ResponseEntity<>("hello", HttpStatus.OK);
	}
}
	
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//if((user.equals("administarator")) && (pswrd.equals("admin")))
		
		/*@RequestMapping(method = RequestMethod.POST, value= "/login")
		public  ResponseEntity<?> methodGetStudent(@RequestBody LoginDetails b) {
			String user = b.getUsername();
			String pswrd =	b.getPassword();
			System.out.println(user);
			System.out.println(pswrd);
			List l =new ArrayList();
				l.add(user);
				l.add(pswrd);
				System.out.println("inside Login Controller");
				return new ResponseEntity<>(l, HttpStatus.OK);
		}
*/			
		/*	
  //List result = l;
 String result="true";
	return new ResponseEntity<>(result, HttpStatus.OK);*/

	
	
