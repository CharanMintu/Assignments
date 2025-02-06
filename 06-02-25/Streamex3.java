package streamsspack;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamex3 {

    public static List<String> filterAndConvertToUpper(Stream<String> stream, int length) {
        return stream
                .filter(s -> s.length() == length) // Filter lines by length
                .map(String::toUpperCase) // Convert to uppercase
                .collect(Collectors.toList()); // Collect to a list
    }

    public static void main(String[] args) {
        String filename = "src//streamsspack//test.txt"; // Ensure path correctness

        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            List<String> filteredList = filterAndConvertToUpper(lines, 5);
            System.out.println("Converted List: " + filteredList);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
