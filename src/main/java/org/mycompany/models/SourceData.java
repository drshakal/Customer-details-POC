package org.mycompany.models;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = ",",skipFirstLine=true ,generateHeaderColumns = true)
public class SourceData {

	@DataField(pos = 1)
	private String s1_SourceIdentifier;
	@DataField(pos = 2)
	private String s2_SourceFileName;
	@DataField(pos = 3)
	private String s3_GLAccountCode;
	@DataField(pos = 4)
	private String s4_Division;
	@DataField(pos = 5)
	private String s5_SubDivision;
	@DataField(pos = 6)
	private String s6_ProfitCentre1;
	@DataField(pos = 7)
	private String s7_ProfitCentre2;
	@DataField(pos = 8)
	private String s8_PlantCode;
	@DataField(pos = 9)
	private String s9_ReturnPeriod;
	@DataField(pos = 10)
	private String s10_SupplierGSTIN;
	@DataField(pos = 11)
	private String s11_State;
	@DataField(pos = 12)
	private String s12_DocumentType;
	@DataField(pos = 13)
	private String s13_SupplyType;
	@DataField(pos = 14)
	private String s14_DocumentNumber;
	@DataField(pos = 15)
	private String s15_DocumentDate;
	@DataField(pos = 16)
	private String s16_OriginalDocumentNumber;
	@DataField(pos = 17)
	private String s17_OriginalDocumentDate;
	@DataField(pos = 18)
	private String s18_CRDRPreGST;
	@DataField(pos = 19)
	private String s19_LineNumber;
	@DataField(pos = 20)
	private String s20_CustomerGSTIN;
	
	
	@DataField(pos = 21)
	private String s21_UINorComposition;
	@DataField(pos = 22)
	private String s22_OriginalCustomerGSTIN;
	@DataField(pos = 23)
	private String s23_CustomerName;
	@DataField(pos = 24)
	private String s24_CustomerCode;
	@DataField(pos = 25)
	private String s25_BillToState;
	@DataField(pos = 26)
	private String s26_ShipToState;
	@DataField(pos = 27)
	private String s27_POS;
	@DataField(pos = 28)
	private String s28_PortCode;
	@DataField(pos = 29)
	private String s29_ShippingBillNumber;
	@DataField(pos = 30)
	private String s30_ShippingBillDate;
	@DataField(pos = 31)
	private String s31_FOB;
	@DataField(pos = 32)
	private String s32_ExportDuty;
	@DataField(pos = 33)
	private String s33_HSNorSAC;
	@DataField(pos = 34)
	private String s34_ProductCode;
	@DataField(pos = 35)
	private String s35_ProductDescription;
	@DataField(pos = 36)
	private String s36_CategoryOfProduct;
	@DataField(pos = 37)
	private String s37_UnitOfMeasurement;
	@DataField(pos = 38)
	private String s38_Quantity;
	@DataField(pos = 39)
	private String s39_TaxableValue;
	@DataField(pos = 40)
	private String s40_IntegratedTaxRate;
	
	
	@DataField(pos = 41)
	private String s41_IntegratedTaxAmount;
	@DataField(pos = 42)
	private String s42_CentralTaxRate;
	@DataField(pos = 43)
	private String s43_CentralTaxAmount;
	@DataField(pos = 44)
	private String s44_StateUTTaxRate;
	@DataField(pos = 45)
	private String s45_StateUTTaxAmount;
	@DataField(pos = 46)
	private String s46_CessRateAdvalorem;
	@DataField(pos = 47)
	private String s47_CessAmountAdvalorem;
	@DataField(pos = 48)
	private String s48_CessRateSpecific;
	@DataField(pos = 49)
	private String s49_CessAmountSpecific;
	@DataField(pos = 50)
	private String s50_InvoiceValue;
	@DataField(pos = 51)
	private String s51_ReverseChargeFlag;
	@DataField(pos = 52)
	private String s52_TCSFlag;
	@DataField(pos = 53)
	private String s53_eComGSTIN;
	@DataField(pos = 54)
	private String s54_ITCFlag;
	@DataField(pos = 55)
	private String s55_ReasonForCreditDebitNote;
	@DataField(pos = 56)
	private String s56_AccountingVoucherNumber;
	@DataField(pos = 57)
	private String s57_AccountingVoucherDate;
	@DataField(pos = 58)
	private String s58_Userdefinedfield1;
	@DataField(pos = 59)
	private String s59_Userdefinedfield2;
	@DataField(pos = 60)
	private String s60_Userdefinedfield3;
	
	
	@Override
	public String toString() {
		return "SourceData [s1_SourceIdentifier=" + s1_SourceIdentifier + ", s2_SourceFileName=" + s2_SourceFileName
				+ ", s3_GLAccountCode=" + s3_GLAccountCode + ", s4_Division=" + s4_Division + ", s5_SubDivision="
				+ s5_SubDivision + ", s6_ProfitCentre1=" + s6_ProfitCentre1 + ", s7_ProfitCentre2=" + s7_ProfitCentre2
				+ ", s8_PlantCode=" + s8_PlantCode + ", s9_ReturnPeriod=" + s9_ReturnPeriod + ", s10_SupplierGSTIN="
				+ s10_SupplierGSTIN + ", s11_State=" + s11_State + ", s12_DocumentType=" + s12_DocumentType
				+ ", s13_SupplyType=" + s13_SupplyType + ", s14_DocumentNumber=" + s14_DocumentNumber
				+ ", s15_DocumentDate=" + s15_DocumentDate + ", s16_OriginalDocumentNumber="
				+ s16_OriginalDocumentNumber + ", s17_OriginalDocumentDate=" + s17_OriginalDocumentDate
				+ ", s18_CRDRPreGST=" + s18_CRDRPreGST + ", s19_LineNumber=" + s19_LineNumber + ", s20_CustomerGSTIN="
				+ s20_CustomerGSTIN + ", s21_UINorComposition=" + s21_UINorComposition + ", s22_OriginalCustomerGSTIN="
				+ s22_OriginalCustomerGSTIN + ", s23_CustomerName=" + s23_CustomerName + ", s24_CustomerCode="
				+ s24_CustomerCode + ", s25_BillToState=" + s25_BillToState + ", s26_ShipToState=" + s26_ShipToState
				+ ", s27_POS=" + s27_POS + ", s28_PortCode=" + s28_PortCode + ", s29_ShippingBillNumber="
				+ s29_ShippingBillNumber + ", s30_ShippingBillDate=" + s30_ShippingBillDate + ", s31_FOB=" + s31_FOB
				+ ", s32_ExportDuty=" + s32_ExportDuty + ", s33_HSNorSAC=" + s33_HSNorSAC + ", s34_ProductCode="
				+ s34_ProductCode + ", s35_ProductDescription=" + s35_ProductDescription + ", s36_CategoryOfProduct="
				+ s36_CategoryOfProduct + ", s37_UnitOfMeasurement=" + s37_UnitOfMeasurement + ", s38_Quantity="
				+ s38_Quantity + ", s39_TaxableValue=" + s39_TaxableValue + ", s40_IntegratedTaxRate="
				+ s40_IntegratedTaxRate + ", s41_IntegratedTaxAmount=" + s41_IntegratedTaxAmount
				+ ", s42_CentralTaxRate=" + s42_CentralTaxRate + ", s43_CentralTaxAmount=" + s43_CentralTaxAmount
				+ ", s44_StateUTTaxRate=" + s44_StateUTTaxRate + ", s45_StateUTTaxAmount=" + s45_StateUTTaxAmount
				+ ", s46_CessRateAdvalorem=" + s46_CessRateAdvalorem + ", s47_CessAmountAdvalorem="
				+ s47_CessAmountAdvalorem + ", s48_CessRateSpecific=" + s48_CessRateSpecific
				+ ", s49_CessAmountSpecific=" + s49_CessAmountSpecific + ", s50_InvoiceValue=" + s50_InvoiceValue
				+ ", s51_ReverseChargeFlag=" + s51_ReverseChargeFlag + ", s52_TCSFlag=" + s52_TCSFlag
				+ ", s53_eComGSTIN=" + s53_eComGSTIN + ", s54_ITCFlag=" + s54_ITCFlag
				+ ", s55_ReasonForCreditDebitNote=" + s55_ReasonForCreditDebitNote + ", s56_AccountingVoucherNumber="
				+ s56_AccountingVoucherNumber + ", s57_AccountingVoucherDate=" + s57_AccountingVoucherDate
				+ ", s58_Userdefinedfield1=" + s58_Userdefinedfield1 + ", s59_Userdefinedfield2="
				+ s59_Userdefinedfield2 + ", s60_Userdefinedfield3=" + s60_Userdefinedfield3 + "]";
	}


	public String getS1_SourceIdentifier() {
		return s1_SourceIdentifier;
	}


	public void setS1_SourceIdentifier(String s1_SourceIdentifier) {
		this.s1_SourceIdentifier = s1_SourceIdentifier;
	}


	public String getS2_SourceFileName() {
		return s2_SourceFileName;
	}


	public void setS2_SourceFileName(String s2_SourceFileName) {
		this.s2_SourceFileName = s2_SourceFileName;
	}


	public String getS3_GLAccountCode() {
		return s3_GLAccountCode;
	}


	public void setS3_GLAccountCode(String s3_GLAccountCode) {
		this.s3_GLAccountCode = s3_GLAccountCode;
	}


	public String getS4_Division() {
		return s4_Division;
	}


	public void setS4_Division(String s4_Division) {
		this.s4_Division = s4_Division;
	}


	public String getS5_SubDivision() {
		return s5_SubDivision;
	}


	public void setS5_SubDivision(String s5_SubDivision) {
		this.s5_SubDivision = s5_SubDivision;
	}


	public String getS6_ProfitCentre1() {
		return s6_ProfitCentre1;
	}


	public void setS6_ProfitCentre1(String s6_ProfitCentre1) {
		this.s6_ProfitCentre1 = s6_ProfitCentre1;
	}


	public String getS7_ProfitCentre2() {
		return s7_ProfitCentre2;
	}


	public void setS7_ProfitCentre2(String s7_ProfitCentre2) {
		this.s7_ProfitCentre2 = s7_ProfitCentre2;
	}


	public String getS8_PlantCode() {
		return s8_PlantCode;
	}


	public void setS8_PlantCode(String s8_PlantCode) {
		this.s8_PlantCode = s8_PlantCode;
	}


	public String getS9_ReturnPeriod() {
		return s9_ReturnPeriod;
	}


	public void setS9_ReturnPeriod(String s9_ReturnPeriod) {
		this.s9_ReturnPeriod = s9_ReturnPeriod;
	}


	public String getS10_SupplierGSTIN() {
		return s10_SupplierGSTIN;
	}


	public void setS10_SupplierGSTIN(String s10_SupplierGSTIN) {
		this.s10_SupplierGSTIN = s10_SupplierGSTIN;
	}


	public String getS11_State() {
		return s11_State;
	}


	public void setS11_State(String s11_State) {
		this.s11_State = s11_State;
	}


	public String getS12_DocumentType() {
		return s12_DocumentType;
	}


	public void setS12_DocumentType(String s12_DocumentType) {
		this.s12_DocumentType = s12_DocumentType;
	}


	public String getS13_SupplyType() {
		return s13_SupplyType;
	}


	public void setS13_SupplyType(String s13_SupplyType) {
		this.s13_SupplyType = s13_SupplyType;
	}


	public String getS14_DocumentNumber() {
		return s14_DocumentNumber;
	}


	public void setS14_DocumentNumber(String s14_DocumentNumber) {
		this.s14_DocumentNumber = s14_DocumentNumber;
	}


	public String getS15_DocumentDate() {
		return s15_DocumentDate;
	}


	public void setS15_DocumentDate(String s15_DocumentDate) {
		this.s15_DocumentDate = s15_DocumentDate;
	}


	public String getS16_OriginalDocumentNumber() {
		return s16_OriginalDocumentNumber;
	}


	public void setS16_OriginalDocumentNumber(String s16_OriginalDocumentNumber) {
		this.s16_OriginalDocumentNumber = s16_OriginalDocumentNumber;
	}


	public String getS17_OriginalDocumentDate() {
		return s17_OriginalDocumentDate;
	}


	public void setS17_OriginalDocumentDate(String s17_OriginalDocumentDate) {
		this.s17_OriginalDocumentDate = s17_OriginalDocumentDate;
	}


	public String getS18_CRDRPreGST() {
		return s18_CRDRPreGST;
	}


	public void setS18_CRDRPreGST(String s18_CRDRPreGST) {
		this.s18_CRDRPreGST = s18_CRDRPreGST;
	}


	public String getS19_LineNumber() {
		return s19_LineNumber;
	}


	public void setS19_LineNumber(String s19_LineNumber) {
		this.s19_LineNumber = s19_LineNumber;
	}


	public String getS20_CustomerGSTIN() {
		return s20_CustomerGSTIN;
	}


	public void setS20_CustomerGSTIN(String s20_CustomerGSTIN) {
		this.s20_CustomerGSTIN = s20_CustomerGSTIN;
	}


	public String getS21_UINorComposition() {
		return s21_UINorComposition;
	}


	public void setS21_UINorComposition(String s21_UINorComposition) {
		this.s21_UINorComposition = s21_UINorComposition;
	}


	public String getS22_OriginalCustomerGSTIN() {
		return s22_OriginalCustomerGSTIN;
	}


	public void setS22_OriginalCustomerGSTIN(String s22_OriginalCustomerGSTIN) {
		this.s22_OriginalCustomerGSTIN = s22_OriginalCustomerGSTIN;
	}


	public String getS23_CustomerName() {
		return s23_CustomerName;
	}


	public void setS23_CustomerName(String s23_CustomerName) {
		this.s23_CustomerName = s23_CustomerName;
	}


	public String getS24_CustomerCode() {
		return s24_CustomerCode;
	}


	public void setS24_CustomerCode(String s24_CustomerCode) {
		this.s24_CustomerCode = s24_CustomerCode;
	}


	public String getS25_BillToState() {
		return s25_BillToState;
	}


	public void setS25_BillToState(String s25_BillToState) {
		this.s25_BillToState = s25_BillToState;
	}


	public String getS26_ShipToState() {
		return s26_ShipToState;
	}


	public void setS26_ShipToState(String s26_ShipToState) {
		this.s26_ShipToState = s26_ShipToState;
	}


	public String getS27_POS() {
		return s27_POS;
	}


	public void setS27_POS(String s27_POS) {
		this.s27_POS = s27_POS;
	}


	public String getS28_PortCode() {
		return s28_PortCode;
	}


	public void setS28_PortCode(String s28_PortCode) {
		this.s28_PortCode = s28_PortCode;
	}


	public String getS29_ShippingBillNumber() {
		return s29_ShippingBillNumber;
	}


	public void setS29_ShippingBillNumber(String s29_ShippingBillNumber) {
		this.s29_ShippingBillNumber = s29_ShippingBillNumber;
	}


	public String getS30_ShippingBillDate() {
		return s30_ShippingBillDate;
	}


	public void setS30_ShippingBillDate(String s30_ShippingBillDate) {
		this.s30_ShippingBillDate = s30_ShippingBillDate;
	}


	public String getS31_FOB() {
		return s31_FOB;
	}


	public void setS31_FOB(String s31_FOB) {
		this.s31_FOB = s31_FOB;
	}


	public String getS32_ExportDuty() {
		return s32_ExportDuty;
	}


	public void setS32_ExportDuty(String s32_ExportDuty) {
		this.s32_ExportDuty = s32_ExportDuty;
	}


	public String getS33_HSNorSAC() {
		return s33_HSNorSAC;
	}


	public void setS33_HSNorSAC(String s33_HSNorSAC) {
		this.s33_HSNorSAC = s33_HSNorSAC;
	}


	public String getS34_ProductCode() {
		return s34_ProductCode;
	}


	public void setS34_ProductCode(String s34_ProductCode) {
		this.s34_ProductCode = s34_ProductCode;
	}


	public String getS35_ProductDescription() {
		return s35_ProductDescription;
	}


	public void setS35_ProductDescription(String s35_ProductDescription) {
		this.s35_ProductDescription = s35_ProductDescription;
	}


	public String getS36_CategoryOfProduct() {
		return s36_CategoryOfProduct;
	}


	public void setS36_CategoryOfProduct(String s36_CategoryOfProduct) {
		this.s36_CategoryOfProduct = s36_CategoryOfProduct;
	}


	public String getS37_UnitOfMeasurement() {
		return s37_UnitOfMeasurement;
	}


	public void setS37_UnitOfMeasurement(String s37_UnitOfMeasurement) {
		this.s37_UnitOfMeasurement = s37_UnitOfMeasurement;
	}


	public String getS38_Quantity() {
		return s38_Quantity;
	}


	public void setS38_Quantity(String s38_Quantity) {
		this.s38_Quantity = s38_Quantity;
	}


	public String getS39_TaxableValue() {
		return s39_TaxableValue;
	}


	public void setS39_TaxableValue(String s39_TaxableValue) {
		this.s39_TaxableValue = s39_TaxableValue;
	}


	public String getS40_IntegratedTaxRate() {
		return s40_IntegratedTaxRate;
	}


	public void setS40_IntegratedTaxRate(String s40_IntegratedTaxRate) {
		this.s40_IntegratedTaxRate = s40_IntegratedTaxRate;
	}


	public String getS41_IntegratedTaxAmount() {
		return s41_IntegratedTaxAmount;
	}


	public void setS41_IntegratedTaxAmount(String s41_IntegratedTaxAmount) {
		this.s41_IntegratedTaxAmount = s41_IntegratedTaxAmount;
	}


	public String getS42_CentralTaxRate() {
		return s42_CentralTaxRate;
	}


	public void setS42_CentralTaxRate(String s42_CentralTaxRate) {
		this.s42_CentralTaxRate = s42_CentralTaxRate;
	}


	public String getS43_CentralTaxAmount() {
		return s43_CentralTaxAmount;
	}


	public void setS43_CentralTaxAmount(String s43_CentralTaxAmount) {
		this.s43_CentralTaxAmount = s43_CentralTaxAmount;
	}


	public String getS44_StateUTTaxRate() {
		return s44_StateUTTaxRate;
	}


	public void setS44_StateUTTaxRate(String s44_StateUTTaxRate) {
		this.s44_StateUTTaxRate = s44_StateUTTaxRate;
	}


	public String getS45_StateUTTaxAmount() {
		return s45_StateUTTaxAmount;
	}


	public void setS45_StateUTTaxAmount(String s45_StateUTTaxAmount) {
		this.s45_StateUTTaxAmount = s45_StateUTTaxAmount;
	}


	public String getS46_CessRateAdvalorem() {
		return s46_CessRateAdvalorem;
	}


	public void setS46_CessRateAdvalorem(String s46_CessRateAdvalorem) {
		this.s46_CessRateAdvalorem = s46_CessRateAdvalorem;
	}


	public String getS47_CessAmountAdvalorem() {
		return s47_CessAmountAdvalorem;
	}


	public void setS47_CessAmountAdvalorem(String s47_CessAmountAdvalorem) {
		this.s47_CessAmountAdvalorem = s47_CessAmountAdvalorem;
	}


	public String getS48_CessRateSpecific() {
		return s48_CessRateSpecific;
	}


	public void setS48_CessRateSpecific(String s48_CessRateSpecific) {
		this.s48_CessRateSpecific = s48_CessRateSpecific;
	}


	public String getS49_CessAmountSpecific() {
		return s49_CessAmountSpecific;
	}


	public void setS49_CessAmountSpecific(String s49_CessAmountSpecific) {
		this.s49_CessAmountSpecific = s49_CessAmountSpecific;
	}


	public String getS50_InvoiceValue() {
		return s50_InvoiceValue;
	}


	public void setS50_InvoiceValue(String s50_InvoiceValue) {
		this.s50_InvoiceValue = s50_InvoiceValue;
	}


	public String getS51_ReverseChargeFlag() {
		return s51_ReverseChargeFlag;
	}


	public void setS51_ReverseChargeFlag(String s51_ReverseChargeFlag) {
		this.s51_ReverseChargeFlag = s51_ReverseChargeFlag;
	}


	public String getS52_TCSFlag() {
		return s52_TCSFlag;
	}


	public void setS52_TCSFlag(String s52_TCSFlag) {
		this.s52_TCSFlag = s52_TCSFlag;
	}


	public String getS53_eComGSTIN() {
		return s53_eComGSTIN;
	}


	public void setS53_eComGSTIN(String s53_eComGSTIN) {
		this.s53_eComGSTIN = s53_eComGSTIN;
	}


	public String getS54_ITCFlag() {
		return s54_ITCFlag;
	}


	public void setS54_ITCFlag(String s54_ITCFlag) {
		this.s54_ITCFlag = s54_ITCFlag;
	}


	public String getS55_ReasonForCreditDebitNote() {
		return s55_ReasonForCreditDebitNote;
	}


	public void setS55_ReasonForCreditDebitNote(String s55_ReasonForCreditDebitNote) {
		this.s55_ReasonForCreditDebitNote = s55_ReasonForCreditDebitNote;
	}


	public String getS56_AccountingVoucherNumber() {
		return s56_AccountingVoucherNumber;
	}


	public void setS56_AccountingVoucherNumber(String s56_AccountingVoucherNumber) {
		this.s56_AccountingVoucherNumber = s56_AccountingVoucherNumber;
	}


	public String getS57_AccountingVoucherDate() {
		return s57_AccountingVoucherDate;
	}


	public void setS57_AccountingVoucherDate(String s57_AccountingVoucherDate) {
		this.s57_AccountingVoucherDate = s57_AccountingVoucherDate;
	}


	public String getS58_Userdefinedfield1() {
		return s58_Userdefinedfield1;
	}


	public void setS58_Userdefinedfield1(String s58_Userdefinedfield1) {
		this.s58_Userdefinedfield1 = s58_Userdefinedfield1;
	}


	public String getS59_Userdefinedfield2() {
		return s59_Userdefinedfield2;
	}


	public void setS59_Userdefinedfield2(String s59_Userdefinedfield2) {
		this.s59_Userdefinedfield2 = s59_Userdefinedfield2;
	}


	public String getS60_Userdefinedfield3() {
		return s60_Userdefinedfield3;
	}


	public void setS60_Userdefinedfield3(String s60_Userdefinedfield3) {
		this.s60_Userdefinedfield3 = s60_Userdefinedfield3;
	}
	
	
	
	
	
	
	
}
