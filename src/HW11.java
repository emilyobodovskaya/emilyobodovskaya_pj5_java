import java.util.Scanner;
    public class HW11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Parameter of N:\n");
            int n = scanner.nextInt();
            System.out.print("Parameter of M:\n");
            int m = scanner.nextInt();
            int[][] a = new int[n][m];
            System.out.println("\nMatrix:\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = m*i + j;
                    System.out.printf("%4d", a[i][j]);
                }
                System.out.println();
            }

        }



}
