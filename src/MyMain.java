import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");
        Consumer consumer = str -> System.out.println(str);
        //names.forEach(consumer);
        //names.stream().filter(s -> s.startsWith("K")).forEach(consumer);



    }

    public static void printList(List<String> list, Consumer<String> consumer) {
        for (String str : list) {
            consumer.accept(str);
        }
    }

    // TO JEST METODA Z JAKIEGOS API // IntegerMath pochodzi z api
    public void makeSomeNoise(IntegerMath math) {

    }
}