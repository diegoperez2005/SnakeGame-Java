package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() {
		x = Math.random();
		y = Math.random();
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.filledCircle(x, y, FOOD_SIZE);
	}
	
	// Add getters for x and y to find the x and y coordinates of the food pellets
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
