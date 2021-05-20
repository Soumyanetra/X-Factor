public class array_basic {
    public static void main(String[] args) {
        //Assiging a array of length 5
        int a[] = { 1, 21, 3, 4, 6 ,5,6,78,34,2,45,4356,4645,67,4,234,2,24,14123,1234,1,44,34,14,14,4,2};
        //          0   1  2  3  4
        a[3] = 50;
        for (int i = 0; i < a.length; ++i) //a.length
            System.out.println("a[" + i + "] = " + a[i]);
        
        //dynamic initialisation
        System.out.println("\nDynamic: \n\n");
        int b[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < b.length; ++i) //b.length
            System.out.println("b[" + i + "] = " + b[i]);

    }
}
