import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3Tests {

    @Test
    public void shouldCountNumberOfTreesInPath() {
        var terrainMap = Stream.of(
                "..##.......",
                "#...#...#..",
                ".#....#..#.",
                "..#.#...#.#",
                ".#...##..#.",
                "..#.##.....",
                ".#.#.#....#",
                ".#........#",
                "#.##...#...",
                "#...##....#",
                ".#..#...#.#"
        ).map(String::toCharArray).collect(Collectors.toList());

        var result = Day3.countOfTrees(terrainMap);

        Assertions.assertEquals(7L, result);
    }
}
