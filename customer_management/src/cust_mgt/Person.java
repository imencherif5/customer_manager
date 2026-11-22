package cust_mgt;

public abstract class Person {
	protected int id;
	protected String name;
	protected int phone;
	
	
	public Person() {
		this.id = 0;
		this.name = "";
		this.phone = 0;
	}
	
	public Person(int id,String name,int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public abstract String Role();

	
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", Role=" + Role() + "]";
	}
	
	
}
