package org.arena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest {
	@Test
	public void testGamePlay() {
		Player playerA = new Player(50, 5, 10);
		Player playerB = new Player(100, 10, 5);
		Game game = new Game(playerA, playerB);

		// Run the game (in real unit test, you might want to mock random rolls)
		game.play();

		// Verify that at least one player has zero health after the game
		assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
	}
}
