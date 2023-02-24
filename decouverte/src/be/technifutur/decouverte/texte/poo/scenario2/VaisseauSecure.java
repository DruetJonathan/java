package be.technifutur.decouverte.texte.poo.scenario2;


public class VaisseauSecure {
    private int maxMissile;
    private String nom;
    private int nbMissile;

    VaisseauSecure(String nom, int nbMissile,int maxMissile) {
        this.nom = nom;
        this.nbMissile = nbMissile > 0 ? nbMissile : 0;
        this.maxMissile = maxMissile;
    }

    public int getNbMissile() {
        return this.nbMissile;
    }

    public String getNom() {
        return this.nom;
    }

    public int getMaxMissile() {
        return this.maxMissile;
    }

    public void setNbMissile(int nbMissile) {
        this.nbMissile = nbMissile;
    }
    
    public void setMaxMissile(int maxMissile) {
        this.maxMissile = maxMissile;
    }

    public void tirer() {
        if (this.getNbMissile() > 0) {
            System.out.println("Pann");
            this.setNbMissile(this.getNbMissile() - 1);
        } else {
            System.out.println("plouf");
        }
    }

    public boolean deleteMissile(int nbMissile) {
        boolean flag = false;
        if (nbMissile > 0 && nbMissile <= this.getNbMissile()) {
            this.setNbMissile(this.getNbMissile() - nbMissile);
            flag =  true;
        }
        return flag;
    }
    public boolean addMissile(int nbMissile) {
        boolean flag = false;
        if (nbMissile > 0 && nbMissile + this.getNbMissile() <= this.getMaxMissile()) {
            this.setNbMissile(this.getNbMissile() + nbMissile);
            flag =  true;
        }
        return flag;
    }
}
