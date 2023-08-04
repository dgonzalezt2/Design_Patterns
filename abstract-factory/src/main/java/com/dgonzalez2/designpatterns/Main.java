package com.dgonzalez2.designpatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("elf kingdom");
        var app = new App();
        var elfKingdom = app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        System.out.println(elfKingdom.getArmy().getDescription());
        System.out.println(elfKingdom.getCastle().getDescription());
        System.out.println(elfKingdom.getKing().getDescription());
        System.out.println(elfKingdom.getKing());

        System.out.println("orc kingdom");
        var orcKingdom = app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        System.out.println(orcKingdom.getArmy().getDescription());
        System.out.println(orcKingdom.getCastle().getDescription());
        System.out.println(orcKingdom.getKing().getDescription());
        System.out.println(orcKingdom.getKing());
    }
}