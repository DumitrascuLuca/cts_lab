package ro.ase.seminar.builder;

public class TechProduct implements Product{

	
	int id;
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
