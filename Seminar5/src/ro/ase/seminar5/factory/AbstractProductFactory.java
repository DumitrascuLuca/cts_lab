package ro.ase.seminar5.factory;

public abstract class AbstractProductFactory {

	public abstract Product makeProduct() throws UnsupportedOperationException;
	public abstract String getCatalog();
	public Product makeProduct(int id) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}
}
