package com.dgonzalez2.designpatterns;

public class App {

    public Kingdom createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        var kingdom = new Kingdom();
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        var king = kingdomFactory.createKing();
        System.out.println("King id -> " + king);
        king = kingdomFactory.createKing();
        System.out.println("King id -> " + king);
        kingdom.setKing(king);
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
        return kingdom;
    }
}
