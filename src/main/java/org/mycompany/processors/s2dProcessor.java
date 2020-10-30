package org.mycompany.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.models.DestinationData;
import org.mycompany.models.SourceData;

public class s2dProcessor implements Processor{
	
	@Override
	public void process(Exchange exchange) throws Exception {
		List<DestinationData> destinationList = new ArrayList<DestinationData>();
		@SuppressWarnings("unchecked")
		List<SourceData> sourceList = (List<SourceData>) exchange.getIn().getBody();
		//System.out.println(sourceList.size()+"listInput---->"+sourceList);
		DestinationData[] e = new DestinationData [sourceList.size()];
		int i=0;
		for(SourceData sourceData : sourceList )
		{
			e[i] = new DestinationData();
			e[i].setD1_Supplier_GSTIN(sourceData.getS10_SupplierGSTIN());
			e[i].setD2_Transaction_Type(sourceData.getS12_DocumentType());
		//	e.setD3_Original_Transaction_Type("-");
			e[i].setD4_Nature_of_Document(sourceData.getS12_DocumentType());
			e[i].setD5_Customer_GSTIN(sourceData.getS20_CustomerGSTIN());
		//	e.setD6_Original_Customer_GSTIN("-");
			e[i].setD7_e_commerce_GSTIN(sourceData.getS53_eComGSTIN());
			e[i].setD8_Customer_Name(sourceData.getS23_CustomerName());
			e[i].setD9_ERP_Transaction_ID(sourceData.getS56_AccountingVoucherNumber());
			e[i].setD10_document_no(sourceData.getS14_DocumentNumber());
			e[i].setD11_document_date(sourceData.getS15_DocumentDate());
		//	e.setD12_Document_Cancellation_Date("");
		//	e.setD13_Original_Document_No("");
		//	e.setD14_Original_Document_Date("");
			e[i].setD15_Line_Item_ID(sourceData.getS19_LineNumber());
			e[i].setD16_Goods_and_Services("GOODS");
			e[i].setD17_HSN(sourceData.getS33_HSNorSAC());
			e[i].setD18_HSN_Description(sourceData.getS35_ProductDescription());
			e[i].setD19_quantity(sourceData.getS38_Quantity());
		//	e.setD20_Price_per_unit("");
			e[i].setD21_UQC(sourceData.getS37_UnitOfMeasurement());
			e[i].setD22_Place_of_Supply(sourceData.getS27_POS());
		//	e.setD23_Original_Place_of_Supply("");
			e[i].setD24_Section_7_Supply("N");
		//	e.setD25_Gross_Taxable_Value("");
		//	e.setD26_Charges_Before_GST("");
		//	e.setD27_Discount_Before_GST("");
			e[i].setD28_Net_Taxable_Value(sourceData.getS39_TaxableValue());
			e[i].setD29_IGST_Rate(sourceData.getS40_IntegratedTaxRate());
			e[i].setD30_IGST_Amount(sourceData.getS41_IntegratedTaxAmount());
			e[i].setD31_CGST_Rate(sourceData.getS42_CentralTaxRate());
			e[i].setD32_CGST_Amount(sourceData.getS43_CentralTaxAmount());
			e[i].setD33_SGST_Rate(sourceData.getS44_StateUTTaxRate());
			e[i].setD34_SGST_Amount(sourceData.getS45_StateUTTaxAmount());
			e[i].setD35_Cess_Rate(sourceData.getS46_CessRateAdvalorem());
			e[i].setD36_Cess_Amount(sourceData.getS47_CessAmountAdvalorem());
		//	e.setD37_Charges_After_GST("");
		//	e.setD38_Discount_After_GST("");
		//	e.setD39_Differential_Percentage("");
		//	e.setD40_Gross_Value_line_level("");
			e[i].setD41_Invoice_Value(sourceData.getS50_InvoiceValue());
			e[i].setD42_Supply_Category(sourceData.getS13_SupplyType());
			e[i].setD43_RCM(sourceData.getS51_ReverseChargeFlag());
		//	e.setD44_Zero_Rated_Supply_Type("");
		//	e.setD45_Shipping_Bill_No("");
		//	e.setD46_Shipping_Bill_Date("");
		//	e.setD47_port("");
			e[i].setD48_Division(sourceData.getS4_Division());
			e[i].setD49_Sub_location(sourceData.getS8_PlantCode());
			e[i].setD50_Ship_to_State_Code__Customer(sourceData.getS26_ShipToState());
			e[i].setD51_Ship_from_State(sourceData.getS11_State());
			e[i].setD52_Financial_period__mmyyyy(sourceData.getS9_ReturnPeriod());
		//	e.setD53_Customer_GL_Id_Number("");
		//	e.setD54_Customer_GL_Id_Name("");
		//	e.setD55_Income_GL_Id_Number("");
		//	e.setD56_Income_GL_id_Name("");
		//	e.setD57_IGST_GL_id_No("");
		//	e.setD58_CGST_GL_id_No("");
		//	e.setD59_SGST_GL_Id_No("");
		//	e.setD60_Cess_GL_Id_No("");
		//	e.setD61_Customer_ID("");
		//	e.setD62_Additional_Column_1("");
		//	e.setD63_Additional_Column_2("");
		//	e.setD64_Additional_Column_3("");
		//	e.setD65_Additional_Column_4("");
		//	e.setD66_Additional_Column_5("");
		//	e.setD67_Additional_Column_6("");
		//	e.setD68_Additional_Column_7("");
		//	e.setD70_Additional_Column_9("");
		//	e.setD71_Additional_Column_10("");
		//	e.setD72_Additional_Column_11("");
		//	e.setD73_Additional_Column_12("");
		//	e.setD74_Additional_Column_13("");
		//	e.setD75_Additional_Column_14("");
		//	e.setD76_Additional_Column_15("");
		//	System.out.println(e.getD5_Customer_GSTIN());
			destinationList.add(e[i]);
			i++;
		}
		
		exchange.getIn().setBody(destinationList);
		
	}

}
