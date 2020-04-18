package com.resource.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resource.app.model.ResourceMaster;
import com.resource.app.service.iResourceService;

@RestController
@RequestMapping("/")
public class ResourceMasterController {

	@Autowired
	iResourceService resourceService;

	@RequestMapping(value = "resource", method = RequestMethod.POST)
	public ResponseEntity<?> addResource(@RequestBody ResourceMaster res) {
		resourceService.addResource(res);
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);

	}

	@RequestMapping(value = "resource", method = RequestMethod.GET)
	public List<ResourceMaster> listAllResources() {
		return resourceService.findAll();
	}

	@RequestMapping(value = "resource/{resourceTypeId}", method = RequestMethod.DELETE)
	public void deleteResource(@PathVariable("resourceTypeId") Integer resourceTypeId) {
		resourceService.deleteResource(resourceTypeId);
	}

	// edit resource
	@RequestMapping(value = "resource/{resourceTypeId}", method = RequestMethod.PUT)
	public ResponseEntity<ResourceMaster> updateResource(@RequestBody ResourceMaster resource) {
		return new ResponseEntity<ResourceMaster>(resourceService.updateResource(resource), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "resource-by-id/{resourceTypeId}", method = RequestMethod.GET)
	public Optional<ResourceMaster> findById(@PathVariable("resourceTypeId") Integer id)
	{
		return resourceService.findById(id);
		
	}
	
	

}
