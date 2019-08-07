package com.atguigu.spring.beans;

public class Person {
	
	private String name="haha";
	private Integer age;
	private String gender;
	
	private Phone phone;
	
	
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person() {
		System.out.println("person 被创建了！");
	}
	public Person(String name, Integer age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		System.out.println( "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + "]");

		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + "]";
	}
	
	
	
	
	

}
