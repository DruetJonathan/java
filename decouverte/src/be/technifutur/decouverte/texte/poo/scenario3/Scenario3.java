package be.technifutur.decouverte.texte.poo.scenario3;

public class Scenario3 {
    public static void main(String[] args) {
        Millenium m = new Millenium();
        Xwing x = new Xwing(15);

        System.out.println(m.getNom());
        System.out.println(x.getNom());
    }
}
