package ru.master.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
  public void Run1() {
    List<Cat> lst = new ArrayList<>(List.of(
        new Cat("Barsik", LocalDate.of(2022, 1, 1)),
        new Cat("Vaska", LocalDate.of(2022, 1, 2))
    ));
    final Cat cat1 = lst.stream().max(Comparator.comparing(Cat::getDateOfBirth)).orElse(null);
    System.out.println("cat1: " + cat1);
    final Cat cat2 = lst.stream().min(Comparator.comparing(Cat::getDateOfBirth)).orElse(null);
    System.out.println("cat2: " + cat2);

    final List<Cat> collect = lst
        .stream()
        .sorted(Comparator.comparing(Cat::getDateOfBirth).reversed())
        .collect(Collectors.toList());

    System.out.println("collect: " + collect);
  }
}

class Cat {
  private String name;
  private LocalDate dateOfBirth;

  public Cat(String name, LocalDate dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }

  public Cat() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        '}';
  }
}
