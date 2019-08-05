package io.github.wx91.create;

import java.util.regex.Pattern;

public class StreamString {
    public static void main(String[] args) {
//        String str = "5 123,123,qwe,1,123, 25";
//        str.chars()
//                .filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
//                .forEach(n -> System.out.print((char) n));

        String str = "XML,CSS,HTML";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);


    }
}
