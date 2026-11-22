package cust_mgt;
import java.util.Scanner;

public class menu {

	private CustomerService custSv = new CustomerService();
	private Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		int choice;
		
		do {
			System.out.println("---Menu---\n");
			System.out.println("1. Add Customer");
			System.out.println("2. Search Customer by ID");
			System.out.println("3. Delete Customer");
			System.out.println("4. Display Customers");
			System.out.println("5. Exit");
			System.out.println("Your choice:");
			choice = sc.nextInt();
			
			
			switch(choice) {
				case 1 -> addCustomer();
				case 2 -> searchByID();
				case 3 -> deleteCustomer();
				case 4 -> custSv.displayCust();
			}
		}while(choice != 5);
	}
	
	public void addCustomer() {
		System.out.println("Id:");
		int id = sc.nextInt();
		
		System.out.println("Name:");
		String name = sc.nextLine();
		
		System.out.println("Phone:");
		int phone = sc.nextInt();
		
		System.out.println("Email:");
		String email = sc.nextLine();
		
		System.out.println("Address:");
		String address = sc.nextLine();
		
		Customer c = new Customer(id,name,phone,email,address);
		custSv.addCustomer(c);
	} 
	
	
	public void searchByID() {
		System.out.println("Enter Customer ID:");
		int id = sc.nextInt();
		Customer c = custSv.searchByID(id);
		
		if(c!= null) {
			System.out.println(c);
		}
		else {
			System.out.println("Customer not found!");
		}
	}
	
	public void deleteCustomer() {
		System.out.println("Enter Customer ID:");
		int id = sc.nextInt();
		custSv.searchByID(id);
	}
}
