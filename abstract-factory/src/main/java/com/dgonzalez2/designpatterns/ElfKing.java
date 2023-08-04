package com.dgonzalez2.designpatterns;

// cannot be extended by a subclass nadie puede crearla solo ella misma
public final class ElfKing implements King {

  private final String DESCRIPTION;
  private static ElfKing instance; // no puede cambiar debe ser unico

  private ElfKing(){
    DESCRIPTION = "This is the elven king!";
  }

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  public static King getInstance() {
    if (instance == null) {
      instance = new ElfKing();
    }
    return instance;
  }
}
