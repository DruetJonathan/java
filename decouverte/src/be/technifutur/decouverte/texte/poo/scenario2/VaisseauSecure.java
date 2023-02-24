package be.technifutur.decouverte.texte.poo.scenario2;


public class VaisseauSecure {
    private String nom;
    private int nbMissile;

    VaisseauSecure(String nom, int nbMissile) {
        this.nom = nom;
        this.nbMissile = nbMissile > 0 ? nbMissile : 0;
    }

    public int getNbMissile() {
        return this.nbMissile;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNbMissile(int nbMissile) {
        this.nbMissile = nbMissile;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void tirer() {
        if (deleteMissile(1)) {
            System.out.println("Pann");
        } else {
            System.out.println("plouf");
        }
    }

    private boolean deleteMissile(int nbMissile) {
        boolean flag = false;
        if (this.getNbMissile() > 0) {
            this.setNbMissile(this.getNbMissile() - 1);
            flag =  true;
        }
        return flag;
    }
}
