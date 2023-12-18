package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String result = "";
        while (counter <= chars.length) {
            result += chars[counter];
            counter += 1;
        }
        System.out.println(result);
    }
}
