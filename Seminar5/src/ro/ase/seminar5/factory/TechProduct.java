package ro.ase.seminar5.factory;

public class TechProduct implements Product{

	
	
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	
	TechProduct() {
		// TODO Auto-generated constructor stub
	}
	

	public TechProduct(String productName)
	{
		super();
		this.productName=productName;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this is a tech product";
	}

}
