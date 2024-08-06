package com.designpatterns.behavioral.state.states;

import com.designpatterns.behavioral.state.Game;
import com.designpatterns.behavioral.state.State;

public class BreakState extends State {

  public BreakState(Game game) {
    super(game);
    System.out.println("-- Game in Break state --");
  }

  @Override
  public void onWelcomeScreen() {
    System.out.println("Not allowed.");
  }

  @Override
  public void onPlaying() {
    game.changeState(new PlayingState(game));
  }

  @Override
  public void onBreak() {
    System.out.println("Currently on break state");
  }

  @Override
  public void onEndGame() {
    System.out.println("Not allowed.");
  } 
  
}
