package com.multividas;

public class Algo {
   public void log(int[] numbers) {
      // O(n^2)
      for (int i = 0; i < numbers.length; i++)
         for (int number : numbers)
            System.out.println(numbers[i] + ", " + number);
   }
}
