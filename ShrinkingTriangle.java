import java.util.Scanner;
public class ShrinkingTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            for (int j=i;j<=size;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
