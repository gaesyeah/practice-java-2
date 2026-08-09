public class App {
    public static void main(String[] args) throws Exception {

        new Ex1().printIntegerProperties(5);

        new Ex2().printFibonacciSequence(10);

        new Ex3().printMultiplicationTable(5, 10);

        new Ex4().printPyramid(5);

        String[] firstArray = { "Gabriel", "Daniel", "Rafael", "Wanda", "Thamires" };
        String[] secondArray = { "Gabriel", "Daniel", "Rita", "Vera" };
        new Ex5().printRepeatedElements(firstArray, secondArray);

    }
}
