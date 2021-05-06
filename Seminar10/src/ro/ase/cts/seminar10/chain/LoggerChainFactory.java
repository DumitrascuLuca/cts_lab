package ro.ase.cts.seminar10.chain;

public class LoggerChainFactory {

	public static AbstractLogger getChainofLoggers()
	{
		AbstractLogger erroLogger=new ErrorLogger(Verbosity.ERROR);
		AbstractLogger fileLogger=new FileLogger(Verbosity.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(Verbosity.INFO);
		
		erroLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return erroLogger;
	}
}
