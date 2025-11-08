import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = sc.nextInt();
        for(int i=size;i>=1;i--){
            for(int j=size;j>=i;j--){
            System.err.print(j);
        }
    System.out.println();    
    }
    sc.close();
    }
}
