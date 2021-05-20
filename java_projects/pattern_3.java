public class pattern_3 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= 5; ++j) {
                if (i == 3 && j == 3)
                    System.out.print("8 ");
                else
                    System.out.print((a % 10) + " ");
                a += 2;
            }
            a = i * 2 + 1;
            System.out.println();
        }
    }
}
