package ru.master.demo1;

public class Room1 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("room1");
    WorkThread workThread;
    for (int i = 0; i < 5; i++) {
      workThread = new WorkThread();
      workThread.start();
      //workThread.join();
    }

    Thread newWorker;
    for (int i = 0; i < 5; i++) {
      newWorker = new Thread(new NewWorker());
      newWorker.start();
      //newWorker.join();
    }

    System.out.println("Основной поток");
  }
}
