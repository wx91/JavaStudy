package io.github.wx91.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFile {
    public static void main(String[] args) {
//        Path path = Paths.get("./StreamFile.java");
//        try {
//            Stream<String> lines = Files.lines(path);
//            lines.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Path dir = Paths.get(".");
        System.out.printf("%n the file tree for %s%n", dir.toAbsolutePath());
        try {
            Stream<Path> fileTree = Files.walk(dir);
            fileTree.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
