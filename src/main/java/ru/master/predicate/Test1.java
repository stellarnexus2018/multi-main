package ru.master.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {
  public void runOne() {
    List<String> lst = new ArrayList<>(List.of("Merhe", "Furma", "Loerho"));

    Predicate<String> pr = str -> str.startsWith("F");
    lst.removeIf(pr);

    System.out.println("lst: " + lst);
  }
}
