package Iterator;

import Generator.ListGenerator;
import Generator.MapGenerator;
import Generator.SetGenerator;

import java.util.*;

public class IteratorSyntax
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        // The map will be traversed later or in other method, but same class
        Map<Integer, Integer> map = new HashMap<>();

        // Add values to collections and the map
        set = SetGenerator.createSetFromHash(10, 20);
        list = ListGenerator.createArrayList(10, 20);
        map = MapGenerator.createMapFromHashSequence(0,10, 1);

        // Iterators
        displaySetIterator(set);
        displayListIterator(list);
        loopThroughMap(map);
    }

    private static void displaySetIterator(Set<Integer> set) {
        // Declare and intiate the set iterator
        Iterator<Integer> setItr = set.iterator();

        System.out.println("Set Iterator traverse print out");
        // hasNext(), Returns true or false
        while (setItr.hasNext()) { // Ask if the set iterator has a next element
            // .next() returns elements at pointer and then pionts to the next element
            System.out.print(setItr.next());

            // If there is a next element then add ", "
            if (setItr.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    private static void displayListIterator(List<Integer> list) {
        // Declare and intiate the set iterator
        Iterator<Integer> listItr = list.iterator();

        System.out.println("List Iterator traverse print out");
        // hasNext(), Returns true or false
        while (listItr.hasNext()) { // Ask if the set iterator has a next element
            // .next() returns elements at pointer and then pionts to the next element
            System.out.print(listItr.next());

            // If there is a next element then add ", "
            if (listItr.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void loopThroughMap(Map<Integer, Integer> map) {
        /*
        * To loop through a map you need some different method and object
        * Map<Integer, Integer>
        * Map.Entry<Integer, Integer>
        * map.entrySet(). The Map map is a parameter
        * */
        System.out.println("--- Map keys and values Start ---");
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println("\tKey: " + entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("--- Map keys and values End ---");
    }
}
