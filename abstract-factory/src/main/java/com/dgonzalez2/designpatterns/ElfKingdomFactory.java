package com.dgonzalez2.designpatterns;

public class ElfKingdomFactory implements KingdomFactory {

  @Override
  public Castle createCastle() {
    return new ElfCastle();
  }

  @Override
  public King createKing() {
    return ElfKing.getInstance();
  }

  @Override
  public Army createArmy() {
    return new ElfArmy();
  }

}
