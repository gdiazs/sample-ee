package com.guillermods.sample.pet.service;

import java.util.Collection;

import javax.ejb.Local;

import com.guillermods.sample.pet.dto.Pet;

@Local
public interface PetServiceLocal {

	public Collection<Pet> getAllPets();
}
