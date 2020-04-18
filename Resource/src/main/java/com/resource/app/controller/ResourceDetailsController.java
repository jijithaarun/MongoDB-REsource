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

import com.resource.app.model.ResourceDetail;
import com.resource.app.service.iResourceDetService;

@RestController
@RequestMapping("/")
public class ResourceDetailsController {

	@Autowired
	iResourceDetService resourceDetService;

	@RequestMapping(value = "resourcedetail", method = RequestMethod.POST)
	public ResponseEntity<?> addResourceDet(@RequestBody ResourceDetail resDetails) {
		resourceDetService.addResourceDetails(resDetails);
		return new ResponseEntity<>("added succesfully", HttpStatus.OK);
	}

	@RequestMapping(value = "resourcedetails", method = RequestMethod.GET)
	public List<ResourceDetail> listAllResources() {
		return resourceDetService.listAllResourceDetails();
	}

	// edit resource
	@RequestMapping(value = "resourcedetails/{resourceId}", method = RequestMethod.PUT)
	public ResponseEntity<ResourceDetail> updateResourceDet(@RequestBody ResourceDetail resourceDet) {
		return new ResponseEntity<ResourceDetail>(resourceDetService.updateResourceDet(resourceDet), HttpStatus.OK);
	}

}
