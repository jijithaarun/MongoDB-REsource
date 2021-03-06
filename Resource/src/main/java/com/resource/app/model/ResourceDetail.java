package com.resource.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "ResourceDetails")
public class ResourceDetail {

	@Id
	private Long resourceId;
	// getting the values from the resource tables and set to foreign key

	@DBRef()
	private ResourceMaster resource;

	private Integer resourceCapacity;

	private Integer noOfSystems;

	private Character projector;

	private Character whiteBoard;

	private String picturePath;

	private Float resourceRate;

	private String typeOfUse;
	private Character isAccepted;
	private Character isBooked;

	private Character isActive;

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public ResourceMaster getResource() {
		return resource;
	}

	public void setResource(ResourceMaster resource) {
		this.resource = resource;
	}

	public Integer getResourceCapacity() {
		return resourceCapacity;
	}

	public void setResourceCapacity(Integer resourceCapacity) {
		this.resourceCapacity = resourceCapacity;
	}

	public Integer getNoOfSystems() {
		return noOfSystems;
	}

	public void setNoOfSystems(Integer noOfSystems) {
		this.noOfSystems = noOfSystems;
	}

	public Character getProjector() {
		return projector;
	}

	public void setProjector(Character projector) {
		this.projector = projector;
	}

	public Character getWhiteBoard() {
		return whiteBoard;
	}

	public void setWhiteBoard(Character whiteBoard) {
		this.whiteBoard = whiteBoard;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public Float getResourceRate() {
		return resourceRate;
	}

	public void setResourceRate(Float resourceRate) {
		this.resourceRate = resourceRate;
	}

	public String getTypeOfUse() {
		return typeOfUse;
	}

	public void setTypeOfUse(String typeOfUse) {
		this.typeOfUse = typeOfUse;
	}

	public Character getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(Character isAccepted) {
		this.isAccepted = isAccepted;
	}

	public Character getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(Character isBooked) {
		this.isBooked = isBooked;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

}
