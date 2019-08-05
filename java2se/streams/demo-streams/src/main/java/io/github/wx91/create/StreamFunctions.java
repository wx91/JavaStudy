package io.github.wx91.create;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFunctions {


    public static void main(String[] args) {
//        Stream<Integer> tenNaturalNumbers = Stream.iterate(1, n -> n + 1).limit(10);
//        tenNaturalNumbers.forEach(System.out::println);
//        Stream.iterate(2L, n -> n + 1)
//                .filter(StreamFunctions::isOdd)
//                .skip(100)
//                .limit(5)
//                .forEach(System.out::println);

//        Stream.generate(Math::random)
//                .limit(5)
//                .forEach(System.out::println);

//        Stream.generate(StreamFunctions::next)
//                .limit(5)
//                .forEach(System.out::println);
//        new Random().ints()
//                .limit(5)
//                .forEach(System.out::println);
//        Stream.generate(new Random()::nextInt)
//                .limit(5)
//                .forEach(System.out::println);
//        IntStream.generate(new Random()::nextInt)
//                .limit(5)
//                .forEach(System.out::println);

        IntStream.generate(() -> 0)
                .limit(5)
                .forEach(System.out::println);
    }

    public static boolean isOdd(long number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    static int i = 0;

    private static int next() {
        i++;
        return i;
    }


}
