package assignment9;

import java.util.LinkedList;

public class Snake {

	private static final double SEGMENT_SIZE = 0.02;
	private static final double MOVEMENT_SIZE = SEGMENT_SIZE * 1.5;
	private LinkedList<BodySegment> segments;
	private double deltaX;
	private double deltaY;
	
	
	public Snake() {
				 segments = new LinkedList<>();
		    // Initialize snake with one body segment
		    segments.add(new BodySegment(0.5, 0.5, SEGMENT_SIZE)); // Start at center
		deltaX = 0; //change back to 0 if needed 
		deltaY = 0;
	}
	
	public void changeDirection(int direction) {
		if(direction == 1) { //up
			deltaY = MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 2) { //down
			deltaY = -MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 3) { //left
			deltaY = 0;
			deltaX = -MOVEMENT_SIZE;
		} else if (direction == 4) { //right
			deltaY = 0;
			deltaX = MOVEMENT_SIZE;
		}
	}
	
	/**
	 * Moves the snake by updating the position of each of the segments
	 * based on the current direction of travel
	 */
	public void move() {
	    BodySegment head = segments.getFirst(); //gets the first element or topic of that list
	    double newX = head.getX() + deltaX; //get new x position that snake has moved to input in List
	    double newY = head.getY() + deltaY; //get new y position that snake has moved to input in List

	    // Add new head at new position
	    segments.addFirst(new BodySegment(newX, newY, SEGMENT_SIZE));
	    
	   /*
	    * This method is asking us to add a new circle to the front of the list (top of snake) and draw it based 
	    * off the parameters of the body segment method
	    */

	    // Remove the last segment to simulate movement
	    segments.removeLast();

	}
	
	/**
	 * Draws the snake by drawing each segment
	 */
	public void draw() {
		/*
		 * for each loop (for each segment [new instance of the body segment class]
		 * we are running through the list and drawing it)
		 */
	    for (BodySegment segment : segments) { //creating a new variable where we iterate through the segmnat linkedlist
	        segment.draw(); //drawing the segment
	    }
	}
	
	/**
	 * The snake attempts to eat the given food, growing if it does so successfully
	 * @param f the food to be eaten
	 * @return true if the snake successfully ate the food
	 */
	public boolean eatFood(Food f) {
		BodySegment head = segments.getFirst(); // getting the location of the head of the snake 
	    double distance = Math.sqrt(Math.pow(head.getX() - f.getX(), 2) + Math.pow(head.getY() - f.getY(), 2)); //using the distance formula
	    if (distance < SEGMENT_SIZE) {
	        // Add new segment at the tail's position
	        BodySegment tail = segments.getLast();
	        segments.add(new BodySegment(tail.getX(), tail.getY(), SEGMENT_SIZE));
	        return true;
	    }
		return false;
	}
	
	/**
	 * Returns true if the head of the snake is in bounds
	 * @return whether or not the head is in the bounds of the window
	 */
	public boolean isInbounds() {
		BodySegment head = segments.getFirst();
	    return head.getX() > 0 && head.getX() < 1 && head.getY() > 0 && head.getY() < 1;
		
	}
}
