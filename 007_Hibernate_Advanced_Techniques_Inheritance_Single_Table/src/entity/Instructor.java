package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="INSTRUCTOR")
public class Instructor extends Person implements Serializable{

	@Column(name="SALARY")
	private Double salary;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName, String email, Double salary) {
		super(firstName, lastName, email);
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
}
