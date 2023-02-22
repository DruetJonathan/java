package be.technifutur.logiqueToJava;

public class binaryUtils implements Runnable{
    public void run() {
        // init
        int data = init();
        System.out.println("Data vaut: "+Integer.toBinaryString(data));

        //estPossible
        boolean estPossibleValue = estPossible(data,7);
        System.out.println("estPossible: "+estPossibleValue);

        //delete
        data = deletePossibilite(data,7);
        System.out.println("New data sans 7: "+Integer.toBinaryString(data));
        data = deletePossibilite(data,7);
        System.out.println("New data sans 7: "+Integer.toBinaryString(data));

        //add
        data = addPossibilite(data,7);
        System.out.println("New data add 7: "+Integer.toBinaryString(data));
    }

    private int addPossibilite(int data, int value) {
        int tmp = (1 << (value -1));
        return data + tmp;
    }

    private int deletePossibilite(int data, int value) {
        //data <- data et data not value
        int tmp = (1 << (value - 1));
        return data - tmp;
    }

    static int init(){
        // 1 decaler de 9 positions a gauche
        return (1<<9)-1;
    }
    static boolean estPossible(int data ,int value){
        int tmp = (1 << (value -1));
        if (data - (tmp) > 0 ){
            return true;
        }
        return false;
    }
}
