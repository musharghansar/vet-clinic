package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

//import junit.framework.Assert;
import org.junit.Assert;

public class WhenWeCreateANewDog {
	
	@Test
	public void it_should_have_a_name() {
		LocalDateTime birthday = LocalDateTime.now();
	//	Dog fido = new Dog("Fido", "Poodle", birthday);
	//	Dog fido = Dog.called("Fido").ofBreed("Poodle").withDateOfBirth(birthday).build();
		Dog fido = DogBreeder.dog().called("Fido")
						.ofBreed("Poodle")
						.ofColor("black")
						.withFavoriteFood("Pizza")
						.withDateOfBirth(birthday);
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("Poodle", fido.getBreed());
		Assert.assertEquals(birthday, fido.getBirthday());
		Assert.assertEquals("black", fido.getColor());
		Assert.assertEquals("Pizza", fido.getFavoriteFood());


	}
	@Test
	public void it_should_have_optional_favorite_food() {
		LocalDateTime birthday = LocalDateTime.now();
		Dog fido = new Dog("Fido", "Poodle", birthday, "Pizza", null);
		Assert.assertEquals("Pizza", fido.getFavoriteFood());
		
		
		
		
	}



}
