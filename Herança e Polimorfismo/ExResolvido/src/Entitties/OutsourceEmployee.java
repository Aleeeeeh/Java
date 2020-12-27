package Entitties;

public class OutsourceEmployee extends employee{
	private double additionalCharge;
	
	public OutsourceEmployee() {
		
	}
	public OutsourceEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	public double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAddiotionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
