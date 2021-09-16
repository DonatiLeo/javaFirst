package paquet1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {

	static Person p;
	static String nomTest = "Leo";
	static int ageTest = 55;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p = new Person(nomTest, ageTest);
	}

	@Test
	void testGetAge() {
		assert(p.getAge() == ageTest);
	}
	
	@Test
	void testGetName() {
		assert(p.getName() == nomTest);
	}	

}
