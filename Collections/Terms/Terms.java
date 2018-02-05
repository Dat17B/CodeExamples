package Terms;

import Generator.ListGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Terms
{
    public static void main(String[] args)
    {
        // Type is an interface of Collection and the interface List
        Collection<Integer> collection = ListGenerator.createArrayList(20,100);
        List<Integer> list = ListGenerator.createList(20,100);
        List<Integer> listSequence = ListGenerator.createSequenceList(0,25);

        // displays Collections
        System.out.println("Collection:\n" + collection);
        System.out.println("List:\n" + list);
        System.out.println("List in sequence:\n" + listSequence);

        //Collections.sort(collection);
        Collections.sort(list);

        // Shuffle sequence list
        Collections.shuffle(listSequence);

        // Prints reorganized lists
        System.out.println("List: sorted\n" + list);
        System.out.println("List in Sequence: shuffled\n" + listSequence);
    }
}
