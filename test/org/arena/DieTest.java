package org.arena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DieTest {
	@Test
	public void testRoll() {
		Die die = new Die();
		// Test rolling the die 100 times, ensuring results are within 1-6 range
		for (int i = 0; i < 100; i++) {
			int roll = die.roll();
			assertTrue(roll >= 1 && roll <= 6);
		}
	}
}
