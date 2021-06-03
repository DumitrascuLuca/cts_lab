package ro.ase.cts.seminar14;

import java.util.ArrayList;

public class DepartamentSecretariat {

	private static final int MIN_MEDIE_MERIT=8;
	private static final int MIN_MEDIE_EXCELENTA=9;
	ArrayList<StudentAbstract> listastudenti;

	public DepartamentSecretariat(ArrayList<StudentAbstract> listastudenti) {
		super();
		this.listastudenti = listastudenti;
	}
	
	public DepartamentSecretariat() {
		
		this.listastudenti = new ArrayList<StudentAbstract>();
	}
	
	
	public ArrayList<StudentAbstract> getListastudenti() {
		return listastudenti;
	}

	public void setListastudenti(ArrayList<StudentAbstract> listastudenti) {
		this.listastudenti = listastudenti;
	}

	public static int getMinMedieMerit() {
		return MIN_MEDIE_MERIT;
	}

	public static int getMinMedieExcelenta() {
		return MIN_MEDIE_EXCELENTA;
	}

	public float calculBursa(int index)  {
		float medieStudnet=0;
		try {
			medieStudnet = listastudenti.get(index).calculMedie();
		} catch (StudentExceptionWrongValue e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		if(medieStudnet>MIN_MEDIE_EXCELENTA) {
			return TipBursaEnum.EXCELENTA.getCuantum();
		}else if(medieStudnet>=MIN_MEDIE_MERIT) {
			return TipBursaEnum.MERIT.getCuantum();
		}
		else {
			return 0;
		}
		
	}
}
