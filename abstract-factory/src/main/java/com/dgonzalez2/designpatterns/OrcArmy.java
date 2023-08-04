package com.dgonzalez2.designpatterns;
public class OrcArmy implements Army {

  static final String DESCRIPTION = "This is the orc army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
