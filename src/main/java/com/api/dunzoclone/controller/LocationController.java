package com.api.dunzoclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.dunzoclone.model.Location;
import com.api.dunzoclone.repository.LocationRepository;


@RestController
public class LocationController {
	
	private final LocationRepository repository;
	
	LocationController(LocationRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/locations/add")
	Location newLocation(@RequestBody Location newLocation) {
	    return repository.save(newLocation);
	  }

}
