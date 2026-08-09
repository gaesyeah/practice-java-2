public class Ex5 extends ExBase {
  public Ex5() {
    super(5);
  }

  public void printRepeatedElements(String[] firstArray, String[] secondArray) {
    for (int i = 0; i < firstArray.length; i++) {
      String firstArrayWord = firstArray[i];

      for (int j = 0; j < secondArray.length; j++) {
        String secondArrayWord = secondArray[j];

        if (firstArrayWord.equals(secondArrayWord)) {
          System.out.println(secondArrayWord);
          break;
        }
      }
    }
  }
}
