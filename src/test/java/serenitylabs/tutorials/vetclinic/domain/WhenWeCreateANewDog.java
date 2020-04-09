package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {
	
	@Test
	public void a_new_dog_should_have_a_name_and_breed() {
		Dog fido=DogBreeder.called("Fido")
							.ofBreed("Poodle")
							.withbirthDate(LocalDate.now())
							.withfavFood("Corn")
							 .andColour("White");
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("Poodle", fido.getBreed());
		Assert.assertEquals("Corn", fido.getFavFood());
		Assert.assertEquals("White", fido.getColour());
		Assert.assertEquals(LocalDate.now(), fido.getBirthDate());



	}

}
