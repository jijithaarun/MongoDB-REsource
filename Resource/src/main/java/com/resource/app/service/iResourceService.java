package com.resource.app.service;

import java.util.List;
import java.util.Optional;

import com.resource.app.model.ResourceMaster;



public interface iResourceService {
	
	void addResource(ResourceMaster resource);
	
	List<ResourceMaster> findAll();
	
	void deleteResource(Integer resourceTypeId);
	
	ResourceMaster updateResource(ResourceMaster resource);
	
	Optional<ResourceMaster> findById(Integer resourceTypeId);

	

}
