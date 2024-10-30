package org.arena;


import java.util.Random;

public class Die {
    private final Random random = new Random();
    /**
     * Simulates rolling a 6-sided die and returns the result.
     * @return A random integer between 1 and 6 (inclusive).
     */
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
