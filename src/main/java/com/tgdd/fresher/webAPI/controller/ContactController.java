package com.tgdd.fresher.webAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgdd.fresher.webAPI.model.Contact;
import com.tgdd.fresher.webAPI.service.ContactServices;


@RestController
@RequestMapping("/api/contact")
public class ContactController {
	
	@Autowired
	ContactServices contactServices;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Contact>> listAllContact(){
		return ResponseEntity.ok(contactServices.getAll());
	}	
}