package cust_mgt;

public class ContactHistory {
	
	private String date;
	private String description;
	
	public ContactHistory() {
		this.date = "";
		this.description = "";
	}
	
	public ContactHistory(String date,String description) {
		this.date = date;
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public String toString() {
		return "ContactHistory [date=" + date + ", description=" + description + "]";
	}
	
	
	
}
