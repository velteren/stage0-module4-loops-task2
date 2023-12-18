package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter += 1;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (counter >= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter -= 1;
            }
        }
    }
}
