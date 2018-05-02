package com.olam.fieldstar1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olam.fieldstar1.entity.FieldStar;
import com.olam.fieldstar1.service.FieldStarService;

@RestController
public class FieldStarController {
	
	@Autowired
	private FieldStarService FieldStarService;
	
	@Value(value= "${welcome.message}")
	public String message;
	
	
	@GetMapping(value="/fsmessage")
	public String profMessage() {
		
		return message;
	}
	
	/*@GetMapping(value="/fsmessage")
	public String message() {
		
		return "i am from fieldstar controller";
	}*/
	
	
	@GetMapping(value="/getFieldStarById/{fs_id}")
	public ResponseEntity<FieldStar> getFieldStarById(@PathVariable("fs_id") String fs_id ){
		
		FieldStar fieldStarById = FieldStarService.getFieldStarById(fs_id);
		
		return new ResponseEntity<FieldStar>(fieldStarById, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/saveFieldStar")
	public ResponseEntity<FieldStar> getFieldStarById(@RequestBody FieldStar fieldStar ){
		
		 FieldStarService.saveFieldStar(fieldStar);
		
		return new ResponseEntity<FieldStar>( HttpStatus.CREATED);
		
	}
	
	@PostMapping(value="/saveLocationsByFieldStarId")
	public ResponseEntity<FieldStar> saveLocationsByFieldStarId(@RequestBody FieldStar fieldStar ){
		
		 FieldStarService.saveLocationsByFieldStarId(fieldStar);
		
		return new ResponseEntity<FieldStar>( HttpStatus.CREATED);
		
	}
	

}
