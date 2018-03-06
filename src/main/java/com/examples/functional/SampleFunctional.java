package com.examples.functional;

public class SampleFunctional {

  public static void main(String[] args) {
    // Thread th = new Thread(new Runnable() {
    //
    // @Override
    // public void run() {
    // System.out.println("In another thread");
    // }
    // });
    Thread th = new Thread(() -> System.out.println("In another thread"));
    th.start();
    System.out.println("In main");
  }
}
