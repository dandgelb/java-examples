package com.examples.functional;

import java.util.*;
import java.util.function.Consumer;

public class SampleFunctionalLoop {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //External iterators
//    
//    for(int i = 0; i < numbers.size(); i++) {
//      System.out.println(numbers.get(i));
//    }
//    for (int e : numbers) {
//      System.out.println(e);
//    }
    //Internal iterators
//    numbers.forEach(new Consumer<Integer>() {
//      @Override
//      public void accept(Integer e) {
//        System.out.println(e);
//      }
//    });
      //numbers.forEach((Integer e) -> System.out.println(e));
      numbers.forEach((e) -> System.out.println(e));
  }

}
