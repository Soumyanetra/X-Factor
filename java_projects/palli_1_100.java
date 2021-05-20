public class palli_1_100 {
    public static void main(String[] args) {
        //way 1 (only valid upto 2 digit Numbers)
        System.out.println("Palindromes are: ");
        for(int i=1; i<=99; i++)
        {
            if (i < 10 || i % 11 == 0)
                System.out.println(i);
        }
        
     //way 2 (Robust)
        // int c, r=0;
        // System.out.println("Palindromes are: ");
        // for(int i=1; i<=99; i++)
        // {
        //     if(i<10)
        //         System.out.println(i);
        //     else {
        //         c = i;
        //         while (c > 0) {
        //             r = r * 10 + (c % 10);
        //             c /= 10;
        //         }
        //         if (r == i)
        //             System.out.println(i);
        //     }
        //     r = 0;
        // }
    }
}
