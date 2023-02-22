package be.technifutur.decouverte.texte.primitif;

public class Decouverte {
    public static void main(String[] args) {
        // boolean
        testboolean();
        //entier signé
        testByte();
        testShort();
        testInteger();
        testLong();
        // caractère
        testChar();
        //numérique flotant
        testFloat();
        testDouble();
    }

    private static void testFloat() {
    }

    private static void testDouble() {
    }

    private static void testChar() {
    }

    private static void testLong() {

    }

    private static void testInteger() {
        Integer test = Integer.MIN_VALUE; // -2.000.000.000 à + 2.000.000.000
        int test2 = 3;
        test = test / test2;
        test = test % test2;
        test = 0b00110;

        System.out.println("0b00110 : "+test);
        System.out.println("test & test2 : "+(test & test2));
        System.out.println("test | test2 : "+(test | test2));
        System.out.println("test ^ test2 : "+(test ^ test2));
        System.out.println("~test + 1: "+(~test +1));
        System.out.println("test << 2: "+(test <<2));
        System.out.println("test >> 2: "+(test >>2));
        System.out.println("test >>> 2: "+(test >>>2));
        ;
    }

    private static void testShort() {
        short test = Short.MIN_VALUE; // -30000 à + 30000
        short test2 = 2;
        short i = test2;
        test = (short)i;
        //test = i;
        //test = test + test2;
        test += test2;
    }

    private static void testByte() {
        byte test = Byte.MIN_VALUE; // - 100 à + 100
        byte test2 = 2;
        int i = test2;
        test = (byte)i;
        //test = i;
        //test = test + test2;
        test += test2;

    }

    private static void testboolean() {
        boolean test = true,test2 = false;
        test = false;
        // int i = test
        // int i = (int) test
        // test = 0

        test = !test;
        test = test & test2;
        test = test && test2;
        test = test | test2;
        test = test || test2;
        test = test ^ test2;

        test &= test2;
        test |= test2;
        test ^= test2;

        Boolean object = Boolean.TRUE;
        test = object;
        test = object.booleanValue();
        test = object.booleanValue();
        if (test == false) {
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }
}
