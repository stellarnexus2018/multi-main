package ru.master.demo3;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Room3 {
  public static void main(String[] args) {
    Cat vaska = new Cat("Vaska", 3);
    Cat muska = new Cat("Muska", 4);
    Cat yashka = new Cat("Yashka", 5);

    List<Cat> lst = new ArrayList<>(List.of(vaska, muska, yashka));

    List<String> collect = lst
        .stream()
        .filter(Room3::testThis)
        .peek(System.out::println)
        .map(Cat::getName)
        .collect(Collectors.toList());


    //lst.removeIf(cat -> cat.getAge() < 5);
    //lst.removeIf(Room3::testThis);

    //System.out.println("lst: " + lst);
    System.out.println("collect: " + collect);
  }

  public static boolean testThis(Cat cat) {
    return cat.getAge() < 5;
  }




}