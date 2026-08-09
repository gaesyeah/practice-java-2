public class Ex1 extends ExBase {
  public Ex1() {
    super(1);
  }

  public void printIntegerProperties(int integer) {
    String resultText = integer + " é ";

    if (integer % 2 == 0) {
      resultText += "par";
    } else {
      resultText += "ímpar";
    }

    resultText += " e ";

    if (integer < 0) {
      resultText += "negativo";
    } else if (integer > 0) {
      resultText += "positivo";
    } else {
      resultText += "neutro";
    }

    System.out.println(resultText);
  }
}
