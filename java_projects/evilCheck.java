
class evilCheck {
    public static void main(String[] args) {
        
        int num, count=0, copy;
        for (int i = 1; i <= 5; ++i) {
            num = (int) (Math.random() * 400) + 100;
            copy = num;
            System.out.println(copy + " is the Number Generated");
            while (num > 0) {
                if (num % 10 == 1)
                    count++;
                num /= 10;
            }
            if(count > 0 && count%2==0)
                System.out.println(copy + " is Evil Number");
            count = 0;
        }
    }
}
