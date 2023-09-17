public class Reduce {
    public static void main(String[] args) {
        int num = 100, counter = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num/2;
            }
            else {
                num -= 1;
            }
            counter += 1;
        }
        System.out.println(counter);
    }
}
