package com.dgonzalez2.designpatterns;
public final class OrcKing implements King {

  private final String DESCRIPTION;

  private static OrcKing instance;

  private OrcKing(){
    DESCRIPTION = "This is the orc king!";
  }

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  public static King getInstance() {
    if (instance == null) {
      instance = new OrcKing();
    }
    return instance;
  }
}
