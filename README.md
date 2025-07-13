# Snake Game (Java)

This is a simple version of the classic Snake game, written in Java as part of a class assignment at WashU. The snake moves around a grid, eats food pellets to grow, and tracks the player’s score.

## 🐍 Features
- Real-time movement of the snake
- Snake grows with each pellet consumed
- Collision detection (self or wall = game over)
- Score tracking

## 🛠️ Technologies
- Java
- Eclipse IDE (project originally created using Eclipse)

## 📁 Structure
All source code is located in `src/assignment9/`:
- `Game.java`: Main logic and rendering
- `Snake.java`: Handles snake movement and growth
- `Food.java`: Manages food location
- `BodySegment.java`: Represents parts of the snake body
- `ColorUtils.java`: Utility for colors

## ▶️ How to Run

1. Compile the Java files:
```bash
javac -d bin src/assignment9/*.java
