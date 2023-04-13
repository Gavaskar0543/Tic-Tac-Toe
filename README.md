## Tic Tac Toe Game in Java
A simple implementation of the classic Tic Tac Toe game using Java, showcasing object-oriented programming concepts such as inheritance and polymorphism.
## How to Play 🕹️

1. Run the Java program in your favorite Java IDE or compiler.
2. The game starts with an empty 3x3 game board displayed on the console.
3. Players take turns to enter their moves by specifying the row and column of their desired move.
4. The game checks for valid moves, win conditions, and draw conditions after each move.
5. If a player wins or the game ends in a draw, the game will display the result and ask if you want to play again.

## Technical Terms Used 🛠️

1. **Object-Oriented Programming (OOP)**: The game is implemented using OOP principles, where the game board and players are represented as objects with their own properties and behaviors.
2. **Inheritance**: The game board and players are implemented using inheritance, where common properties and behaviors are defined in parent classes and specialized properties and behaviors are defined in child classes.
3. **Polymorphism**: Polymorphism is used to handle different types of moves (player moves and computer moves) and to display the game board in a flexible and extensible manner.
4. **Java**: The game is implemented in Java, a popular object-oriented programming language known for its platform independence and wide usage in various applications.

## Emojis Used 😃

- 😄 - Represents a player's move on the game board.
- 😢 - Represents an empty cell on the game board.
- 🎉 - Represents a win condition.
- 💔 - Represents a draw condition.

## Classes and Inheritance Hierarchy 📚

The implementation of the game uses the following classes and inheritance hierarchy:

- **Board**: Represents the game board and its properties such as size, cells, and methods to display and update the board.
  - **Cell**: Represents a single cell on the game board and its properties such as status (empty, player move, or computer move).
- **Player**: Represents a player in the game and its properties such as name, symbol (X or O), and methods to make a move on the board.
  - **HumanPlayer**: Represents a human player and its methods to get input from the user for making a move.
  - **ComputerPlayer**: Represents a computer player and its methods to generate a random move.

