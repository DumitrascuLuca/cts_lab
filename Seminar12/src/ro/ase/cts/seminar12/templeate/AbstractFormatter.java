package ro.ase.cts.seminar12.templeate;

public abstract class AbstractFormatter {
	
	
	//templeate method
	public void displayOutput(int input) {
		int userInput=getInput(input);
		String formaString=formatInput(userInput);
		display(formaString);
	}
	
	public int getInput(int fakeInput) {
		System.out.println("Getting input from user ");
		return fakeInput;
	}

	
	public abstract String formatInput(int input);
	
	public void display(String input) {
		System.out.println(input);
	}
}
