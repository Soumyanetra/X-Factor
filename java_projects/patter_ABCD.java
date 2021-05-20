public class patter_ABCD {
    public static void main(String[] args) {
        char c;
        for (int i = 5; i > 1; --i) {
            c = 'A';
            for (int j = 1; j < i; ++j)
                System.out.print((c++) + "\t");
            System.out.println();
        }
    }
}
