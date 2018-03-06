package com.examples.functional;

import java.util.*;

public class SampleDeclarative {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //find the total of double of even numbers
    int result = 0;
    for (int e : numbers) {
      if(e % 2 == 0) {
        result += e * 2;
      }
    }
    System.out.println(result);
    //smells 
    //1. mutating result variable over and over again
    //2. what to do and how to do it
    System.out.println(
        numbers.stream()
        .filter(e -> e % 2 == 0)
        .mapToInt(e -> e * 2)
        .sum()
        );
  }

}
