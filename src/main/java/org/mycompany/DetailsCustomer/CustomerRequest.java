package org.mycompany.DetailsCustomer;

public class CustomerRequest {
	private CustomerDetails customerDetails;
	


	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "CustomerRequest [customerDetails=" + customerDetails + "]";
	}
	
	

	
	
	
}
