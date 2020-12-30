package test.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import classa.*;
class TestSum {

	@Test
	void testSum() {
		int result = Sum.sum(2, 2);
		
		assert(result == 3);
	}

	@Test
	void testSumNegative() {
		int result = Sum.sum(-2, -2);
		
		assert(result == -4);
	}
}
