package ro.ase.seminar5.factory;

public class TechProduct implements Product{

	int id;
	String productName;
	String manufactured;
	String model;
	String displayType;
	float price;
	
	private TechProduct() {
	}
	
	public TechProduct(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getManufactured() {
		return manufactured;
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

	@Override
	public String getDescription() {
		return "this is a tech product";
	}
	
	public static class TechProductBuilder{
		private TechProduct product;
		
		public TechProductBuilder(int id) {
			product=new TechProduct(id);
			
		}
		public TechProductBuilder setName(String name) {
			product.productName=name;
			return this;
		}
		
		public TechProductBuilder setManufacturer(String manufacturer) {
			product.manufactured=manufacturer;
			return this;
		}
		
		public TechProductBuilder setModel(String model) {
			product.model=model;
			return this;
		}
		
		public TechProductBuilder setDisplayType(String displayType) {
			product.displayType=displayType;
			return this;
		}
		
		public TechProductBuilder setPrice(float price) {
			product.price=price;
			return this;
		}
		
		public TechProduct getProduct() {
			return product;
		}
		public void setProduct(TechProduct product) {
			this.product = product;
		}
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		TechProduct newProduct = new TechProductBuilder(id).setDisplayType(this.displayType).setManufacturer(this.manufactured).setModel(model).setName(name).getProduct()
		return super.clone();
	}

}
