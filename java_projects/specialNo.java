import java.util.*;

public class specialNo {
    public static void main(String[] args) {
        // 145=1!+4!+5!=145
        // 4!=4*3*2*1=24
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int c = n, f = 1, s = 0;
        while (c > 0) {
            for (int i = 1; i <= c % 10; i++)
                f *= i;
            s += f;
            f = 1;
            c /= 10; // c=c/10
        }
        if (s == n)
            System.out.println("Special");
        else
            System.out.println("Not Special");
        sc.close();
    }
}
