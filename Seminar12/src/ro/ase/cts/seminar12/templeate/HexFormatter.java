package ro.ase.cts.seminar12.templeate;

public class HexFormatter extends AbstractFormatter{

	@Override
	public String formatInput(int input) {
		// TODO Auto-generated method stub
		return String.format("%2X", input);
	}

}
