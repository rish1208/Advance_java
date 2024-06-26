package in.co.rays.bean;

import java.util.Date;

public class VehicleBean {
	
	private int id;
	private String name;
	private String purchaseBy;
	private Date purchaseDate;
	private String company;
	private String manufacturedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurchaseBy() {
		return purchaseBy;
	}
	public void setPurchaseBy(String purchaseBy) {
		this.purchaseBy = purchaseBy;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getManufacturedBy() {
		return manufacturedBy;
	}
	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

}
