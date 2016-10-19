package com.guillermods.sample.pet.dto;

public class Pet {

	private String petName;
	
	
	private String petType;

	
	

	public Pet(String petName, String petType) {
		super();
		this.petName = petName;
		this.petType = petType;
	}


	public String getPetName() {
		return petName;
	}


	public void setPetName(String petName) {
		this.petName = petName;
	}


	public String getPetType() {
		return petType;
	}


	public void setPetType(String petType) {
		this.petType = petType;
	}


	@Override
	public String toString() {
		return "Pet [petName=" + petName + ", petType=" + petType + "]";
	}
	
	
}
