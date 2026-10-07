public class Recursion {

    static void main() {

        System.out.println("Question 1: power: " + power(10,2));

        reverseNumbers(3267);

        System.out.println("\nQuestion 2 gcd: " + gcd(49,14));
    }

    public static long power (long base, long exponent) {


        if (exponent < 1)
        {
            return 1;
    }
        else
        {
        return base = (base * power(base, (exponent-1)));
        }

    }

    public static void reverseNumbers(int n)
    {
        if(n < 10)
        {
            System.out.print(n);
        }
        else
        {
            System.out.print(n%10);
            reverseNumbers(n/10);

        }


    }

    public static int gcd(int m, int n)
    {
        if (m == n)
        {
            return m;
        }
        else if (m > n)
        {
            return gcd(m-n, m);
        }
        else
        {
            return gcd(m, n-m);
        }
    }
}
