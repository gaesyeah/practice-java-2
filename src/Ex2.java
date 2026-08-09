public class Ex2 extends ExBase {
  public Ex2() {
    super(2);
  }

  public void printFibonacciSequence(int length) {
    StringBuilder fibonacciLine = new StringBuilder();

    if (length == 1) {
      System.out.println(0);
      return;
    }

    if (length <= 0) {
      System.out.println("O número deve ser maior que 0.");
      return;
    }

    if (length >= 1) {
      fibonacciLine.append(0);
    }

    if (length >= 2) {
      fibonacciLine.append(" ").append(1);
    }

    int previous = 0;
    int current = 1;

    for (int i = 3; i <= length; i++) {
      int next = previous + current;

      fibonacciLine.append(" ").append(next);

      previous = current;
      current = next;
    }

    System.out.println(fibonacciLine);
  }
}
