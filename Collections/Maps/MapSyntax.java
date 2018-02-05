package Maps;

import Generator.MapGenerator;

import java.util.Map;

public class MapSyntax
{
    public static void main(String[] args)
    {
        // Variables
        // Random values, sequence keys
        Map<Integer, Integer> hashMapRandom =
                MapGenerator.createMapFromHash(10, 30, 100);
        Map<Integer, Integer> treeMapRandom =
                MapGenerator.createMapFromTree(10, 30, 100);
        Map<Integer, Integer> hashMapSequence =
                MapGenerator.createMapFromHashSequence(10, 30, 0);
        Map<Integer, Integer> treeMapSequence =
                MapGenerator.createMapFromTreeSequence(10, 30, 0);

        // Print maps
        // Random
        System.out.println("HashMap: Random\n" + hashMapRandom);
        System.out.println("TreeMap: Random\n" + treeMapRandom);

        // Sequence
        System.out.println("HashMap: Sequence\n" + hashMapSequence);
        System.out.println("TreeMap: Sequence\n" + treeMapSequence);
    }
}
