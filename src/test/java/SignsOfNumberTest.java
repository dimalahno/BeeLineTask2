import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignsOfNumberTest {

	SignsOfNumber signs;

	@Before
	public void initTest(){
		signs = new SignsOfNumber();
	}

	@After
	public void afterTest(){
		signs = null;
	}

	@Test
	public void sumOfSigns() {
		assertEquals(6, signs.sumOfSigns(123));
		assertEquals(1, signs.sumOfSigns(100));
		assertEquals(21, signs.sumOfSigns(123456));
		assertEquals(9, signs.sumOfSigns(540000000));
	}
}