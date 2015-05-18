package oop01.encapsule;

public class PayVo {
	private String name ;
	private int salary ;
	static final double TAX = 0.1 ;
	private int income ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
}
