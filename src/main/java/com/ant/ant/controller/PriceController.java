package com.ant.ant.controller;

import java.util.List;

import com.ant.ant.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ant.ant.dto.models.Price;


@RestController
@RequestMapping("/api/prices")
public class PriceController {
	
	private final PriceService priceService;

	@Autowired
	public PriceController(final PriceService priceService){
		this.priceService = priceService;
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	 public void create(@RequestBody Price price) {
		 priceService.save(price);
	 }
	
	@GetMapping
	public List<Price> list() {
		 return priceService.findAll();
	}
	
	@PutMapping
	public void update(@RequestBody Price price) {
		priceService.save(price);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String name) {
		priceService.deleteByName(name);
	}
	


	
	
	
	
	
	
}

