package ru.master.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
  public void runOne() {
    String[] target = new String[]{"h", "a", "t"};
    List<String> lst = new ArrayList<>(List.of("hohoho", "ertete", "trototo", "asretel", "weretea"));
    System.out.println("lst: " + lst);
    Predicate<String> pr = str -> {
      for (String s : target) {
        if (str.startsWith(s)) {
          return true;
        }
      }
      return false;
    };
    lst.removeIf(pr);
    System.out.println("lst: " + lst);
  }
}
