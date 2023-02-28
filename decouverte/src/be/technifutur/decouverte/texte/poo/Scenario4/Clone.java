package be.technifutur.decouverte.texte.poo.Scenario4;

public class Clone extends Empire{
    Clone(String nom) {
        super(nom);
    }
    @Override
    public void combattre(){
        System.out.println("Ce clone de l'empire se bat");
    }
}
