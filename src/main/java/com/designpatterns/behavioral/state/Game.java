package com.designpatterns.behavioral.state;

import com.designpatterns.behavioral.state.states.WelcomeScreenState;

public class Game {

  public State state = new WelcomeScreenState(this);

  public void changeState(State state) {
    this.state = state;
  }
  
}
