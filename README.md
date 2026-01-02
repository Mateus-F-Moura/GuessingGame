# Number Guessing Game 🎯

A fun and interactive command-line number guessing game built with Java. Test your luck and intuition by guessing a randomly generated number between 1 and 100!

## 📋 Description

This is a console-based game where players try to guess a secret number within a limited number of attempts. The game offers three difficulty levels (Easy, Medium, and Hard) to accommodate different skill levels. After each guess, the game provides helpful hints to guide you toward the correct answer.

This project was developed as part of the [roadmap.sh](https://roadmap.sh/projects/number-guessing-game) backend project challenges.

## ✨ Features

- **Three Difficulty Levels:**
  - Easy: 10 attempts
  - Medium: 5 attempts
  - Hard: 3 attempts

- **Smart Hints:** After each incorrect guess, the game tells you whether the secret number is higher or lower than your guess

- **Game Statistics:** Track your performance with:
  - Number of attempts used
  - Time taken to complete the game
  - Difficulty level played

- **Replay Option:** Play multiple rounds without restarting the application

- **Clean Console Interface:** Simple and intuitive text-based UI

## 🏗️ Project Structure

```
GuessingGame/
├── src/
│   ├── application/
│   │   └── Main.java              # Entry point and game loop
│   └── model/
│       ├── entities/
│       │   └── GuessingGame.java  # Game logic and state management
│       └── enums/
│           └── Difficulty.java    # Difficulty level enumeration
├── .gitignore
└── Number Guessing Game.iml
```

## 🚀 How to Run

### Prerequisites

- Java JDK 17 or higher
- IntelliJ IDEA (recommended) or any Java IDE

### Running the Game

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Mateus-F-Moura/GuessingGame.git
   cd GuessingGame
   ```

2. **Compile and run:**
   ```bash
   # Using command line
   javac -d bin src/application/Main.java src/model/entities/GuessingGame.java src/model/enums/Difficulty.java
   java -cp bin application.Main
   ```

   Or simply open the project in IntelliJ IDEA and run the `Main.java` file.

## 🎮 How to Play

1. Start the game by running `Main.java`
2. Read the welcome message
3. Select your difficulty level:
   - Press `1` for Easy (10 chances)
   - Press `2` for Medium (5 chances)
   - Press `3` for Hard (3 chances)
4. Start guessing numbers between 1 and 100
5. Follow the hints provided after each guess
6. Win by guessing correctly or lose when you run out of attempts
7. Check your game statistics (time and attempts)
8. Choose whether to play again

## 💻 Technical Details

### Technologies Used

- **Java 17+**: Core programming language
- **java.util.Scanner**: For user input handling
- **java.util.concurrent.ThreadLocalRandom**: For secure random number generation
- **Switch Expressions**: Modern Java syntax for cleaner code

### Key Components

#### Main.java
The entry point of the application that:
- Manages the main game loop
- Handles user input for difficulty selection and guesses
- Controls the play-again functionality
- Displays game messages and results

#### GuessingGame.java
The core game logic class that:
- Generates random secret numbers
- Tracks game state (attempts, chances, start time)
- Validates guesses and provides feedback
- Calculates elapsed time
- Determines win/lose conditions

#### Difficulty.java
Enum that defines the three difficulty levels:
- EASY
- MEDIUM
- HARD

## 🎯 Example Game Session

```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

Great! You have selected the MEDIUM difficulty level.
Let's start the game!

Enter your guess: 50
Incorrect! The number is more than 50.
Enter your guess: 75
Incorrect! The number is less than 75.
Enter your guess: 62
Incorrect! The number is more than 62.
Enter your guess: 68
Congratulations! You guessed the correct number in 4 attempts.

Time: 23.45s, Difficulty: MEDIUM, Attempt(s): 4

Wanna try again (true/false)? false
```

## 🧠 Learning Objectives

This project demonstrates:
- Object-oriented programming principles in Java
- Encapsulation and data hiding
- Enum usage for type safety
- User input validation
- Game loop implementation
- Time tracking and performance metrics
- Modern Java features (switch expressions, try-with-resources)

## 📝 License

This project is open source and available for educational purposes.

## 👤 Author

**Mateus F. Moura**
- GitHub: [@Mateus-F-Moura](https://github.com/Mateus-F-Moura)

## 🙏 Acknowledgments

- Inspired by the [roadmap.sh](https://roadmap.sh/projects/number-guessing-game) backend projects
- Thanks to the Java community for excellent documentation

---

Enjoy the game! 🎲
