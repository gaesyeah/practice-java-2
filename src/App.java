import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        new Ex1().printIntegerProperties(5);

        new Ex2().printFibonacciSequence(10);

        new Ex3().printMultiplicationTable(5, 10);

        new Ex4().printPyramid(5);

        Ex5 ex5 = new Ex5();

        List<String> firstList = List.of("Gabriel", "Daniel", "Rafael", "Wanda", "Thamires");
        List<String> secondList = List.of("Gabriel", "Daniel", "Rita", "Vera");
        ex5.printRepeatedElementsFromHashSet(firstList, secondList);

    }
}
