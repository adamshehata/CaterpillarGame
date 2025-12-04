The Very Hungry Caterpillar - README 
===

# Group 21 - Adam, Alexis, Kevyn, Marlon

## Table of Contents

1. [Overview](#Overview)
2. [Use Cases](#Use-Cases)
3. [UML Diagram](#UML-Diagram)
4. [Glossary](#Glossary)
5. [Video](#Video)

## Overview

### Description

The Very Hungry Caterpillar Game is a Java Swing arcade-style project. The game features a caterpillar that moves continuously across a 600x600 grid using the arrow keys. The player’s goal is to eat randomly spawning apples, grow in length, and increase their score while avoiding collisions with the walls or the caterpillar’s own body. When a collision occurs, the game displays a Game Over message along with the final score. A Reset button has been added to allow players to restart the game instantly without relaunching the application.

The game uses Java, Swing, and AWT, and includes a GameFrame for the window, GamePanel for all rendering and logic, and a main launcher class. The movement system reads arrow key input via a KeyAdapter, updates the caterpillar’s direction, and advances its position every timer tick. Apple generation is fully randomized within the grid bounds, and collision logic checks both wall and self-body contact. Eating an apple increases the caterpillar’s body length and increments the applesEaten counter. When the game ends, the timer stops, the caterpillar freezes, and the GamePanel displays both the message and score.

Core features include continuous movement, grid-based rendering, random apple spawning, dynamic body growth, score tracking, collision detection, and a reset mechanism. Use cases covered in the original project specification include starting the game, controlling the caterpillar, eating apples, detecting collisions, and ending the game. The system handles all rendering, movement updates, and event detection, while the player interacts only through the keyboard. Key concepts in the glossary include caterpillar segments, apples, the game board, collisions, score, game loop, UNIT_SIZE, SCREEN_WIDTH/HEIGHT, and all major methods such as startGame, draw, newApple, move, checkApple, checkCollisions, gameOver, and the MyKeyAdapter input handler.

To run the game, clone the repository from GitHub, open it in NetBeans or any Java IDE, and run the CaterpillarGame.java main file. The game window will open automatically, displaying the initial caterpillar and apple, and the player can begin controlling the movement immediately. The project is intended for academic use and demonstrates interactive programming, event handling, graphics rendering, and basic game loop logic using Java Swing.



## Use-Cases

### Actors
**Player**: Controls the caterpillar using the keyboard. 
**System** (Game Engine): Handles movement, collision detection, scoring, and rendering. 

### Use Case 1: Start Game

**Precondition: The game program is launched.**

**Main Flow**
1. Player runs the `CatepillarGame` main program. 
2. System opens the game window (`GameFrame`) and initializes the game panel. 
3. System starts the game loop, displays the caterpillar, and generates the first apple. 

**Postcondition: The game is running with the caterpillar and an apple visible on the board.**



### Use Case 2: Control Caterpillar

**Precondition: The game is running.**

**Main Flow**
1. Player presses arrow keys. 
2. System updates the caterpillar’s direction using `MyKeyAdapter`. 
3. On each timer tick, the caterpillar moves in the chosen direction. 
Postcondition: The caterpillar moves continuously in the selected direction.

### Use Case 3: Eat Apple

**Precondition: The game is running and an apple exists on screen.**

**Main Flow**
1. Caterpillar’s head reaches the apple’s coordinates. 
2. System increments the caterpillar’s body length and score. 
3. System generates a new apple at a random location. 

**Postcondition: The caterpillar grows longer, the score increases, and a new apple is displayed.**

### Use Case 4: Collision Detection

**Precondition: The game is running.**

**Main Flow**
1. System checks if the caterpillar collides with itself. 
2. System checks if the caterpillar collides with the walls. 

**Postcondition: If a collision is detected, the game ends and `running = false`.**


### Use Case 5: Game Over 

**Precondition: A collision has occurred.**

**Main Flow:**

1. System stops the timer. 
2. System displays “Game Over” and the final score. 

**Postcondition: The player can no longer control the caterpillar.**

<img width="470" height="361" alt="caterpillarusecase" src="https://github.com/user-attachments/assets/4835dc5e-9bbd-4917-9086-11a208d79a0e" />

## UML-Diagram

<img width="777" height="1296" alt="caterpillarUML" src="https://github.com/user-attachments/assets/92bdcf88-5363-425e-ad60-8f842c9c8913" />

## Glossary

**Caterpillar:** The player controlled character that grows in length by eating apples. 

**Apple:** An item that appears randomly on the board. Eating it increases the caterpillar’s length and score. 

**Game Board:** The rectangular playing area where the caterpillar moves. 

**Collision:** When the caterpillar hits a wall or its own body, causing the game to end. 

**Score:** The number of apples the player has eaten. 

**Game Loop:** The continuous cycle of updating the game state and rendering graphics. 

**SCREEN\_WIDTH / SCREEN\_HEIGHT:** Dimensions of the game window. 

**UNIT\_SIZE:** The size of one segment of the caterpillar. 

**DELAY:** The speed of the caterpillar’s movement. 

**bodyParts:** Initial size of the caterpillar. 

**applesEaten:** Counter for apples collected. 

**appleX / appleY:** Coordinates of the apple on the board. 

**direction:** The current movement direction of the caterpillar. 

**running:** Boolean value indicating if the game is active. 

**GamePanel():** Sets up the background of the game. 

**startGame():** Initializes the game and begins play. 

**draw(Graphics):** Renders the caterpillar, apples, and text on the screen. 

**newApple():** Generates a new apple at a random location. 

**move():** Updates the caterpillar’s position. 

**checkApple():** Detects apple collisions, grows the caterpillar, updates score, and spawns a new 
apple. 

**checkCollisions():** Ends the game if the caterpillar collides with itself or a wall. 

**gameOver():** Displays “Game Over” and the final score.

**resetButton:** Start the game over again.

**MyKeyAdapter:** Connects the keyboard arrow keys to caterpillar movement.

## Video 

Video provided showing a demonstration and explanation of our project.

https://youtu.be/yTt3y9dT7I8


