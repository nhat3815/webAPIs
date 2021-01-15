package com.tgdd.fresher.webAPI.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgdd.fresher.webAPI.model.POPH1;
import com.tgdd.fresher.webAPI.service.POPH1Service;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/PO1")
@Api(tags = "PO1")
public class POPH1Controller {
	@Autowired
	POPH1Service po1;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<POPH1>> listPOPH1(String POID, int limit){
		return ResponseEntity.ok(po1.POGetPH1(POID, limit));
	}
	
	@PostMapping("/createPOPH1")
	public ResponseEntity<Object> createPO(@Valid @RequestBody POPH1 poph1){
			System.out.println("Thông tin: "+poph1);
		return ResponseEntity.ok(po1.createPOPH1(poph1));
	}
	@PostMapping("/updatePOPH1")
	public ResponseEntity<Object> updatePOPH1(@Valid @RequestBody POPH1 poph1){
		return ResponseEntity.ok(po1.UpdatePOPH1(poph1));
	}
	@PostMapping("/deletePOPH1/{poid}")
	public ResponseEntity<Object> deletePoph1(@PathVariable("poid") String poid){
		return ResponseEntity.ok(po1.deletePOPH1(poid));
		
	}
}
