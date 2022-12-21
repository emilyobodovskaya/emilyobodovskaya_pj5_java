import java.util.Random;


public class Tr {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lazyArray = new int[7];
        for(int i=0;i<lazyArray.length;i++) {
            lazyArray[i] = random.nextInt(9);

        }
        for (int i = lazyArray.length - 1; i > 0; i--) {
            for (int j = 0; j < lazyArray.length; j++) {
                if (lazyArray[j] > lazyArray[j + 1]) {
                    int tmp = lazyArray[j];
                    lazyArray[j] = lazyArray[j + 1];
                    lazyArray[j + 1] = tmp;
                }
            }
        }

        for (int k : lazyArray) {
            System.out.print(k + " ");
        }
        System.out.println( " ");
        int[] lazyArray2 = new int[7];
        for(int i=0;i<lazyArray2.length;i++) {
            lazyArray2[i] = random.nextInt(9);

        }
        for (int i = lazyArray2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lazyArray2[j] > lazyArray2[j + 1]) {
                    int tmp = lazyArray2[j];
                    lazyArray2[j] = lazyArray[j + 1];
                    lazyArray2[j + 1] = tmp;
                }
            }
        }
        for (int j : lazyArray2) {

            System.out.print(j + " ");
        }
    }
}
