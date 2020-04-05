package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;


public class DogBreeder implements withBreed, withColor {
	
	String Name;
	private String Breed;
	private LocalDateTime birthday;
	private String favoriteFood;
	private String color;
	
	public static DogBreeder dog() {
		return new DogBreeder();
	}
		
	public withBreed called(String Name) {
		this.Name=Name;
		return this;
		
	}
	

	public DogBreeder ofBreed(String Breed) {
		this.Breed=Breed;
		return this;
	}

	public Dog withDateOfBirth(LocalDateTime birthday) {
		this.birthday=birthday;
		return new Dog(Name,Breed,birthday,favoriteFood, color);
	}

	public Dog build() {
		// TODO Auto-generated method stub
		return new Dog(Name,Breed,birthday);
	}


	public DogBreeder withFavoriteFood(String favoriteFood) {
		this.favoriteFood=favoriteFood;
		return this;
	}

	public DogBreeder ofColor(String color) {
		this.color=color;
		return this;
	}
	
	
}
