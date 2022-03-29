import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1;
        int number2 = 3;
        int sayac = 1;
        System.out.println("Please enter the value you want to check the prime state :");
        Scanner keyboard = new Scanner(System.in);
        number1 = keyboard.nextInt();
        if (number1 == 1)
        {
            System.out.println("Please enter a value bigger than 1");
            return;
        }
        System.out.println("Number 2 is prime");
        while (number2 <= number1)
        {
            int i = 2;
            boolean isPrime = true;
            while ( i<number2)
            {
                if ( number2 % i == 0)
                {
                    isPrime = false;
                }
                i++;
            }
            if (isPrime == true)
            {
                System.out.println("Number " + number2 + " is prime");
                sayac++;
            }
            else
            {
                System.out.println("Number " + number2 + " is not prime");

            }
            number2++;
        }
        System.out.println("Total number of primes : " +sayac);










    }
}
