package org.arena;

public class Game {
	private final Player playerA;
	private final Player playerB;
	private final Die die;

	/**
	 * Constructor for initializing a game with two players.
	 * 
	 * @param playerA The first player participating in the game.
	 * @param playerB The second player participating in the game.
	 */

	public Game(Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
		this.die = new Die();
	}

	/**
	 * Initiates and manages the game loop until one player's health reaches zero.
	 */
	public void play() {
		Player currentPlayer = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
		Player opponent = currentPlayer == playerA ? playerB : playerA;

		while (currentPlayer.isAlive() && opponent.isAlive()) {
			takeTurn(currentPlayer, opponent);
			Player temp = currentPlayer;
			currentPlayer = opponent;
			opponent = temp;
		}

		System.out.println("Game Over!");
		System.out.println(playerA.isAlive() ? "Player A wins!" : "Player B wins!");
	}

	/**
	 * Simulates a turn in the game where one player attacks the other.
	 * 
	 * @param attacker The player initiating the attack.
	 * @param defender The player defending against the attack.
	 */

	private void takeTurn(Player attacker, Player defender) {
		int attackRoll = die.roll();
		int defenseRoll = die.roll();

		int attackDamage = attacker.getAttack() * attackRoll;
		int defenseStrength = defender.getStrength() * defenseRoll;

		int damagehealth = attackDamage - defenseStrength;
		if (damagehealth > 0) {
			defender.reduceHealth(damagehealth);
		}

		System.out.printf("%s attacks %s: Attack Roll = %d, Defense Roll = %d, Damage health = %d%n",
				attacker == playerA ? "Player A" : "Player B", defender == playerA ? "Player A" : "Player B",
				attackRoll, defenseRoll, damagehealth > 0 ? damagehealth : 0);

		System.out.printf("Player A Health: %d, Player B Health: %d%n", playerA.getHealth(), playerB.getHealth());
	}
}
