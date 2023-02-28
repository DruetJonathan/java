package be.technifutur.decouverte.texte.poo.scenario3;

public class Millenium extends VaisseauAncetre{
    Millenium() {
        super("Millenium", 10, 10);
    }

    public void tirer(int nbMissile){
        for (int i = 0; i < nbMissile; i++) {
            super.tirer();
        }

    }
}
