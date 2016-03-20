import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;




public class Main {
    private final static int K10 = 10_000;
    private final static int K100 = 100_000;
    private final static int K1000 = 1_000_000;



    public static void main(String[] args) {

        SetController sc = new SetController();

        System.out.println(ListController.populateAverage(new ArrayList(), K10));
        System.out.println(ListController.populateAverage(new ArrayList(), K100));
        System.out.println(ListController.populateAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.populateAverage(new LinkedList(), K10));
        System.out.println(ListController.populateAverage(new LinkedList(), K100));
        System.out.println(ListController.populateAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.addToListAverage(new ArrayList(), K10));
        System.out.println(ListController.addToListAverage(new ArrayList(), K100));
        System.out.println(ListController.addToListAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.addToListAverage(new LinkedList(), K10));
        System.out.println(ListController.addToListAverage(new LinkedList(), K100));
        System.out.println(ListController.addToListAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.getFromListAverage(new ArrayList(), K10));
        System.out.println(ListController.getFromListAverage(new ArrayList(), K100));
        System.out.println(ListController.getFromListAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.getFromListAverage(new LinkedList(), K10));
        System.out.println(ListController.getFromListAverage(new LinkedList(), K100));
        System.out.println(ListController.getFromListAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.removeFromListAverage(new ArrayList(), K10));
        System.out.println(ListController.removeFromListAverage(new ArrayList(), K100));
        System.out.println(ListController.removeFromListAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.removeFromListAverage(new LinkedList(), K10));
        System.out.println(ListController.removeFromListAverage(new LinkedList(), K100));
        System.out.println(ListController.removeFromListAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.containsValueAverage(new ArrayList(), K10));
        System.out.println(ListController.containsValueAverage(new ArrayList(), K100));
        System.out.println(ListController.containsValueAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.containsValueAverage(new LinkedList(), K10));
        System.out.println(ListController.containsValueAverage(new LinkedList(), K100));
        System.out.println(ListController.containsValueAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.iteratorAddAverage(new ArrayList(), K10));
        System.out.println(ListController.iteratorAddAverage(new ArrayList(), K100));
        System.out.println(ListController.iteratorAddAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.iteratorAddAverage(new LinkedList(), K10));
        System.out.println(ListController.iteratorAddAverage(new LinkedList(), K100));
        System.out.println(ListController.iteratorAddAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.iteratorRemoveAverage(new ArrayList(), K10));
        System.out.println(ListController.iteratorRemoveAverage(new ArrayList(), K100));
        System.out.println(ListController.iteratorRemoveAverage(new ArrayList(), K1000));

        System.out.println("==========");

        System.out.println(ListController.iteratorRemoveAverage(new LinkedList(), K10));
        System.out.println(ListController.iteratorRemoveAverage(new LinkedList(), K100));
        System.out.println(ListController.iteratorRemoveAverage(new LinkedList(), K1000));

        System.out.println("==========");

        System.out.println(sc.addToSetAverage(new HashSet(), K10));
        System.out.println(sc.addToSetAverage(new HashSet(), K100));
        System.out.println(sc.addToSetAverage(new HashSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.addToSetAverage(new TreeSet(), K10));
        System.out.println(sc.addToSetAverage(new TreeSet(), K100));
        System.out.println(sc.addToSetAverage(new TreeSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.containsSetAverage(new HashSet(), K10));
        System.out.println(sc.containsSetAverage(new HashSet(), K100));
        System.out.println(sc.containsSetAverage(new HashSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.containsSetAverage(new TreeSet(), K10));
        System.out.println(sc.containsSetAverage(new TreeSet(), K100));
        System.out.println(sc.containsSetAverage(new TreeSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.populateSetAverage(new HashSet(), K10));
        System.out.println(sc.populateSetAverage(new HashSet(), K100));
        System.out.println(sc.populateSetAverage(new HashSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.populateSetAverage(new TreeSet(), K10));
        System.out.println(sc.populateSetAverage(new TreeSet(), K100));
        System.out.println(sc.populateSetAverage(new TreeSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.removeFromSetAverage(new HashSet(), K10));
        System.out.println(sc.removeFromSetAverage(new HashSet(), K100));
        System.out.println(sc.removeFromSetAverage(new HashSet(), K1000));

        System.out.println("==========");

        System.out.println(sc.removeFromSetAverage(new TreeSet(), K10));
        System.out.println(sc.removeFromSetAverage(new TreeSet(), K100));
        System.out.println(sc.removeFromSetAverage(new TreeSet(), K1000));

    }

}
