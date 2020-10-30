package org.mycompany.CustomerProcessor;
import org.apache.camel.*;
//import org.mycompany.DetailsCustomer.*;
import org.mycompany.DetailsCustomer.CustomerDetails;
import org.mycompany.DetailsCustomer.CustomerRequest;

public class ProcessorClass implements Processor  {
	
		
		
		public void process(Exchange exchange) throws Exception {

			String idStr = exchange.getIn().getHeader("id",String.class);
			int id = -1;
			if(!idStr.equals("")) {
				id = Integer.parseInt(idStr);
			}
			System.out.println("Header id"+id);
			String query="SELECT * FROM customerdetails WHERE cid="+id;
			String query2="select o from org.mycompany.DetailsCustomer.CustomerDetails o where o.id ="+id;
			System.out.println("query:"+query);
	//		CustomerDetails customerDetails = new CustomerDetails();
	//		customerDetails.setId(id);
//			
	//		CustomerRequest request = new CustomerRequest();
	//		request.setCustomerDetails(customerDetails);
			
			exchange.getIn().setBody(query);

	}

}
