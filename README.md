# Snake Game (Java)

This is a simple version of the classic Snake game, written in Java as part of a class assignment for my CSE 131 Class at WashU. The goal of  this assignment was to create the popular online "Snake" in Java  and creating different features that we see within the game such as how the snake moves around a grid, eats food pellets to grow, and tracks the player’s score.

## 🐍 Features
- Real-time movement of the snake
- Snake grows with each pellet consumed
- Collision detection (self or wall = game over)
- Score tracking

## 🛠️ Technologies
- Java
- Java Libraries
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
