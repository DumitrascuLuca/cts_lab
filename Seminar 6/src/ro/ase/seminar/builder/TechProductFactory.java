package ro.ase.seminar.builder;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return new TechProduct("generic");
	}

	@Override
	public String getCalaog() {
		// TODO Auto-generated method stub
		return "generic - Generic tech product";
	}

}
