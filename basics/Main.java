import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


    // flipNHeads(1)
    // flipNHeads(2)

    flipNHeads(3);


    clock();
  }

// Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

  public static String pluralize(String word, int number) {
    if (number == 0 || number > 1) {
      return word + "s";
    } else {
      return word;
    }
  }

  // Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

  public static void flipNHeads(int n) {
    Random random = new Random();

    int rowHeads = 0;
    int flips = 0;
   


    while (rowHeads < n) {
      flips++;
    
      float flippedCoin = random.nextFloat();

      if (flippedCoin > 0.5) {
        System.out.println("heads");
        rowHeads++;
      } else {
        System.out.println("tails");
        rowHeads = 0;
      }
    }

    System.out.println("It took about " + flips + " flips to flip " + rowHeads + " head(s) in a row.");
  }
  
  // Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.
  
  public static void clock() {
    LocalDateTime pastTime = null;

    while (true) {
      LocalDateTime now = LocalDateTime.now();
      if (now.isAfter(pastTime)) {
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        pastTime = now;
      }
    }
  }
}
