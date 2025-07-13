package assignment9;

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Game {

	// Declare snake and food as instance variables in order to forward them so they can be used in the game class
	private Snake snake;
	private Food food;
	private int score;


	public Game() {
		StdDraw.enableDoubleBuffering();
		snake = new Snake(); //new snake object
		food = new Food(); // new food object
		score = 0; //score starts at 0
	}

	public void play() {
		while (snake.isInbounds()) { //format for calling method from another class is (classvariable.methodname) Note: class-variable is the class initialized in the constructor
			/*
			 * The While is stating that while the snake is still following the rules of the inbound method
			 * the snake will change direction based off the movements the code records from the KeyPress Method 
			 * as the player plays the game. so long as the direction variable (which calls on the KeyPress Method)
			 * is not equal to -1. then the snake will change the based off the inputs of the keys. pressed.
			 * after this the snake will follow the rules of the move method to ensure it travels properly
			 * and then call on the updateDrawing Method to ensure a clear picture
			 */
			int direction = getKeypress(); //calling the KeyPress method
			if (direction != -1) {
				snake.changeDirection(direction);
			}
			snake.move();    
			updateDrawing();
			
			/*
			 * This if statement focuses on keep tracking of the number of food items'
			 * that the snake has eaten through calling the eatFood Method.
			 * If a pellet has been eaten, then the code will generate a new pallet through 
			 * the food method and add 1 to the score
			 */
			
			if (snake.eatFood(food)) {
			    food = new Food(); // Generate new food
			    score++; //adds plus 1 to score for every      
			}
		}
		System.out.println("Game Over!");
	}


	private int getKeypress() {
		if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			return 2;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
			return 3;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			return 4;
		} else {
			return -1;
		}
	}

	/**
	 * Clears the screen, draws the snake and food, pauses, and shows the content
	 */
	private void updateDrawing() {

		StdDraw.clear(); 

	    // Draw the snake and food
	    snake.draw();
	    food.draw();

	    // Display the score
	    StdDraw.setPenColor(StdDraw.BLACK); // Set the text color
	    StdDraw.text(0.5, 0.95, "Score: " + score); // Display score at the top of the screen
	    StdDraw.pause(50); // Pause 
	    StdDraw.show(); // Show the updated frame
	}

	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}
}
