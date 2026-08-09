package exercises;

public class Ex4 extends ExBase {
  public Ex4() {
    super(4);
  }

  public void printPyramid(int height) {
    if (height <= 0) {
      System.out.println("O número deve ser maior que 0.");
      return;
    }

    for (int i = 1; i <= height; i++) {
      StringBuilder pyramidLine = new StringBuilder();

      for (int j = 1; j <= i; j++) {
        pyramidLine.append(i);
      }

      System.out.println(pyramidLine);
    }
  }
}
