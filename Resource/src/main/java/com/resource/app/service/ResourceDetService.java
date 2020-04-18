package com.resource.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource.app.model.ResourceDetail;
import com.resource.app.repo.iResourceDetailsRepo;

@Service
public class ResourceDetService implements iResourceDetService {

	@Autowired
	iResourceDetailsRepo resourceDetRepo;

	@Override
	public void addResourceDetails(ResourceDetail resourceDetails) {
		resourceDetRepo.save(resourceDetails);
	}

	@Override
	public List<ResourceDetail> listAllResourceDetails() {
		return resourceDetRepo.findAll();
	}

	@Override
	public ResourceDetail updateResourceDet(ResourceDetail resourceDetails) {
		return resourceDetRepo.save(resourceDetails);
	}

	

}
