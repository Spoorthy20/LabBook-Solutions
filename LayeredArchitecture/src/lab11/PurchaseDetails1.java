package lab11;

import java.sql.Date;

public class PurchaseDetails1 {
	
	public int purchaseid;
	public String cname;
	public String mailid;
	public String phoneno;
	public Date purchasedate;
	public int mobileid;
	
	int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public PurchaseDetails1(int purchaseid,String cname,String mailid,String phoneno,Date purchasedate,int mobileid)
	{
		this.purchasedate=purchasedate;
		this.cname=cname;
		this.mailid=mailid;
		this.phoneno=phoneno;
		this.purchasedate=purchasedate;
		this.mobileid=mobileid;
	}

}
