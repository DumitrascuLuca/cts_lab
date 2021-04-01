package ro.ase.seminar5.factory;

public abstract class AbstractProductFactory {

	public abstract Product makeProduct() throws UnsupportedOperationException;
	public abstract String getCalaog();
}
