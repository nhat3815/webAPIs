package com.tgdd.fresher.webAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgdd.fresher.webAPI.model.POPH;
import com.tgdd.fresher.webAPI.service.POPHService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/PO")
@Api(tags = "PO")
public class POPHController {
	@Autowired
	POPHService pophService;

	@GetMapping("/getAll")
	public ResponseEntity<List<POPH>> listPOPH(int limit){
		return ResponseEntity.ok(pophService.getAll());
	}
	
}
