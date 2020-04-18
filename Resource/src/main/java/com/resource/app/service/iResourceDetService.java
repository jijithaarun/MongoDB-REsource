package com.resource.app.service;

import java.util.List;
import java.util.Optional;

import com.resource.app.model.ResourceDetail;

public interface iResourceDetService {
	void addResourceDetails(ResourceDetail resourceDetails);
	
	List<ResourceDetail> listAllResourceDetails();
	
	ResourceDetail updateResourceDet(ResourceDetail resourceDetails);
	

}
