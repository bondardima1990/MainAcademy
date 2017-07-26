package OOP.Theme15Collections.Lab3;

import java.util.*;

/**
 * Created by DELL on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("A num_" + i);
            linkedList.add("L num_" + i);
        }

        Iterator<String> iteratorArrayList = arrayList.iterator();
        System.out.println("ArrayList:");
        while (iteratorArrayList.hasNext()){
            System.out.println(iteratorArrayList.next());
        }

        Iterator<String> iteratorLinkedList = linkedList.iterator();
        System.out.println("LinkedList:");
        while (iteratorLinkedList.hasNext()){
            System.out.println(iteratorLinkedList.next());
        }

        System.out.println("LinkedList + ArrayList");
        linkedList.addAll(arrayList);
        System.out.println(linkedList);

        ListIterator<String> listIterator = arrayList.listIterator(arrayList.size());
        List<String> copy = new ArrayList<>(arrayList);
        while (listIterator.hasPrevious()){
            copy.add(listIterator.previous());
        }
        printElements(copy);
    }

    private static <T> void printElements(Collection<T> copy){
        Iterator<T> iterator = copy.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
