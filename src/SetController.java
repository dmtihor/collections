import java.util.Set;

public class SetController {
    public long addToSetAverage(Set set, int amountOfElements) {
        populate(set, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            set.add((int) (Math.random() * amountOfElements));
        }
        return (System.nanoTime() - start) / 100;
    }


    public long removeFromSetAverage(Set set, int amountOfElements) {
        populate(set, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            set.remove((int) (Math.random() * amountOfElements));
        }
        return (System.nanoTime() - start) / 100;
    }


    public long containsSetAverage(Set set, int amountOfElements) {
        populate(set, amountOfElements);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            set.contains((int) (Math.random() * amountOfElements));
        }
        return (System.nanoTime() - start) / 100;
    }


    public void populate(Set set, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            set.add((int) (Math.random() * amountOfElements));
        }
    }

    public long populateSetAverage(Set set, int amountOfElements) {
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            populate(set, amountOfElements);
            set.clear();
        }
        return (System.nanoTime() - start) / 100;
    }
}