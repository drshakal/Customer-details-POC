package org.mycompany.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity(name="toSQL")
@CsvRecord( separator = ",",skipFirstLine=true ,generateHeaderColumns = true)
public class DestinationData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="d1_Supplier_GSTIN",length = 30)
	@DataField(pos = 1)
	private String d1_Supplier_GSTIN;
	
	@Column(name="d2_Transaction_Type",length = 30)
	@DataField(pos = 2)
	private String d2_Transaction_Type;
	
	@Column(name="d3_Original_Transaction_Type",length = 30)
	@DataField(pos = 3)
	private String d3_Original_Transaction_Type;
	
	@Column(name="d4_Nature_of_Document",length = 30)
	@DataField(pos = 4)
	private String d4_Nature_of_Document;
	
	@Column(name="d5_Customer_GSTIN",length = 30)
	@DataField(pos = 5)
	private String d5_Customer_GSTIN;
	
	@Column(name="d6_Original_Customer_GSTIN",length = 30)
	@DataField(pos = 6)
	private String d6_Original_Customer_GSTIN;
	
	@Column(name="d7_e_commerce_GSTIN",length = 30)
	@DataField(pos = 7)
	private String d7_e_commerce_GSTIN;
	
	@Column(name="d8_Customer_Name",length = 100)
	@DataField(pos = 8)
	private String d8_Customer_Name;
	
	@Column(name="d9_ERP_Transaction_ID",length = 100)
	@DataField(pos = 9)
	private String d9_ERP_Transaction_ID;
	
	@Column(name="d10_document_no",length = 30)
	@DataField(pos = 10)
	private String d10_document_no;
	
	@Column(name="d11_document_date",length = 30)
	@DataField(pos = 11)
	private String d11_document_date;
	
	@Column(name="d12_Document_Cancellation_Date",length = 30)
	@DataField(pos = 12)
	private String d12_Document_Cancellation_Date;
	
	@Column(name="d13_Original_Document_No",length = 30)
	@DataField(pos = 13)
	private String d13_Original_Document_No;
	
	@Column(name="d14_Original_Document_Date",length = 30)
	@DataField(pos = 14)
	private String d14_Original_Document_Date;
	
	@Column(name="d15_Line_Item_ID",length = 30)
	@DataField(pos = 15)
	private String d15_Line_Item_ID;
	
	@Column(name="d16_Goods_and_Services",length = 30)
	@DataField(pos = 16)
	private String d16_Goods_and_Services;
	
	@Column(name="d17_HSN",length = 30)
	@DataField(pos = 17)
	private String d17_HSN;
	
	@Column(name="d18_HSN_Description",length = 30)
	@DataField(pos = 18)
	private String d18_HSN_Description;
	
	@Column(name="d19_quantity",length = 30)
	@DataField(pos = 19)
	private String d19_quantity;
	
	@Column(name="d30_Price_per_unit",length = 30)
	@DataField(pos = 20)
	private String d20_Price_per_unit;
	
	@Column(name="d21_UQC",length = 30)
	@DataField(pos = 21)
	private String d21_UQC;
	
	@Column(name="d22_Place_of_Supply",length = 30)
	@DataField(pos = 22)
	private String d22_Place_of_Supply;
	
	@Column(name="d23_Original_Place_of_Supply",length = 30)
	@DataField(pos = 23)
	private String d23_Original_Place_of_Supply;
	
	@Column(name="d24_Section_7_Supply",length = 30)
	@DataField(pos = 24)
	private String d24_Section_7_Supply;
	
	@Column(name="d25_Gross_Taxable_Value",length = 30)
	@DataField(pos = 25)
	private String d25_Gross_Taxable_Value;
	
	@Column(name="d26_Charges_Before_GST",length = 30)
	@DataField(pos = 26)
	private String d26_Charges_Before_GST;
	
	@Column(name="d27_Discount_Before_GST",length = 30)
	@DataField(pos = 27)
	private String d27_Discount_Before_GST;
	
	@Column(name="d28_Net_Taxable_Value",length = 30)
	@DataField(pos = 28)
	private String d28_Net_Taxable_Value;
	
	@Column(name="d29_IGST_Rate",length = 30)
	@DataField(pos = 29)
	private String d29_IGST_Rate;
	
	@Column(name="d30_IGST_Amount",length = 30)
	@DataField(pos = 30)
	private String d30_IGST_Amount;
	
	@Column(name="d31_CGST_Rate",length = 30)
	@DataField(pos = 31)
	private String d31_CGST_Rate;
	
	@Column(name="d32_CGST_Amount",length = 30)
	@DataField(pos = 32)
	private String d32_CGST_Amount;
	
	@Column(name="d33_SGST_Rate",length = 30)
	@DataField(pos = 33)
	private String d33_SGST_Rate;
	
	@Column(name="d34_SGST_Amount",length = 30)
	@DataField(pos = 34)
	private String d34_SGST_Amount;
	
	@Column(name="d35_Cess_Rate",length = 30)
	@DataField(pos = 35)
	private String d35_Cess_Rate;
	
	@Column(name="d36_Cess_Amount",length = 30)
	@DataField(pos = 36)
	private String d36_Cess_Amount;
	
	@Column(name="d37_Charges_After_GST",length = 30)
	@DataField(pos = 37)
	private String d37_Charges_After_GST;
	
	@Column(name="d38_Discount_After_GST",length = 30)
	@DataField(pos = 38)
	private String d38_Discount_After_GST;
	
	@Column(name="d39_Differential_Percentage",length = 30)
	@DataField(pos = 39)
	private String d39_Differential_Percentage;
	
	@Column(name="d40_Gross_Value_line_level",length = 30)
	@DataField(pos = 40)
	private String d40_Gross_Value_line_level;
	
	@Column(name="d41_Invoice_Value",length = 30)
	@DataField(pos = 41)
	private String d41_Invoice_Value;
	
	@Column(name="d42_Supply_Category",length = 30)
	@DataField(pos = 42)
	private String d42_Supply_Category;
	
	@Column(name="d43_RCM",length = 30)
	@DataField(pos = 43)
	private String d43_RCM;
	
	@Column(name="d44_Zero_Rated_Supply_Type",length = 30)
	@DataField(pos = 44)
	private String d44_Zero_Rated_Supply_Type;
	
	@Column(name="d45_Shipping_Bill_No",length = 30)
	@DataField(pos = 45)
	private String d45_Shipping_Bill_No;
	
	@Column(name="d46_Shipping_Bill_Date",length = 30)
	@DataField(pos = 46)
	private String d46_Shipping_Bill_Date;
	
	@Column(name="d47_port",length = 30)
	@DataField(pos = 47)
	private String d47_port;
	
	@Column(name="d48_Division",length = 30)
	@DataField(pos = 48)
	private String d48_Division;
	
	@Column(name="d49_Sub_location",length = 30)
	@DataField(pos = 49)
	private String d49_Sub_location;
	
	@Column(name="d50_Ship_to_State_Code__Customer",length = 30)
	@DataField(pos = 50)
	private String d50_Ship_to_State_Code__Customer;
	
	@Column(name="d51_Ship_from_State",length = 30)
	@DataField(pos = 51)
	private String d51_Ship_from_State;
	
	@Column(name="d52_Financial_period__mmyyyy",length = 30)
	@DataField(pos = 52)
	private String d52_Financial_period__mmyyyy;
	
	@Column(name="d53_Customer_GL_Id_Number",length = 30)
	@DataField(pos = 53)
	private String d53_Customer_GL_Id_Number;
	
	@Column(name="d54_Customer_GL_Id_Name",length = 30)
	@DataField(pos = 54)
	private String d54_Customer_GL_Id_Name;
	
	@Column(name="d55_Income_GL_Id_Number",length = 30)
	@DataField(pos = 55)
	private String d55_Income_GL_Id_Number;
	
	@Column(name="d56_Income_GL_id_Name",length = 30)
	@DataField(pos = 56)
	private String d56_Income_GL_id_Name;
	
	@Column(name="d57_IGST_GL_id_No",length = 30)
	@DataField(pos = 57)
	private String d57_IGST_GL_id_No;
	
	@Column(name="d58_CGST_GL_id_No",length = 30)
	@DataField(pos = 58)
	private String d58_CGST_GL_id_No;
	
	@Column(name="d59_SGST_GL_Id_No",length = 30)
	@DataField(pos = 59)
	private String d59_SGST_GL_Id_No;
	
	@Column(name="d60_Cess_GL_Id_No",length = 30)
	@DataField(pos = 60)
	private String d60_Cess_GL_Id_No;
	
	@Column(name="d61_Customer_ID",length = 30)
	@DataField(pos = 61)
	private String d61_Customer_ID;
	
	@Column(name="d62_Additional_Column_1",length = 30)
	@DataField(pos = 62)
	private String d62_Additional_Column_1;
	
	@Column(name="d63_Additional_Column_2",length = 30)
	@DataField(pos = 63)
	private String d63_Additional_Column_2;
	
	@Column(name="d64_Additional_Column_3",length = 30)
	@DataField(pos = 64)
	private String d64_Additional_Column_3;
	
	@Column(name="d65_Additional_Column_4",length = 30)
	@DataField(pos = 65)
	private String d65_Additional_Column_4;
	
	@Column(name="d66_Additional_Column_5",length = 30)
	@DataField(pos = 66)
	private String d66_Additional_Column_5;
	
	@Column(name="d67_Additional_Column_6",length = 30)
	@DataField(pos = 67)
	private String d67_Additional_Column_6;
	
	@Column(name="d68_Additional_Column_7",length = 30)
	@DataField(pos = 68)
	private String d68_Additional_Column_7;
	
	@Column(name="d69_Additional_Column_8",length = 30)
	@DataField(pos = 69)
	private String d69_Additional_Column_8;
	
	@Column(name="d70_Additional_Column_9",length = 30)
	@DataField(pos = 70)
	private String d70_Additional_Column_9;
	
	@Column(name="d71_Additional_Column_10",length = 30)
	@DataField(pos = 71)
	private String d71_Additional_Column_10;
	
	@Column(name="d72_Additional_Column_11",length = 30)
	@DataField(pos = 72)
	private String d72_Additional_Column_11;
	
	@Column(name="d73_Additional_Column_12",length = 30)
	@DataField(pos = 73)
	private String d73_Additional_Column_12;
	
	@Column(name="d74_Additional_Column_13",length = 30)
	@DataField(pos = 74)
	private String d74_Additional_Column_13;
	
	@Column(name="d75_Additional_Column_14",length = 30)
	@DataField(pos = 75)
	private String d75_Additional_Column_14;
	
	@Column(name="d76_Additional_Column_15",length = 30)
	@DataField(pos = 76)
	private String d76_Additional_Column_15;
	
	
	
	
	@Override
	public String toString() {
		return "DestinationData [d1_Supplier_GSTIN=" + d1_Supplier_GSTIN + ", d2_Transaction_Type="
				+ d2_Transaction_Type + ", d3_Original_Transaction_Type=" + d3_Original_Transaction_Type
				+ ", d4_Nature_of_Document=" + d4_Nature_of_Document + ", d5_Customer_GSTIN=" + d5_Customer_GSTIN
				+ ", d6_Original_Customer_GSTIN=" + d6_Original_Customer_GSTIN + ", d7_e_commerce_GSTIN="
				+ d7_e_commerce_GSTIN + ", d8_Customer_Name=" + d8_Customer_Name + ", d9_ERP_Transaction_ID="
				+ d9_ERP_Transaction_ID + ", d10_document_no=" + d10_document_no + ", d11_document_date="
				+ d11_document_date + ", d12_Document_Cancellation_Date=" + d12_Document_Cancellation_Date
				+ ", d13_Original_Document_No=" + d13_Original_Document_No + ", d14_Original_Document_Date="
				+ d14_Original_Document_Date + ", d15_Line_Item_ID=" + d15_Line_Item_ID + ", d16_Goods_and_Services="
				+ d16_Goods_and_Services + ", d17_HSN=" + d17_HSN + ", d18_HSN_Description=" + d18_HSN_Description
				+ ", d19_quantity=" + d19_quantity + ", d20_Price_per_unit=" + d20_Price_per_unit + ", d21_UQC="
				+ d21_UQC + ", d22_Place_of_Supply=" + d22_Place_of_Supply + ", d23_Original_Place_of_Supply="
				+ d23_Original_Place_of_Supply + ", d24_Section_7_Supply=" + d24_Section_7_Supply
				+ ", d25_Gross_Taxable_Value=" + d25_Gross_Taxable_Value + ", d26_Charges_Before_GST="
				+ d26_Charges_Before_GST + ", d27_Discount_Before_GST=" + d27_Discount_Before_GST
				+ ", d28_Net_Taxable_Value=" + d28_Net_Taxable_Value + ", d29_IGST_Rate=" + d29_IGST_Rate
				+ ", d30_IGST_Amount=" + d30_IGST_Amount + ", d31_CGST_Rate=" + d31_CGST_Rate + ", d32_CGST_Amount="
				+ d32_CGST_Amount + ", d33_SGST_Rate=" + d33_SGST_Rate + ", d34_SGST_Amount=" + d34_SGST_Amount
				+ ", d35_Cess_Rate=" + d35_Cess_Rate + ", d36_Cess_Amount=" + d36_Cess_Amount
				+ ", d37_Charges_After_GST=" + d37_Charges_After_GST + ", d38_Discount_After_GST="
				+ d38_Discount_After_GST + ", d39_Differential_Percentage=" + d39_Differential_Percentage
				+ ", d40_Gross_Value_line_level=" + d40_Gross_Value_line_level + ", d41_Invoice_Value="
				+ d41_Invoice_Value + ", d42_Supply_Category=" + d42_Supply_Category + ", d43_RCM=" + d43_RCM
				+ ", d44_Zero_Rated_Supply_Type=" + d44_Zero_Rated_Supply_Type + ", d45_Shipping_Bill_No="
				+ d45_Shipping_Bill_No + ", d46_Shipping_Bill_Date=" + d46_Shipping_Bill_Date + ", d47_port=" + d47_port
				+ ", d48_Division=" + d48_Division + ", d49_Sub_location=" + d49_Sub_location
				+ ", d50_Ship_to_State_Code__Customer=" + d50_Ship_to_State_Code__Customer + ", d51_Ship_from_State="
				+ d51_Ship_from_State + ", d52_Financial_period__mmyyyy=" + d52_Financial_period__mmyyyy
				+ ", d53_Customer_GL_Id_Number=" + d53_Customer_GL_Id_Number + ", d54_Customer_GL_Id_Name="
				+ d54_Customer_GL_Id_Name + ", d55_Income_GL_Id_Number=" + d55_Income_GL_Id_Number
				+ ", d56_Income_GL_id_Name=" + d56_Income_GL_id_Name + ", d57_IGST_GL_id_No=" + d57_IGST_GL_id_No
				+ ", d58_CGST_GL_id_No=" + d58_CGST_GL_id_No + ", d59_SGST_GL_Id_No=" + d59_SGST_GL_Id_No
				+ ", d60_Cess_GL_Id_No=" + d60_Cess_GL_Id_No + ", d61_Customer_ID=" + d61_Customer_ID
				+ ", d62_Additional_Column_1=" + d62_Additional_Column_1 + ", d63_Additional_Column_2="
				+ d63_Additional_Column_2 + ", d64_Additional_Column_3=" + d64_Additional_Column_3
				+ ", d65_Additional_Column_4=" + d65_Additional_Column_4 + ", d66_Additional_Column_5="
				+ d66_Additional_Column_5 + ", d67_Additional_Column_6=" + d67_Additional_Column_6
				+ ", d68_Additional_Column_7=" + d68_Additional_Column_7 + ", d69_Additional_Column_8="
				+ d69_Additional_Column_8 + ", d70_Additional_Column_9=" + d70_Additional_Column_9
				+ ", d71_Additional_Column_10=" + d71_Additional_Column_10 + ", d72_Additional_Column_11="
				+ d72_Additional_Column_11 + ", d73_Additional_Column_12=" + d73_Additional_Column_12
				+ ", d74_Additional_Column_13=" + d74_Additional_Column_13 + ", d75_Additional_Column_14="
				+ d75_Additional_Column_14 + ", d76_Additional_Column_15=" + d76_Additional_Column_15 + "]";
	}


	public String getD1_Supplier_GSTIN() {
		return d1_Supplier_GSTIN;
	}


	public void setD1_Supplier_GSTIN(String d1_Supplier_GSTIN) {
		this.d1_Supplier_GSTIN = d1_Supplier_GSTIN;
	}


	public String getD2_Transaction_Type() {
		return d2_Transaction_Type;
	}


	public void setD2_Transaction_Type(String d2_Transaction_Type) {
		this.d2_Transaction_Type = d2_Transaction_Type;
	}


	public String getD3_Original_Transaction_Type() {
		return d3_Original_Transaction_Type;
	}


	public void setD3_Original_Transaction_Type(String d3_Original_Transaction_Type) {
		this.d3_Original_Transaction_Type = d3_Original_Transaction_Type;
	}


	public String getD4_Nature_of_Document() {
		return d4_Nature_of_Document;
	}


	public void setD4_Nature_of_Document(String d4_Nature_of_Document) {
		this.d4_Nature_of_Document = d4_Nature_of_Document;
	}


	public String getD5_Customer_GSTIN() {
		return d5_Customer_GSTIN;
	}


	public void setD5_Customer_GSTIN(String d5_Customer_GSTIN) {
		this.d5_Customer_GSTIN = d5_Customer_GSTIN;
	}


	public String getD6_Original_Customer_GSTIN() {
		return d6_Original_Customer_GSTIN;
	}


	public void setD6_Original_Customer_GSTIN(String d6_Original_Customer_GSTIN) {
		this.d6_Original_Customer_GSTIN = d6_Original_Customer_GSTIN;
	}


	public String getD7_e_commerce_GSTIN() {
		return d7_e_commerce_GSTIN;
	}


	public void setD7_e_commerce_GSTIN(String d7_e_commerce_GSTIN) {
		this.d7_e_commerce_GSTIN = d7_e_commerce_GSTIN;
	}


	public String getD8_Customer_Name() {
		return d8_Customer_Name;
	}


	public void setD8_Customer_Name(String d8_Customer_Name) {
		this.d8_Customer_Name = d8_Customer_Name;
	}


	public String getD9_ERP_Transaction_ID() {
		return d9_ERP_Transaction_ID;
	}


	public void setD9_ERP_Transaction_ID(String d9_ERP_Transaction_ID) {
		this.d9_ERP_Transaction_ID = d9_ERP_Transaction_ID;
	}


	public String getD10_document_no() {
		return d10_document_no;
	}


	public void setD10_document_no(String d10_document_no) {
		this.d10_document_no = d10_document_no;
	}


	public String getD11_document_date() {
		return d11_document_date;
	}


	public void setD11_document_date(String d11_document_date) {
		this.d11_document_date = d11_document_date;
	}


	public String getD12_Document_Cancellation_Date() {
		return d12_Document_Cancellation_Date;
	}


	public void setD12_Document_Cancellation_Date(String d12_Document_Cancellation_Date) {
		this.d12_Document_Cancellation_Date = d12_Document_Cancellation_Date;
	}


	public String getD13_Original_Document_No() {
		return d13_Original_Document_No;
	}


	public void setD13_Original_Document_No(String d13_Original_Document_No) {
		this.d13_Original_Document_No = d13_Original_Document_No;
	}


	public String getD14_Original_Document_Date() {
		return d14_Original_Document_Date;
	}


	public void setD14_Original_Document_Date(String d14_Original_Document_Date) {
		this.d14_Original_Document_Date = d14_Original_Document_Date;
	}


	public String getD15_Line_Item_ID() {
		return d15_Line_Item_ID;
	}


	public void setD15_Line_Item_ID(String d15_Line_Item_ID) {
		this.d15_Line_Item_ID = d15_Line_Item_ID;
	}


	public String getD16_Goods_and_Services() {
		return d16_Goods_and_Services;
	}


	public void setD16_Goods_and_Services(String d16_Goods_and_Services) {
		this.d16_Goods_and_Services = d16_Goods_and_Services;
	}


	public String getD17_HSN() {
		return d17_HSN;
	}


	public void setD17_HSN(String d17_HSN) {
		this.d17_HSN = d17_HSN;
	}


	public String getD18_HSN_Description() {
		return d18_HSN_Description;
	}


	public void setD18_HSN_Description(String d18_HSN_Description) {
		this.d18_HSN_Description = d18_HSN_Description;
	}


	public String getD19_quantity() {
		return d19_quantity;
	}


	public void setD19_quantity(String d19_quantity) {
		this.d19_quantity = d19_quantity;
	}


	public String getD20_Price_per_unit() {
		return d20_Price_per_unit;
	}


	public void setD20_Price_per_unit(String d30_Price_per_unit) {
		this.d20_Price_per_unit = d30_Price_per_unit;
	}


	public String getD21_UQC() {
		return d21_UQC;
	}


	public void setD21_UQC(String d21_UQC) {
		this.d21_UQC = d21_UQC;
	}


	public String getD22_Place_of_Supply() {
		return d22_Place_of_Supply;
	}


	public void setD22_Place_of_Supply(String d22_Place_of_Supply) {
		this.d22_Place_of_Supply = d22_Place_of_Supply;
	}


	public String getD23_Original_Place_of_Supply() {
		return d23_Original_Place_of_Supply;
	}


	public void setD23_Original_Place_of_Supply(String d23_Original_Place_of_Supply) {
		this.d23_Original_Place_of_Supply = d23_Original_Place_of_Supply;
	}


	public String getD24_Section_7_Supply() {
		return d24_Section_7_Supply;
	}


	public void setD24_Section_7_Supply(String d24_Section_7_Supply) {
		this.d24_Section_7_Supply = d24_Section_7_Supply;
	}


	public String getD25_Gross_Taxable_Value() {
		return d25_Gross_Taxable_Value;
	}


	public void setD25_Gross_Taxable_Value(String d25_Gross_Taxable_Value) {
		this.d25_Gross_Taxable_Value = d25_Gross_Taxable_Value;
	}


	public String getD26_Charges_Before_GST() {
		return d26_Charges_Before_GST;
	}


	public void setD26_Charges_Before_GST(String d26_Charges_Before_GST) {
		this.d26_Charges_Before_GST = d26_Charges_Before_GST;
	}


	public String getD27_Discount_Before_GST() {
		return d27_Discount_Before_GST;
	}


	public void setD27_Discount_Before_GST(String d27_Discount_Before_GST) {
		this.d27_Discount_Before_GST = d27_Discount_Before_GST;
	}


	public String getD28_Net_Taxable_Value() {
		return d28_Net_Taxable_Value;
	}


	public void setD28_Net_Taxable_Value(String d28_Net_Taxable_Value) {
		this.d28_Net_Taxable_Value = d28_Net_Taxable_Value;
	}


	public String getD29_IGST_Rate() {
		return d29_IGST_Rate;
	}


	public void setD29_IGST_Rate(String d29_IGST_Rate) {
		this.d29_IGST_Rate = d29_IGST_Rate;
	}


	public String getD30_IGST_Amount() {
		return d30_IGST_Amount;
	}


	public void setD30_IGST_Amount(String d30_IGST_Amount) {
		this.d30_IGST_Amount = d30_IGST_Amount;
	}


	public String getD31_CGST_Rate() {
		return d31_CGST_Rate;
	}


	public void setD31_CGST_Rate(String d31_CGST_Rate) {
		this.d31_CGST_Rate = d31_CGST_Rate;
	}


	public String getD32_CGST_Amount() {
		return d32_CGST_Amount;
	}


	public void setD32_CGST_Amount(String d32_CGST_Amount) {
		this.d32_CGST_Amount = d32_CGST_Amount;
	}


	public String getD33_SGST_Rate() {
		return d33_SGST_Rate;
	}


	public void setD33_SGST_Rate(String d33_SGST_Rate) {
		this.d33_SGST_Rate = d33_SGST_Rate;
	}


	public String getD34_SGST_Amount() {
		return d34_SGST_Amount;
	}


	public void setD34_SGST_Amount(String d34_SGST_Amount) {
		this.d34_SGST_Amount = d34_SGST_Amount;
	}


	public String getD35_Cess_Rate() {
		return d35_Cess_Rate;
	}


	public void setD35_Cess_Rate(String d35_Cess_Rate) {
		this.d35_Cess_Rate = d35_Cess_Rate;
	}


	public String getD36_Cess_Amount() {
		return d36_Cess_Amount;
	}


	public void setD36_Cess_Amount(String d36_Cess_Amount) {
		this.d36_Cess_Amount = d36_Cess_Amount;
	}


	public String getD37_Charges_After_GST() {
		return d37_Charges_After_GST;
	}


	public void setD37_Charges_After_GST(String d37_Charges_After_GST) {
		this.d37_Charges_After_GST = d37_Charges_After_GST;
	}


	public String getD38_Discount_After_GST() {
		return d38_Discount_After_GST;
	}


	public void setD38_Discount_After_GST(String d38_Discount_After_GST) {
		this.d38_Discount_After_GST = d38_Discount_After_GST;
	}


	public String getD39_Differential_Percentage() {
		return d39_Differential_Percentage;
	}


	public void setD39_Differential_Percentage(String d39_Differential_Percentage) {
		this.d39_Differential_Percentage = d39_Differential_Percentage;
	}


	public String getD40_Gross_Value_line_level() {
		return d40_Gross_Value_line_level;
	}


	public void setD40_Gross_Value_line_level(String d40_Gross_Value_line_level) {
		this.d40_Gross_Value_line_level = d40_Gross_Value_line_level;
	}


	public String getD41_Invoice_Value() {
		return d41_Invoice_Value;
	}


	public void setD41_Invoice_Value(String d41_Invoice_Value) {
		this.d41_Invoice_Value = d41_Invoice_Value;
	}


	public String getD42_Supply_Category() {
		return d42_Supply_Category;
	}


	public void setD42_Supply_Category(String d42_Supply_Category) {
		this.d42_Supply_Category = d42_Supply_Category;
	}


	public String getD43_RCM() {
		return d43_RCM;
	}


	public void setD43_RCM(String d43_RCM) {
		this.d43_RCM = d43_RCM;
	}


	public String getD44_Zero_Rated_Supply_Type() {
		return d44_Zero_Rated_Supply_Type;
	}


	public void setD44_Zero_Rated_Supply_Type(String d44_Zero_Rated_Supply_Type) {
		this.d44_Zero_Rated_Supply_Type = d44_Zero_Rated_Supply_Type;
	}


	public String getD45_Shipping_Bill_No() {
		return d45_Shipping_Bill_No;
	}


	public void setD45_Shipping_Bill_No(String d45_Shipping_Bill_No) {
		this.d45_Shipping_Bill_No = d45_Shipping_Bill_No;
	}


	public String getD46_Shipping_Bill_Date() {
		return d46_Shipping_Bill_Date;
	}


	public void setD46_Shipping_Bill_Date(String d46_Shipping_Bill_Date) {
		this.d46_Shipping_Bill_Date = d46_Shipping_Bill_Date;
	}


	public String getD47_port() {
		return d47_port;
	}


	public void setD47_port(String d47_port) {
		this.d47_port = d47_port;
	}


	public String getD48_Division() {
		return d48_Division;
	}


	public void setD48_Division(String d48_Division) {
		this.d48_Division = d48_Division;
	}


	public String getD49_Sub_location() {
		return d49_Sub_location;
	}


	public void setD49_Sub_location(String d49_Sub_location) {
		this.d49_Sub_location = d49_Sub_location;
	}


	public String getD50_Ship_to_State_Code__Customer() {
		return d50_Ship_to_State_Code__Customer;
	}


	public void setD50_Ship_to_State_Code__Customer(String d50_Ship_to_State_Code__Customer) {
		this.d50_Ship_to_State_Code__Customer = d50_Ship_to_State_Code__Customer;
	}


	public String getD51_Ship_from_State() {
		return d51_Ship_from_State;
	}


	public void setD51_Ship_from_State(String d51_Ship_from_State) {
		this.d51_Ship_from_State = d51_Ship_from_State;
	}


	public String getD52_Financial_period__mmyyyy() {
		return d52_Financial_period__mmyyyy;
	}


	public void setD52_Financial_period__mmyyyy(String d52_Financial_period__mmyyyy) {
		this.d52_Financial_period__mmyyyy = d52_Financial_period__mmyyyy;
	}


	public String getD53_Customer_GL_Id_Number() {
		return d53_Customer_GL_Id_Number;
	}


	public void setD53_Customer_GL_Id_Number(String d53_Customer_GL_Id_Number) {
		this.d53_Customer_GL_Id_Number = d53_Customer_GL_Id_Number;
	}


	public String getD54_Customer_GL_Id_Name() {
		return d54_Customer_GL_Id_Name;
	}


	public void setD54_Customer_GL_Id_Name(String d54_Customer_GL_Id_Name) {
		this.d54_Customer_GL_Id_Name = d54_Customer_GL_Id_Name;
	}


	public String getD55_Income_GL_Id_Number() {
		return d55_Income_GL_Id_Number;
	}


	public void setD55_Income_GL_Id_Number(String d55_Income_GL_Id_Number) {
		this.d55_Income_GL_Id_Number = d55_Income_GL_Id_Number;
	}


	public String getD56_Income_GL_id_Name() {
		return d56_Income_GL_id_Name;
	}


	public void setD56_Income_GL_id_Name(String d56_Income_GL_id_Name) {
		this.d56_Income_GL_id_Name = d56_Income_GL_id_Name;
	}


	public String getD57_IGST_GL_id_No() {
		return d57_IGST_GL_id_No;
	}


	public void setD57_IGST_GL_id_No(String d57_IGST_GL_id_No) {
		this.d57_IGST_GL_id_No = d57_IGST_GL_id_No;
	}


	public String getD58_CGST_GL_id_No() {
		return d58_CGST_GL_id_No;
	}


	public void setD58_CGST_GL_id_No(String d58_CGST_GL_id_No) {
		this.d58_CGST_GL_id_No = d58_CGST_GL_id_No;
	}


	public String getD59_SGST_GL_Id_No() {
		return d59_SGST_GL_Id_No;
	}


	public void setD59_SGST_GL_Id_No(String d59_SGST_GL_Id_No) {
		this.d59_SGST_GL_Id_No = d59_SGST_GL_Id_No;
	}


	public String getD60_Cess_GL_Id_No() {
		return d60_Cess_GL_Id_No;
	}


	public void setD60_Cess_GL_Id_No(String d60_Cess_GL_Id_No) {
		this.d60_Cess_GL_Id_No = d60_Cess_GL_Id_No;
	}


	public String getD61_Customer_ID() {
		return d61_Customer_ID;
	}


	public void setD61_Customer_ID(String d61_Customer_ID) {
		this.d61_Customer_ID = d61_Customer_ID;
	}


	public String getD62_Additional_Column_1() {
		return d62_Additional_Column_1;
	}


	public void setD62_Additional_Column_1(String d62_Additional_Column_1) {
		this.d62_Additional_Column_1 = d62_Additional_Column_1;
	}


	public String getD63_Additional_Column_2() {
		return d63_Additional_Column_2;
	}


	public void setD63_Additional_Column_2(String d63_Additional_Column_2) {
		this.d63_Additional_Column_2 = d63_Additional_Column_2;
	}


	public String getD64_Additional_Column_3() {
		return d64_Additional_Column_3;
	}


	public void setD64_Additional_Column_3(String d64_Additional_Column_3) {
		this.d64_Additional_Column_3 = d64_Additional_Column_3;
	}


	public String getD65_Additional_Column_4() {
		return d65_Additional_Column_4;
	}


	public void setD65_Additional_Column_4(String d65_Additional_Column_4) {
		this.d65_Additional_Column_4 = d65_Additional_Column_4;
	}


	public String getD66_Additional_Column_5() {
		return d66_Additional_Column_5;
	}


	public void setD66_Additional_Column_5(String d66_Additional_Column_5) {
		this.d66_Additional_Column_5 = d66_Additional_Column_5;
	}


	public String getD67_Additional_Column_6() {
		return d67_Additional_Column_6;
	}


	public void setD67_Additional_Column_6(String d67_Additional_Column_6) {
		this.d67_Additional_Column_6 = d67_Additional_Column_6;
	}


	public String getD68_Additional_Column_7() {
		return d68_Additional_Column_7;
	}


	public void setD68_Additional_Column_7(String d68_Additional_Column_7) {
		this.d68_Additional_Column_7 = d68_Additional_Column_7;
	}


	public String getD69_Additional_Column_8() {
		return d69_Additional_Column_8;
	}


	public void setD69_Additional_Column_8(String d69_Additional_Column_8) {
		this.d69_Additional_Column_8 = d69_Additional_Column_8;
	}


	public String getD70_Additional_Column_9() {
		return d70_Additional_Column_9;
	}


	public void setD70_Additional_Column_9(String d70_Additional_Column_9) {
		this.d70_Additional_Column_9 = d70_Additional_Column_9;
	}


	public String getD71_Additional_Column_10() {
		return d71_Additional_Column_10;
	}


	public void setD71_Additional_Column_10(String d71_Additional_Column_10) {
		this.d71_Additional_Column_10 = d71_Additional_Column_10;
	}


	public String getD72_Additional_Column_11() {
		return d72_Additional_Column_11;
	}


	public void setD72_Additional_Column_11(String d72_Additional_Column_11) {
		this.d72_Additional_Column_11 = d72_Additional_Column_11;
	}


	public String getD73_Additional_Column_12() {
		return d73_Additional_Column_12;
	}


	public void setD73_Additional_Column_12(String d73_Additional_Column_12) {
		this.d73_Additional_Column_12 = d73_Additional_Column_12;
	}


	public String getD74_Additional_Column_13() {
		return d74_Additional_Column_13;
	}


	public void setD74_Additional_Column_13(String d74_Additional_Column_13) {
		this.d74_Additional_Column_13 = d74_Additional_Column_13;
	}


	public String getD75_Additional_Column_14() {
		return d75_Additional_Column_14;
	}


	public void setD75_Additional_Column_14(String d75_Additional_Column_14) {
		this.d75_Additional_Column_14 = d75_Additional_Column_14;
	}


	public String getD76_Additional_Column_15() {
		return d76_Additional_Column_15;
	}


	public void setD76_Additional_Column_15(String d76_Additional_Column_15) {
		this.d76_Additional_Column_15 = d76_Additional_Column_15;
	}
	
	
	

}
