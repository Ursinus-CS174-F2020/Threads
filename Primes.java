import java.util.Arrays;

public class Primes {
    public static boolean isPrime(int x) {
        boolean prime = true;
        if (x > 2) {
            for (int i = 2; i <= 1+(int)Math.sqrt(x) && prime; i++) {
                if (x % i == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }

    private int start;
    private int end;

    public Primes(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int countPrimes() {
        int count = 0;
        for (int x = start; x <= end; x++) {
            if (isPrime(x)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Need a start and and end");
        }
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        Primes p = new Primes(start, end);
        System.out.println(p.countPrimes() + " primes between " + start + " and " + end);
    }
}
