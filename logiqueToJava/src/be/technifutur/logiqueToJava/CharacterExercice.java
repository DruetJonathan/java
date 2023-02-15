package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class CharacterExercice implements Runnable {
    public void run() {
        Scanner scan = new Scanner(System.in);
        boolean recherche = true;

        System.out.print("Entrez un mot: ");
        String texte = scan.nextLine();
        System.out.print("Entrez une lettre à chercher: ");
        char lettre = scan.nextLine().charAt(0);

        for (int i = 0; i < texte.length() && recherche; i++) {
            if (texte.charAt(i) == lettre) {
                recherche = false;
            }
        }
        if (!recherche) {
            System.out.println("Le caractère a été trouvé");
        } else {
            System.out.println("Le caractère n'a pas été trouvé");
        }
    }
}
