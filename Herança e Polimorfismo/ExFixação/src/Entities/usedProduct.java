package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class usedProduct extends product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public usedProduct() {
		
	}
	public usedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f",getPrice())
				+ " (Manufacture Date: " 
				+ sdf.format(manufactureDate)
				+ ")";
	}
}
