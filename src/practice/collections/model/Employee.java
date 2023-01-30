package practice.collections.model;

public class Employee {
private String name;
private Double salary;
private Integer age;

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

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Employee(String name, Double salary, Integer age) {
	this.name= name;
	this.salary=salary;
	this.age= age;
}
public Employee() {
	this.name=null;
	this.age=0;
	this.salary=0.00;
}
}
