import java.util.*;
public class max_min_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int i = 0,max,min;
        for (i = 0; i < num.length; ++i) {
            System.out.print("Enter Element " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        max = min = num[0]; //{5,4,6,8,9}
        for (i = 1; i < num.length; ++i) {
            if(max<num[i])
                max = num[i];
            else if(min > num[i])
                min = num[i];
        }
        System.out.println("\nMAX: " + max + "\nMIN: " + min);
        
        //System.out.println("\"LET'S JAVA\"");
        /*num[]={1,2,4,6,8}
                0 1 2 3 4 (subscripted value)
        num[0] -> 1
        num[3] -> 6
        num[1] = num[0]+num[num.lenght-1]
        num[1] ->
        //R- 9      T- 9
        num[num[2]] -> num[4] -> 8
        //R-8    T- 8
        num[2] -> 4
        */
    }
}
