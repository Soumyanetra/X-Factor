class square_pattern_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) { //row
            int c = i;
            for (int j = 1; j <= 5; ++j) { //column
                System.out.print(c + "\t");
                if(j>=i)
                    ++c;
            }
            System.out.println();
        }
    }
}