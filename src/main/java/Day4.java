import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Day4 {

    private static final List<String> REQUIRED_FIELDS = Arrays.asList(
            "byr",
            "iyr",
            "eyr",
            "hgt",
            "hcl",
            "ecl",
            "pid"
    );

    public static Long numberOfValidPassportsInFile(String filename) throws IOException {
        var passportsData = extractPassportsDataFromFile(filename);
        return passportsData.stream()
                .map(Map::keySet)
                .filter(Day4::passportContainsRequiredFields)
                .count();
    }

    private static Boolean passportContainsRequiredFields(Set<String> fields) {
        return fields.containsAll(REQUIRED_FIELDS);
    }

    private static List<Map<String, String>> extractPassportsDataFromFile(String filename)
            throws IOException {
        var inputStream = getInputStreamFromFile(filename);
        var streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        var br = new BufferedReader(streamReader);
        var passportsData = new ArrayList<Map<String, String>>();
        var index = new AtomicInteger();
        String strLine;

        while ((strLine = br.readLine()) != null)   {
            if (strLine.isBlank()) {
                index.getAndIncrement();
            } else {
                Stream.of(strLine.split(" "))
                        .map(it -> it.split(":"))
                        .forEach(it -> {
                            if (passportsData.size() <= index.get()) {
                                Map<String, String> newEntry = new HashMap<>();
                                newEntry.put(it[0], it[1]);
                                passportsData.add(newEntry);
                            } else {
                                passportsData.get(index.get()).put(it[0], it[1]);
                            }
                        });
            }
        }

        inputStream.close();

        return passportsData;
    }

    private static InputStream getInputStreamFromFile(String filename) {
        return Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream(filename);
    }
}
