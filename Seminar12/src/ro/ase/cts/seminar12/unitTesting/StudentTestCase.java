package ro.ase.cts.seminar12.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass  was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass  was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp  was called");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown  was called");

	}

	@Test
	void testStudentConstructorRight() {
		String studentName="Costelino";
		int studentAge=1;
		int note[]= {10,2,3,4};
		Student student=new Student(studentName, studentAge, note);
		
		assertEquals(studentName, student.nume,"Name is not equal");
		assertEquals(studentAge, student.varsta,"Varsta is not equal");
		assertEquals(note, student.note," Note are not equal");
		
		
	}

	@Test
	void test2() {
		fail("Not yet implemented - test2");
	}
}
