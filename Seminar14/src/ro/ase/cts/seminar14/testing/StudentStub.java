package ro.ase.cts.seminar14.testing;

import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;

public class StudentStub extends StudentAbstract{

	
	float calculMedieReturnValue=0;

	boolean exceptionalCase=false;
	

	public boolean isExceptionalCase() {
		return exceptionalCase;
	}



	public void setExceptionalCase(boolean exceptionalCase) {
		this.exceptionalCase = exceptionalCase;
	}



	public float getCalculMedieReturnValue() {
		return calculMedieReturnValue;
	}



	public void setCalculMedieReturnValue(float calculMedieReturnValue) {
		this.calculMedieReturnValue = calculMedieReturnValue;
	}



	@Override
	public float calculMedie() throws StudentExceptionWrongValue {
		if(exceptionalCase) {
			throw new StudentExceptionWrongValue("exceptie calcul medie");
		}
		return calculMedieReturnValue;
	}

}
