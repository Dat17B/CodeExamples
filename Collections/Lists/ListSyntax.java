package Lists;

import Generator.ListGenerator;

import java.util.ArrayList;
import java.util.List;

public class ListSyntax
{
    public static void main(String[] args)
    {
        // Variable
        List<Integer> list = ListGenerator.createList(25, 50);
        // Print created list
        System.out.println("List generated:\n" + list);

        // Modify list runtime
        list = new ArrayList<>();
        System.out.println("new ArrayLit<>();\n" + list);

        // Runtime polymorphy to LinkedList
        list = ListGenerator.createLinkedList(25, 50);
        System.out.println("Modified list to a Linked list, by the list generator:\n" + list);
    }
}
