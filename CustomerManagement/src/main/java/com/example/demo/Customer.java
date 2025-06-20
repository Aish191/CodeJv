package com.example.demo;

class Customer {

	private String name;
	private String add;
	private String pan;

	void setName(String name) {
		this.name = name;

	}

	void setAdd(String add) {

		this.add = add;
	}

	void setPan(String pan) {
		this.pan = pan;
	}
	
	String getName()
	{
		return name;
	}
	
	String getAdd()
	{
		return add;
	}
	
	String getPan() {
		
		return pan;
	}

}