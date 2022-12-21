import java.util.Random;


public class HW10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lazyArray = new int[7];
        int[] lazyArray2 = new int[7];
        for(int i=0;i<lazyArray.length;i++) {
            lazyArray[i] = random.nextInt(9);
            lazyArray2[i] = random.nextInt(9);
        }
        for (int i = lazyArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lazyArray[j] > lazyArray[j + 1]) {
                    int tmp = lazyArray[j];
                    lazyArray[j] = lazyArray[j + 1];
                    lazyArray[j + 1] = tmp;
                }
                if (lazyArray2[j] > lazyArray2[j + 1]) {
                    int tmp = lazyArray2[j];
                    lazyArray2[j] = lazyArray[j + 1];
                    lazyArray2[j + 1] = tmp;
                }
            }
        }
        for (int k : lazyArray) {
            System.out.print(k + " ");
        }
        System.out.println( " ");
        for (int j : lazyArray2) {
            System.out.print(j + " ");
        }
        System.out.println( " ");
        int count = 0;
        for (int a = 0; a < lazyArray.length; a++) {
            if(lazyArray[a] == lazyArray2[a]) {

                count++;
            }
        }
        System.out.print("Кількість збігань: " + count);
    }
}