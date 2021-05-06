package ro.ase.cts.seminar10.chain;

public class ErrorLogger extends AbstractLogger{

	
	public ErrorLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	void write(String message) {
		// TODO Auto-generated method stub
		System.err.println(ErrorLogger.class.getName()+message);
	}

}
