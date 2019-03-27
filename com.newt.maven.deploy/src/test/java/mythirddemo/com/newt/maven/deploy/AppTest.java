package mythirddemo.com.newt.maven.deploy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.newt.Calculator;

public class AppTest {
	Calculator calc;



	@BeforeEach
	void initEnv() {
	 
		calc = new Calculator();
	}

	@Test
	public void UTC_100() {
		int input1 = 7;
		int input2 = 3;
		int expected = 4;
            int actual = calc.sub(input1,input2);
			assertEquals(expected, actual);
		
	}

	@AfterAll
	public void cleanEnv() {
		System.gc();
	}

}