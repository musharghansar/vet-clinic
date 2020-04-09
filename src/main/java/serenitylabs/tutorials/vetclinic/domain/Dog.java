package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {

	private final String name;
	private final String colour;
	private final String breed;
	private final LocalDate birthDate;
	private final String favFood;
	
	
	public Dog (String name, String breed, String colour, LocalDate birthDate, String favFood) {
		this.name=name;
		this.breed=breed;
		this.colour=colour;
		this.birthDate=birthDate;
		this.favFood=favFood;
		
	}
	
	public String getName() {	
		return name;	
	}
	
	public String getColour() {
		return colour;
	}

	public String getBreed() {
	return breed;
	}

	public String getFavFood() {
	return favFood;
	}

	public LocalDate getBirthDate() {
	return birthDate;
	}

}
