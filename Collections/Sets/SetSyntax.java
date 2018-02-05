package Sets;

import Generator.SetGenerator;

import java.util.HashSet;
import java.util.Set;

public class SetSyntax
{
    public static void main(String[] args)
    {
        // Sequence generated sets variables
        Set<Integer> hashSetSeq = SetGenerator.createSetFromHashSequence(20, 40);
        Set<Integer> treeSetSeq = SetGenerator.createSetFromTreeSequence(20, 40);
        // Random generated sets variables
        Set<Integer> hashSet = SetGenerator.createSetFromHash(20, 100);
        Set<Integer> treeSet = SetGenerator.createSetFromTree(20, 100);

        // Prints tree and hash set
        System.out.println("Hash set in Sequence:\n" + hashSetSeq);
        System.out.println("\nTree set in Sequence:\n" + treeSetSeq);

        System.out.println("\nHash set:\n" + hashSet);
        System.out.println("\nTree set:\n" + treeSet);
    }
}
