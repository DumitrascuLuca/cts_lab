package ro.ase.seminar.builder;

public abstract class AbstractProductFactory {
	
	public abstract Product makeProduct(int id) throws UnsupportedOperationException;
	public abstract String getCatalog();
}
