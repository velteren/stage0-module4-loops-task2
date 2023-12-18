package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        if (printToInclusive <= 0) {
            System.out.println(1);
            counter = printToInclusive + 1;
        }
        while (counter <= printToInclusive) {
            System.out.println(getFactorial(counter));
            counter += 1;
        }
    }
}
