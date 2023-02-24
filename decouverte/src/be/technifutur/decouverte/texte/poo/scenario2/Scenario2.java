package be.technifutur.decouverte.texte.poo.scenario2;

import be.technifutur.decouverte.texte.poo.scenario1.Vaisseau;

public class Scenario2 {
    public static void main(String[] args) {
        VaisseauSecure v = new VaisseauSecure("XWing",-5);
        System.out.println(v.getNbMissile());
        VaisseauSecure v2 = new VaisseauSecure("XWing",5);
        System.out.println(v2.getNbMissile());

    }
}
