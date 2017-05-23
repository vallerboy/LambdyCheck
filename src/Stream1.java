import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

/**
 * Created by OskarPraca on 2017-05-23.
 */
public class Stream1 {


    public static void main(String[] args) {

        // Statyczny import
        abs(5 - 20);

        List<String> myList = Arrays.asList("Oskar", "Pitor", "Kondzio", "Kuba");
        myList
                .stream()
                .filter(s -> s.length() > 4)
                .sorted((s,s1) -> s.compareToIgnoreCase(s1))
                .map(s -> s.toUpperCase())
                .findFirst()
                .ifPresent(s -> System.out.println(s));


        String obiekt = "AkademiaKodu";
        Optional<String> optional = Optional.ofNullable(obiekt);
        optional.ifPresent(s -> System.out.println(s));

        System.out.println("-------------------------");


        List<String> myListInteger = Arrays.asList("a124", "b14214", "g123", "o137");

      myListInteger
                .stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::valueOf)
                .map(s -> s + 100)
                .min()
                .ifPresent(System.out::println);

       long values =  IntStream
                .of(5,10,124,123)
                .sum();
       System.out.println(values);


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oskar", 26));
        personList.add(new Person("Piotr", 20));
        personList.add(new Person("Lukasz", 70));
        personList.add(new Person("Kuba", 14));

        String message = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person1 -> person1.getName())
                .collect(Collectors.joining(" i ", "Powyzej 18 lat sa: ", " ."));

        System.out.println(message);

        Double aver  = personList
                .stream()
                .collect(Collectors.averagingInt(person -> person.getAge()));

        System.out.println("Srednia wieku to: " + aver);

        IntSummaryStatistics statistics  = personList
                .stream()
                .collect(Collectors.summarizingInt(person -> person.getAge()));


        System.out.println("Statystki: " + statistics);

        List<String> converted =
                personList
                        .stream()
                        .map(s -> s.getName())
                        .collect(Collectors.toList());

        System.out.println(converted);


    }


}
