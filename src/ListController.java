import java.util.List;
import java.util.ListIterator;

public class ListController {


    public static void populate(List myList, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            myList.add((int) (Math.random() * amountOfElements));
        }
    }

    public static long populateAverage(List list, int amountOfElements) {
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            populate(list, amountOfElements);
            list.clear();
        }
        return (System.nanoTime() - start) / 100;
    }

    public static long addToListAverage(List list, int amountOfElements) {
        populate(list, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.add(list.size() / 2, (int) Math.random() * amountOfElements);
        }
        return (System.nanoTime() - start) / 100;
    }

    public static long getFromListAverage(List list, int amountOfElements) {
        populate(list, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.get((int) Math.random() * amountOfElements);
        }
        return (System.nanoTime() - start) / 100;
    }

    public static long removeFromListAverage(List list, int amountOfElements) {
        populate(list, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.remove((int) Math.random() * amountOfElements);
        }
        return (System.nanoTime() - start) / 100;
    }

    public static long containsValueAverage(List list, int amountOfElements) {
        populate(list, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.contains((int) Math.random() * amountOfElements);
        }
        return (System.nanoTime() - start) / 100;
    }

    public static long iteratorAddAverage(List list, int amountOfElements) {
        populate(list, amountOfElements);
        ListIterator iterator = list.listIterator();
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            iterator.add((int) Math.random() * amountOfElements);
        }
        return (System.nanoTime() - start) / 100;
    }

    public static long iteratorRemoveAverage(List list, int amountOfElements) {
        populate(list, amountOfElements);
        ListIterator iterator = list.listIterator();
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            iterator.next();
            iterator.remove();
        }
        return (System.nanoTime() - start) / 100;
    }
}