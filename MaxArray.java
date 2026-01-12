import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the array elements");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(i=0;i<size;i++){
            if (max < arr[i]){
            max = arr[i];
            }     
        }        
    System.out.println("MAX element in array: "+max); 
 sc.close();   
}
}