package cust_mgt;

public class CustomerService {
	
	private Customer[] customers;
	private int nbCustomers = 0;
	
	public void addCustomer(Customer c) {
		
		if(nbCustomers < customers.length) {
			customers[nbCustomers] = c;
			nbCustomers ++;
			System.out.println("Customer added Successfully!");
		}
		else {
			System.out.println("Customer list is full! try again");
		}
	}
	
	public Customer searchByID(int idCust) {
		for(int i=0;i < nbCustomers;i++) {
			if(customers[i].getId() == idCust ) {
				return customers[i];
			}
		}
		return null;
	}
	
	public void deleteCustomer(int idCust) {
		for(int i=0;i < nbCustomers;i++) {
			if(customers[i].getId() == idCust ) {
				
				for(int j=i;j < nbCustomers - 1; j++) {
					customers[j] = customers[j+1];
				}
				
				customers[nbCustomers - 1] = null;
				nbCustomers--;
				System.out.println("Customer deleted!");
				return;
			}
			else {
				System.out.println("Customer not found!");
			}
		}
	}
	
	
	public void displayCust() {
		if(nbCustomers == 0) {
			System.out.println("No customers to display!");
		}
		else {
			for(int i=0;i<nbCustomers;i++) {
				System.out.println(customers[i]);
			}
		}
	}
}
