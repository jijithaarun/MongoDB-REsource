package com.resource.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ResourceMaster")
public class ResourceMaster {

	@Id
	private Integer resourceTypeId;
	private String resourceTypeName;

	public ResourceMaster(Integer resourceTypeId, String resourceTypeName) {
		super();
		this.resourceTypeId = resourceTypeId;
		this.resourceTypeName = resourceTypeName;
	}

	public Integer getResourceTypeId() {
		return resourceTypeId;
	}

	public void setResourceTypeId(Integer resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	public String getResourceTypeName() {
		return resourceTypeName;
	}

	public void setResourceTypeName(String resourceTypeName) {
		this.resourceTypeName = resourceTypeName;
	}

}
