package io.solitx;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID no;

	private String name;

	private Double salary;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(foreignKey = @ForeignKey(name = "for_key", value = ConstraintMode.PROVIDER_DEFAULT), name = "for_key")
	private List<Address> addresses = new ArrayList<Address>();

	public UUID getNo() {
		return no;
	}

	public void setNo(UUID no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Double salary, List<Address> addresses) {
		super();
		this.name = name;
		this.salary = salary;
		this.addresses = addresses;
	}

}
