public class Main {
    public static void main(String[] args) {
        /* Afisare mesaje la output   */

        System.out.println("Hello and welcome!");
        System.out.println("Hello and welcome!");


        /* declarare tipuri de date primitive */

        byte a = 0;
        System.out.println(a);

        int b = 10;
        System.out.println(b);

        boolean c = true;
        System.out.println(c);


        char d = 'p';
        System.out.println(d);


        System.out.println("b " + b);

        int e = 2;
        long f = 3;
        long result = e + f;
        System.out.println("e + f = " + result);


        int x = 3;
        int y = 4;
        int secresult = x - y;
        System.out.println("x - y = " + secresult);

        int z = 6;
        y = 3;
        result = x/y;
        System.out.println("x / y = " + x/y);

        System.out.println("z++ " + z++);
        System.out.println("++z " + z++);
        System.out.println("z= " + z);



        int g = 15;

        System.out.println("g= " + g++); //15
        System.out.println("g= " + ++g); //17
        System.out.println("g= " + g);   //17


        boolean h = true;
        boolean i = false;
        System.out.println("h nu este " + !h);



    }
    }