package ro.ase.seminar.builder;

public abstract class AbstractProductFactory {

	public abstract Product makeProduct() throws UnsupportedOperationException;
	public abstract String getCalaog();
}
