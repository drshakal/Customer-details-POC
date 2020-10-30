package org.mycompany.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.models.DestinationData;

public class validationProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		DestinationData destinationData= (DestinationData)exchange.getIn().getBody();
		if(destinationData.getD1_Supplier_GSTIN()==null || destinationData.getD1_Supplier_GSTIN()=="" || destinationData.getD2_Transaction_Type()==null || destinationData.getD2_Transaction_Type()=="" || destinationData.getD4_Nature_of_Document()==null || destinationData.getD4_Nature_of_Document()=="" || destinationData.getD10_document_no()==null || destinationData.getD10_document_no()=="" || destinationData.getD11_document_date()==null || destinationData.getD11_document_date()=="" || destinationData.getD15_Line_Item_ID()==null || destinationData.getD15_Line_Item_ID()=="" || destinationData.getD16_Goods_and_Services()==null || destinationData.getD16_Goods_and_Services()=="" || destinationData.getD17_HSN()==null || destinationData.getD17_HSN()=="" || destinationData.getD21_UQC()==null || destinationData.getD21_UQC()=="" || destinationData.getD22_Place_of_Supply()==null || destinationData.getD22_Place_of_Supply()=="" || destinationData.getD24_Section_7_Supply()==null || destinationData.getD24_Section_7_Supply()=="" || destinationData.getD28_Net_Taxable_Value()==null || destinationData.getD28_Net_Taxable_Value()=="" || destinationData.getD41_Invoice_Value()==null || destinationData.getD41_Invoice_Value()=="" || destinationData.getD42_Supply_Category()==null || destinationData.getD42_Supply_Category()=="" || destinationData.getD43_RCM()==null || destinationData.getD43_RCM()=="" )
			exchange.getIn().setHeader("isValidEntry", "false");
		else
			exchange.getIn().setHeader("isValidEntry", "true");	

	}

}
