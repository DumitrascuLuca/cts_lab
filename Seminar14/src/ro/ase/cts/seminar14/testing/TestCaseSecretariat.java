package ro.ase.cts.seminar14.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.DepartamentSecretariat;
import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.TipBursaEnum;

class TestCaseSecretariat {
	DepartamentSecretariat secretariat;

	static final ArrayList<Student> DEFAULT_STUDENTS;
	
	static {
		DEFAULT_STUDENTS=new ArrayList<Student>();
	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		int defaultNote[]= {7,8,9};
		int defaultNote2[]= {8,9,10};
		DEFAULT_STUDENTS.add(new Student("Anonim",99,defaultNote));
		DEFAULT_STUDENTS.add(new Student("Anonim2",99,defaultNote2));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		secretariat=new DepartamentSecretariat();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//right - reference
	@Tag("importante")
	@Test
	void testCalculBursaStub() {
		//stubclasa anonima
		StudentAbstract defaultStudent=new StudentAbstract() {
			
			@Override
			public
			float calculMedie() throws StudentExceptionWrongValue {
				// TODO Auto-generated method stub
				return 8;
			}
		};
		ArrayList<StudentAbstract> listaStudenti=new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultStudent);
		secretariat.setListastudenti(listaStudenti);
		
		float bursa=secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.MERIT.getCuantum(), bursa,"cuantum nu este corect");
	}
	
	
	@Test
	void testCalculBursaStubCuClasaConcreta() {
		//stubclasa concreta
		
	StudentStub defaultStudent=new StudentStub();
	defaultStudent.setCalculMedieReturnValue(9);
	defaultStudent.setExceptionalCase(true);
			
	
		ArrayList<StudentAbstract> listaStudenti=new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultStudent);
		secretariat.setListastudenti(listaStudenti);
		
		float bursa=secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.EXCELENTA.getCuantum(), bursa,"cuantum nu este corect");
	}
	
	
	

}
