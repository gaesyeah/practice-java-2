package exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex5 extends ExBase {
  public Ex5() {
    super(5);
  }

  public static void printRepeatedElements(String[] firstArray, String[] secondArray) {
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

  public static void printRepeatedElementsWithHashSet(List<String> firstList, List<String> secondList) {
    Set<String> secondSet = new HashSet<>(secondList);

    for (String word : firstList) {
      if (secondSet.contains(word)) {
        System.out.println(word);
      }
    }
  }
}
