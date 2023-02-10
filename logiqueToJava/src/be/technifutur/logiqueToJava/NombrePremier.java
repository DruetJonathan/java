package be.technifutur.logiqueToJava;

/**
 * NombrePremier
 */
public class NombrePremier implements Runnable {

    public void run() {

        int compteur = 0, nbr = 2;
        long before = 0, after = 0;
        boolean Premier = true;

        System.out.println("Nombres Premiers");
        before = System.currentTimeMillis();

        while (compteur < 1000000) {
            for (int i = 2; i < nbr - 1 && Premier; i++) {
                if (nbr % i == 0) {
                    Premier = false;
                }
            }
            if (Premier) {
                System.out.println(nbr);
                compteur++;

            }
            Premier = true;
            nbr++;
        }
        after = System.currentTimeMillis();
        System.out.println("Temps execution: " + (after - before));
    }
}