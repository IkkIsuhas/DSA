import java.util.Scanner;
public class Transpose2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer the rows");
        int r = sc.nextInt();
        System.out.println("Enteer the columns");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enteer the array elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original 2D array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
         System.out.println("Transpose 2D array");
        for (int j = 0; j < r; j++) {
            for (int i = 0; i < c; i++) {
                System.out.print(arr[i][j]);
            }
            System.err.println();
        }
        sc.close();
    }
}
