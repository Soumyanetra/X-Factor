import java.util.*;
public class array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            System.out.print("Enter a Number: ");
            arr[i] = sc.nextInt();
        }
        //arr[]={4 3 2 1} 1 2 3 4
        //arr={1,2,3,4} -> n=4
        //     0 1 2 3
        // for (int i = arr.length - 1; i >= 0; --i) //arr.length -> return array of length
        //     System.out.print(arr[i] + "\t");

        System.out.println();
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        //using forEach loop
        /*
            //syntax of foeEach
            for(data-type item: array) {
                //body
            }
         */
    }
}
