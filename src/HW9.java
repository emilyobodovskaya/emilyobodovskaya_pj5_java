import java.util.Random;

public class HW9 {
    public static void main(String[] args) {

        int [] lazyArray = new int [25];
        Random random  = new Random();
        int summ= 0;
        for (int i = 0; i< 25; i++){

            lazyArray[i] =random.nextInt ((40 + 1) - 18) + 18;
            summ += lazyArray[i];
            System.out.print( lazyArray[i]  + " ");
        }

        System.out.println(  "-"+ " Team 1"  + " ");
        System.out.print((double) summ/ lazyArray.length + " "+ " Middle age");
        System.out.println(  " ");

        int summ2 = 0;
        for (int i = 0; i< 25; i++){

            lazyArray[i] =random.nextInt ((40 + 1) - 18) + 18;
            summ2 += lazyArray[i];
            System.out.print( lazyArray[i]+ " ");

        }
        System.out.println(  "-"+ " Team 2"  + " ");
        System.out.print((double) summ2/ lazyArray.length + " "+ " Middle age");

    }
}

