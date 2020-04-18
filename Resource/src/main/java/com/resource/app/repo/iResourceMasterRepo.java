package com.resource.app.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.resource.app.model.ResourceMaster;

public interface iResourceMasterRepo extends MongoRepository<ResourceMaster, Integer> {
	
	

}
