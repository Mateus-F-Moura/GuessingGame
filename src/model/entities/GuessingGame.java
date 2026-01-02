package model.entities;

import model.enums.Difficulty;

import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    private final Integer secretNum;
    private final long startTime;
    private Difficulty difficulty;
    private Integer chances;
    private Integer attempts;

    public GuessingGame(Difficulty difficulty) {
        this.secretNum = ThreadLocalRandom.current().nextInt(1, 101);
        this.startTime = System.currentTimeMillis();

        this.difficulty = difficulty;

        chances = switch (difficulty) {
            case EASY -> 10;
            case MEDIUM -> 5;
            case HARD -> 3;
        };

        attempts = 0;
    }

    public Integer getSecretNum() {
        return secretNum;
    }

    public double getElapsedTimeInSeconds() {
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000.0;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getChances() {
        return chances;
    }

    public void setChances(Integer chances) {
        this.chances = chances;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public boolean makeGuess(Integer guess) {
        attempts++;

        if (Objects.equals(guess, secretNum)) {
            return true;
        }
        if (guess < secretNum) {
            System.out.println("Incorrect! The number is more than " + guess + ".");
        }
        if (guess > secretNum){
            System.out.println("Incorrect! The number is less than " + guess + ".");
        }

        return false;
    }

    public boolean isGameOver() {
        return attempts >= chances;
    }

    @Override
    public String toString() {
        return String.format("Time: %.2fs, Difficulty: %s, Attempt(s): %d",
                getElapsedTimeInSeconds(), getDifficulty(), getAttempts());
    }
}
