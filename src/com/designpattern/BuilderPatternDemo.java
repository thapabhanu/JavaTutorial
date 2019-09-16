package com.designpattern;

class User {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	public User(UserBuilder builder) {
		super();
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	@Override
	public String toString() {
		return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
	}
	
	public static class UserBuilder{
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		
		public UserBuilder(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}		
		
		public User build() {
			User user = new User(this);
			
			return user;
		}
	}
}

class BuilderPatternDemo{
	
	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Bhanu", "Thapa").age(30).phone("2929393").build();
		System.out.println(user);
		
		user = new User.UserBuilder("Bhanu", "Thapa").address("myAddress").build();
		System.out.println(user);		
	}
}

