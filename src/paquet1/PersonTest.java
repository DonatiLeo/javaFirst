package paquet1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@Test
	void testGetAge() {
		Person p = new Person();
		p.name = "Leo";
		p.age = 23;

		//J'essaie d'écrire encore
		assert(p.getAge() == 55);
	}

}
