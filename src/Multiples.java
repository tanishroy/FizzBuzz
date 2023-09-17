public class Multiples {
    public static void main(String[] args) {
        int counter = 0, num = 1;
        while (num <= 1000) {
            if (num % 3 == 0 && num % 5 == 0) {
                counter += 1;
            }
            else if (num % 3 == 0) {
                counter += 1;
            }
            else if (num % 5 == 0) {
                counter += 1;
            }

            num += 1;
        }
        System.out.println(counter);
    }
}
