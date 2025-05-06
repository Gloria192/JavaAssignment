package CSV;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVStreamProcessor {
    public static double calculateAverageAge(String csvFilePath) throws IOException {

        try (Stream<String> file = Files.lines(Paths.get(csvFilePath))) {
            return file
                    .skip(1)
                    .map(line -> line.split(","))
                    .mapToInt(parts -> Integer.parseInt(parts[1]))
                    .average()
                    .orElseThrow(() -> new IOException("No data found"));

        }
        catch (NumberFormatException e){
            throw new IOException("Invalid data format");
        }

    }

public static void main(String[] args) throws IOException {
        double averageAge = calculateAverageAge("C:\\Users\\USER\\IdeaProjects\\Assignmentjava\\src\\CSV\\People.CSV");
    System.out.println("Average age is: " + averageAge);
}
}

