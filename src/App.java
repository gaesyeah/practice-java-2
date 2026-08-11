import java.util.List;
import exercises.Ex1;
import exercises.Ex2;
import exercises.Ex3;
import exercises.Ex4;
import exercises.Ex5;
import exercises.Ex6.Holidayzer;
import exercises.Ex8.Library;

public class App {
  public static void main(String[] args) throws Exception {

    new Ex1().printIntegerProperties(5);

    new Ex2().printFibonacciSequence(10);

    new Ex3().printMultiplicationTable(5, 10);

    new Ex4().printPyramid(5);

    List<String> firstList = List.of("Gabriel", "Daniel", "Rafael", "Wanda", "Thamires");
    List<String> secondList = List.of("Gabriel", "Daniel", "Rita", "Vera");
    new Ex5().printRepeatedElementsWithHashSet(firstList, secondList);

    Holidayzer holidayzer = new Holidayzer();
    holidayzer.isHoliday("01-01-2024");
    holidayzer.isHoliday("12-09-2024");
    holidayzer.printHolidayList();

    Library library = new Library();
    library.printAvailableBooks();
    library.borrowBook("A Hora da Estrela");
    library.printAvailableBooks();
    library.returnBook("A Hora da Estrela");
    library.printAvailableBooks();
  }
}
