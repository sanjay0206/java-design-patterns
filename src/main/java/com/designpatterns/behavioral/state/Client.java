package com.designpatterns.behavioral.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
  public static void main(String[] args) {
    Game game = new Game();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = "";

    do {
      System.out.print("\n--Please input command: ");
      try {
        input = reader.readLine().trim().toLowerCase();
        switch (input) {
          case "w": game.state.onWelcomeScreen();
            break;
          case "p": game.state.onPlaying();
            break;
          case "b": game.state.onBreak();
            break;
          case "e": game.state.onEndGame();
            break;
          default: System.out.println("-- Unknown command --");
            break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    } while (!input.equals("exit"));

  }
}
/*
-- Game in WelcomeScreen state --

--Please input command: w
Currently on welcome screen

--Please input command: e
Not allowed.

--Please input command: p
-- Game in Playing state. --

--Please input command: b
-- Game in Break state --

--Please input command: p
-- Game in Playing state. --

--Please input command: e
-- Game in EndGame state --

--Please input command: exit
-- Unknown command --

*/
