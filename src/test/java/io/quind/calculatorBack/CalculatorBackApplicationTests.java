package io.quind.calculatorBack;

import io.quind.calculatorBack.operations.CalculatorOperations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorBackApplicationTests {

	@Test
	void contextLoads() {
		//Organizar

		int number1 = 18;
		int number2 = 7;
		int prediction = 25;
		int result;
		CalculatorOperations instaceTest = new CalculatorOperations();

		//Actuar
		result = instaceTest.addTwoNumbers(number1, number2);

		//Assert
		assertEquals(result,prediction);
	}

}
