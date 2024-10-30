package org.arena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
	@Test
	public void testReduceHealth() {
		Player player = new Player(100, 10, 20);

		// Test reducing health by a positive amount
		player.reduceHealth(30);
		assertEquals(70, player.getHealth());
		// Test reducing health to zero
		player.reduceHealth(80);
		assertEquals(0, player.getHealth());
	}

	@Test
	public void testIsAlive() {
		Player player = new Player(50, 10, 20);
		// Test player alive with health remaining
		assertTrue(player.isAlive());
		// Test player dead after health reaches zero
		player.reduceHealth(50);
		assertFalse(player.isAlive());
	}
}
