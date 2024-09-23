
public class ex2 {
    public static void main(String[] args) {
    //se da urm array {1,2,3,4,5,6,7,8,9,10} separati l in 2 arrayuri unidimensionale separate
        //primul cu nr pare
        //al doilea doar nr impare

        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] FirstArray = new int[10]; //even
        int[] SecondArray = new int[10]; //odd-impar

        // i < Array.lenght(daca nu se stie nr elementelor din array

        int ArraySize = Array.length;
        System.out.println("Marimea este " + ArraySize);
        for (int i=0;i<ArraySize;i++) {
            if(Array[i] % 2 == 0) {
                FirstArray[i] = Array[i];
            } else{
                SecondArray[i] = Array[i];
            }
        }
        System.out.println("nr pare sunt: ");
        for(int number : FirstArray){
            System.out.println(number);
        }
        System.out.println("nr impare sunt: ");
        for(int number : SecondArray){
            System.out.println(number);
        }



    }
}
