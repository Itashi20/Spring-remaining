package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.AppDelegate;



@RestController
@RequestMapping("/mainapp")
public class ResController {
@Autowired
	private AppDelegate dao;
	
	@GetMapping("/loadall")
	public String loadAll() {
		return dao.loadEmp();
	}
	
	@GetMapping("/load")
	public String load() {
		return dao.loadEmp2();
	}
	

}