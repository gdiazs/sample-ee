package com.guillermods.sample.pet.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;

import com.guillermods.sample.pet.dto.Pet;
import com.guillermods.sample.pet.service.PetServiceLocal;
import com.guillermods.sample.pet.service.PetServiceRemote;

@Stateless
public class PetServiceImpl implements PetServiceLocal, PetServiceRemote {

	private List<Pet> pets;
	
	@Override
	public Collection<Pet> getAllPets() {
		
		pets = new ArrayList<Pet>();
		pets.add(new Pet("pet 1", "Dog"));
		pets.add(new Pet("pet 2", "Cat"));
		pets.add(new Pet("pet 3", "Turtle"));
		pets.add(new Pet("pet 4", "Bird"));
		pets.add(new Pet("pet 5", "Dog"));
		
		return pets;
	}

}
