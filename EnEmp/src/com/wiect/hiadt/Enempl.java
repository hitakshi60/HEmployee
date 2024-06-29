package com.wiect.hiadt;

public class Enempl {
	  private String name;//name=attribute
      private int id;
      private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Enempl [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
      
}
