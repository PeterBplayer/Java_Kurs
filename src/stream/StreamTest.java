package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // tworzenie strumienia
        List<String> names = Arrays.asList("Tom", "John", "Mat", "Paul");
        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3, 3, 2, 1, 2, 4);
        IntStream intStream = IntStream.range(1, 100);

        // przetwarzanie danych
        // filter - filtrowanie
        // map - zmiana elementu na coś innego
        // limit - zwraca określoną liczbę elementów
        // peek - pozwala przeprowadzić operacje na każdym elemencie

        // forEach - wykonanie akcji dla każdego elementu strumienia
        // count - zwróci ilość elementów w strumieniu
        // allMatch - sprawdza czy elementy spełniają zadany warunek
        // collect - zwraca nowy typ na podstawie strumienia

         List<String> modifiedNames =
                 streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0));


        intStream.filter(el -> el > 20)
                .map(el -> el * 2)
                .limit(10)
                .forEach(el -> System.out.println(el));


    }
}
