import java.util.List;

public class Day1 {

    public static Integer productOfTwoEntriesWhoseSumIs2020(List<Integer> expenseEntries) {
        return expenseEntries.stream()
                .filter(it -> expenseEntries.contains(2020 - it))
                .reduce(1, (a, b) -> a * b);
    }

}
