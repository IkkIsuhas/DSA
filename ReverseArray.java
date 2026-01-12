import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
        for(int i=0,j=size-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Reversed array: ");
        for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
