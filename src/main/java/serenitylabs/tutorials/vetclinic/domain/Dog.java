package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;
public class Dog {

	private final String Name;
	private final String Breed;
	private final LocalDateTime Birthday;
	private  final String favoriteFood;
	private  final String color;


	public Dog(String Name, String Breed, LocalDateTime Birthday) {
		this(Name,Breed,Birthday,null, null);
		
		/*
		 * this.Name=Name; 
		 * this.Breed=Breed; 
		 * this.Birthday=Birthday;
		 * this.favoriteFood=null;
		 */
	
	}


	public Dog(String Name, String Breed, LocalDateTime Birthday, String favoriteFood, String color) {
		this.Name=Name;
		this.Breed=Breed;
		this.Birthday=Birthday;
		this.favoriteFood=favoriteFood;
		this.color = color;
	}




	public String getName() {
		return Name;
	}


	public Object getBreed() {
		return Breed;
	}


	public Object getBirthday() {
		return Birthday; 
	}


	public Object getFavoriteFood() {
		return favoriteFood;
	}
	
	public Object getColor() {
		return color;
	}


	
	/*
	 * interface withBreed { DogBuilder ofBreed(String Breed);
	 * 
	 * }
	 * 
	 * interface withColor { DogBuilder ofColor(String color) ;
	 * 
	 * }
	 * 
	 */



}
