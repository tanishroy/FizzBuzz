/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            i = doFizzBuzz(i);
        }
//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
    }

    public static void main_caller()
    {
        main(null);
    }

    public static int doFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizz Buzz");

        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        }

        else if (i % 5 == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(i);
        }

        i +=1;
        return i;
    }

}
