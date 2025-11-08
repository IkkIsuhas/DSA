import java.util.Scanner;
public class Largestarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int max;
        int i;
        System.out.println("Enter the array element: ");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for(i=0;i<size;i++){
           if(max > arr[i]){
           }else{
            max = arr[i];
           }
        }
        System.out.println(max+" is the largest element in this array!");
        sc.close();
    }
}