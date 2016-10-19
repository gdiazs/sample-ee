package com.guillermods.sample.pet.service;

import java.util.Collection;

import javax.ejb.Remote;

import com.guillermods.sample.pet.dto.Pet;

@Remote
public interface PetServiceRemote {
	public Collection<Pet> getAllPets();
}
