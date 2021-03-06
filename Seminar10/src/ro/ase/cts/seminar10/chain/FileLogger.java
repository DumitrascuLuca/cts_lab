package ro.ase.cts.seminar10.chain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends AbstractLogger{

	public FileLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	void write(String message) {
		System.out.println("Write log message to file : "+message);
		File file=new File("log.txt");
		try {
			BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
			bufferedWriter.write(message);
			bufferedWriter.close();
		} catch (IOException e) {
			System.err.println("Could not write log to file");
		}
	}

}
