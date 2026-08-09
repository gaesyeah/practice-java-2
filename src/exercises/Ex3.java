package exercises;

public class Ex3 extends ExBase {
  public Ex3() {
    super(3);
  }

  public static void printMultiplicationTable(int multiplier, int maxMultiplier) {
    for (int i = 0; i <= maxMultiplier; i++) {
      int result = multiplier * i;

      System.out.println(multiplier + " x " + i + " = " + result);
    }
  }

}
