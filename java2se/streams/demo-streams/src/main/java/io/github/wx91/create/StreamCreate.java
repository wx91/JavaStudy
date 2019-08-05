package io.github.wx91.create;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("java2se");
//        stream.forEach(System.out::println);

//        Stream<String> stream = Stream.of("XML", "Java", "CSS", "SQL");
//        stream.forEach(System.out::println);

//        String[] names = {"XML", "Java", "CSS", "SQL"};
//        Stream<String> stream = Stream.of(names);
//        stream.forEach(System.out::println);

//        Stream<String> stream = Stream.<String>builder()
//                .add("XML")
//                .add("Java")
//                .add("CSSS")
//                .add("SQL")
//                .build();
//        stream.forEach(System.out::println);

//        IntStream oneToFive = IntStream.range(1, 6);
//        IntStream oneToFive = IntStream.rangeClosed(1,5)
//        oneToFive.forEach(System.out::println);

        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}
