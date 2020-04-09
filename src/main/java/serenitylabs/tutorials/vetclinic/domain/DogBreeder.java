package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class DogBreeder implements withBreed, WithDOB {

		private  String name;
		private  String colour;
		private  String breed;
		private  LocalDate birthDate;
		private  String favFood;
		
		public DogBreeder(String name) {
		this.name=name;
		}



		public static withBreed called(String name) {
			return new DogBreeder(name);
		}
	

		@Override
		public DogBreeder ofDOB(LocalDate date) {
			this.birthDate=date;
			return this;
		}


		@Override
		public DogBreeder ofBreed(String breed) {
		this.breed=breed;
			return this;
		}

	

		public DogBreeder withbirthDate(LocalDate birthDate) {
			this.birthDate=birthDate;
			return this;
		}

		public DogBreeder withfavFood(String favFood) {
			this.favFood=favFood;
			return this;
		}

		public Dog andColour(String colour) {
			this.colour=colour;
			return new Dog(name, breed, colour, birthDate, favFood);
		}




}
