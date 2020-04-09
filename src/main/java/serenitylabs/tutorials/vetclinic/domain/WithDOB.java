package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public interface WithDOB {
	
	DogBreeder ofDOB(LocalDate date);

}
