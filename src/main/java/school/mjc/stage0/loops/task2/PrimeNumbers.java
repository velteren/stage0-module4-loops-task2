package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0 && n != 2) return false;
        for (int i = 3; i < Math.floor(Math.sqrt(n)) + 2; i += 2) {
            if (n % i == 0 && n != i) return  false;
        }
        return true;
    }
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 1;
        while (counter <= printToInclusive) {
            if (isPrime(counter)) System.out.println(counter);
            counter += 1;
        }
    }
}
