package com.dgonzalez2.designpatterns;
public class OrcKingdomFactory implements KingdomFactory {

  @Override
  public Castle createCastle() {
    return new OrcCastle();
  }

  @Override
  public King createKing() {
    return OrcKing.getInstance();
  }

  @Override
  public Army createArmy() {
    return new OrcArmy();
  }
}
