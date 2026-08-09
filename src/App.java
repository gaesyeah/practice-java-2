import java.util.List;
import exercises.Ex1;
import exercises.Ex2;
import exercises.Ex3;
import exercises.Ex4;
import exercises.Ex5;

public class App {
  public static void main(String[] args) throws Exception {

    Ex1.printIntegerProperties(5);

    Ex2.printFibonacciSequence(10);

    Ex3.printMultiplicationTable(5, 10);

    Ex4.printPyramid(5);

    List<String> firstList = List.of("Gabriel", "Daniel", "Rafael", "Wanda", "Thamires");
    List<String> secondList = List.of("Gabriel", "Daniel", "Rita", "Vera");
    Ex5.printRepeatedElementsWithHashSet(firstList, secondList);

  }
}
