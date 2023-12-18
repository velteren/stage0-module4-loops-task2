package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (counter <= power) {
                System.out.println(Math.pow(power, counter));
                counter += 1;
            }
        }
    }
}
