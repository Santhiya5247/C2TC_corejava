package com.tnsif.Day3;

public class Person
{

	//DATA MEMBERS
	private String name;
	private  int income;
	private  String  gender;//String default value -  Null
	private  int age;
	private  int tax; //int  default  value-0
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGneder() {
		return gender;
	}
	public void setGneder(String gneder) {
		this.gender = gneder;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	

}
