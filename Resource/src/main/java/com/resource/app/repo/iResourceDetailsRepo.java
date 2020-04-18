package com.resource.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.resource.app.model.ResourceDetail;

public interface iResourceDetailsRepo extends MongoRepository<ResourceDetail, Long> {
	
	

}
