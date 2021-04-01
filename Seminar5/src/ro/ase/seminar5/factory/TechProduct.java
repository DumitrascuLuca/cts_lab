package ro.ase.seminar5.factory;

public class TechProduct implements Product{

	
	
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	 int id;
	
	public String getProductName() {
		return productName;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public String getModel() {
		return model;
	}


	public String getDisplayType() {
		return displayType;
	}


	public float getPrice() {
		return price;
	}


	private TechProduct() {
		// TODO Auto-generated constructor stub
	}
	

	public TechProduct(int id)
	{
		super();
		this.id=id;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this is a tech product";
	}
	
	
	public static class TechProductBuilder{
		private TechProduct product;
		
		public TechProductBuilder setName(String name)
		{
			product.productName=name;
			return this;
		}
		
		public TechProductBuilder setManufacturer(String manufacturer)
		{
			product.manufacturer=manufacturer;
			return this;
		}
		
		public TechProductBuilder setModel(String model)
		{
			product.model=model;
			return this;
		}
		
		public TechProductBuilder setType(String type)
		{
			product.displayType=type;
			return this;
		}
		
		public TechProductBuilder setprice(float price)
		{
			product.price=price;
			return this;
		}
		
		public TechProduct getProduct() {
			return product;
		}
	}

}
