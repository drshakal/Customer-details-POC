package org.mycompany.DetailsCustomer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="cmobileNumber")
	private long cmobileNumber;
	@Column(name="cemail")
	private String cemail;
	@Column(name="caddress")
	private String caddress;
	@Column(name="ccity")
	private String ccity;
	@Column(name="ccountry")
	private String ccountry;
	@Column(name="cpostalCode")
	private int  cpostalCode;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCmobileNumber() {
		return cmobileNumber;
	}
	public void setCmobileNumber(long cmobileNumber) {
		this.cmobileNumber = cmobileNumber;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCcountry() {
		return ccountry;
	}
	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}
	public int getCpostalCode() {
		return cpostalCode;
	}
	public void setCpostalCode(int cpostalCode) {
		this.cpostalCode = cpostalCode;
	}
	@Override
	public String toString() {
		return "CustomerDetails [cid=" + cid + ", cname=" + cname + ", cmobileNumber=" + cmobileNumber + ", cemail="
				+ cemail + ", caddress=" + caddress + ", ccity=" + ccity + ", ccountry=" + ccountry + ", cpostalCode="
				+ cpostalCode + "]";
	}
	
	
	
   
	

	
	
}
