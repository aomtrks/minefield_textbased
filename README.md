💣 Text-Based Minesweeper Game (Java)
This repository holds a text-based (console) version of the classic Minesweeper game, developed using the Java programming language.
This project was created to demonstrate proficiency in core Java structures, multi-dimensional arrays, error handling, and effective user interaction within a terminal environment.

✨ Key Features
Adjustable Dimensions: The user can define the board size and the number of mines at the start of the game.

Safe First Move: The game guarantees that the user's very first move will not result in hitting a mine. (The logic for mine placement is often delayed until after the first move).

Neighbor Count: Displays the number of mines surrounding an opened cell.

Recursive Flood Fill: If an opened cell has zero neighboring mines, the adjacent safe cells are automatically opened (using a recursive or iterative method).

Game State Tracking: Includes win condition (all non-mine cells opened) and lose condition (hitting a mine).

🛠️ Technologies Used
Programming Language: Java

Environment: Console/Terminal

Core Structures: Multi-dimensional arrays (for the game board), Scanner class (for user input), while and for loops, custom methods, and classes.

⚙️ Local Setup and Execution
To run this project on your local machine, the Java Development Kit (JDK) must be installed.

1. Clone the Repository
Bash

# Clone the repository
git clone https://github.com/aomtrks/minefield_textbased.git

# Navigate to the repository folder
Compile the Project
If you are compiling without an IDE (like IntelliJ or Eclipse):

Bash

# Compile the source code (Use your Main class name)
javac Main.java 
# or 
javac *.java 
3. Start the Game
Bash

# Run the program (Use your Main class name)
java Main
4. Console Commands
Once the game starts, the console will prompt you for the following inputs:

Board Dimensions: E.g., 6 6 (for a 6x6 board)

Number of Mines: E.g., 6 (for a total of 6 mines)

Move: Enter the row and column coordinates. E.g., 2 3

🧩 Notes on Code Structure
Board Class: Contains the game board logic, handling mine placement and calculating neighbor mine counts.

Game Class: Manages the main game loop, takes user input, renders the board to the screen, and checks win/loss conditions.

Data Structures: The project utilizes two separate 2D arrays—one to store the location of the mines and the other to track the user's view (opened cells, flags).
