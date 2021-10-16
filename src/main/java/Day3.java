import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Day3 {
    private static final Character treeSpace = '#';
    private static final Integer slopeAcross = 3;

    public static Long countOfTrees(List<char[]> terrainMap) {
        var index = new AtomicInteger();

        return terrainMap.stream()
                .filter(it -> treeIsHit(index.getAndIncrement(), it))
                .count();
    }

    public static Boolean treeIsHit(Integer rowNumber, char[] terrainRow) {
        return terrainRow[(rowNumber * slopeAcross) % terrainRow.length] == treeSpace;
    }
}
