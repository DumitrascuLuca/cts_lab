package ro.ase.seminar5.factory;

public abstract class AbstractProductFactory {

	public abstract Product makeProduct(int id) throws UnsupportedOperationException;
	public abstract String getCalaog();
}
