package com.resource.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource.app.model.ResourceMaster;
import com.resource.app.repo.iResourceMasterRepo;

@Service
public class ResourceService implements iResourceService {

	@Autowired
	iResourceMasterRepo resourceMasterRepo;

	@Override
	public void addResource(ResourceMaster resource) {
		resourceMasterRepo.save(resource);

	}

	@Override
	public List<ResourceMaster> findAll() {
		return resourceMasterRepo.findAll();
	}

	@Override
	public void deleteResource(Integer resourceTypeId) {
		resourceMasterRepo.deleteById(resourceTypeId);

	}

	@Override
	public ResourceMaster updateResource(ResourceMaster resource) {

		return resourceMasterRepo.save(resource);
	}

	@Override
	public Optional<ResourceMaster> findById(Integer resourceITypeId) {
		
		return resourceMasterRepo.findById(resourceITypeId);
	}




}
