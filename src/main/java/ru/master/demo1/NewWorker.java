package ru.master.demo1;

public class NewWorker implements Runnable {
  @Override
  public void run() {
    System.out.println("runnable: " + Thread.currentThread().getName());
  }
}