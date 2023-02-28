package be.technifutur.decouverte.texte.poo.scenario3;

public class Scenario3 {
    public static void main(String[] args) {
        VaisseauAncetre v = new VaisseauAncetre("XWing",-5,5);
        System.out.println(v.getNbMissile());
        VaisseauAncetre v2 = new VaisseauAncetre("XWing",5,5);
        System.out.println(v2.getNbMissile());
        v2.tirer();
        v2.tirer();
        v2.tirer();
        v2.tirer();
        v2.tirer();
        v2.tirer();
        if (!v2.addMissile(10)){
            System.out.println("Depassement nombre max");
        }
        if (v2.addMissile(v2.getMaxMissile())){
            System.out.println("Ajout de missile");
        }
        v2.tirer();
        v2.tirer();

        v2.decolage();
        v2.decolage();
        v2.atterir();
        v2.atterir();
        System.out.println("Nombre d'instance: "+v2.getInstanceCount());
    }
}
