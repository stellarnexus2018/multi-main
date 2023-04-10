package ru.master.demo1;

public class WorkThread extends Thread {
  @Override
  public void run() {
    System.out.println("Поток: " + getName());
    /*try {
      sleep(5_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }*/
  }
}