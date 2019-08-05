package io.github.wx91.create;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCollection {
    public static void main(String[] args) {
//        http://www.java2s.com/Tutorials/Java/Java_Stream/0200__Java_Stream_Operations.htm
        Set<String> names = new HashSet<>();
        names.add("XML");
        names.add("Java");

        Stream<String> sequentialStream = names.stream();
        sequentialStream.forEach(System.out::println);

        Stream<String> parallelStream = names.parallelStream();
        parallelStream.forEach(System.out::println);

    }
}
