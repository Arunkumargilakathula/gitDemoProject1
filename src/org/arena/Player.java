package org.arena;

public class Player {
	private int health;
	private final int strength;
	private final int attack;

	/**
	 * Constructor to initialize player attributes.
	 * 
	 * @param health   Initial health points
	 * @param strength Base attack strength
	 * @param attack   Base attack value
	 */

	public Player(int health, int strength, int attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	/**
	 * Getter method for player's health.
	 * 
	 * @return Player's current health points
	 */

	public int getHealth() {
		return health;
	}

	/**
	 * Getter method for player's base attack strength.
	 * 
	 * @return Player's base attack strength
	 */

	public int getStrength() {
		return strength;
	}

	/**
	 * Getter method for player's base attack value.
	 * 
	 * @return Player's base attack damage
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * Reduces the health of the player by a specified amount. If the health drops
	 * below zero, it sets it to zero.
	 * 
	 * @param amount The amount to reduce the player's health.
	 */
	public void reduceHealth(int amount) {
		this.health -= amount;
		if (this.health < 0) {
			this.health = 0;
		}
	}

	/**
	 * Checks if the player is alive by verifying if their health is greater than
	 * zero.
	 * 
	 * @return True if the player is alive, false otherwise.
	 */
	public boolean isAlive() {
		return this.health > 0;
	}
}
