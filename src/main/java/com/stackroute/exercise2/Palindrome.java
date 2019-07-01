package com.stackroute.exercise2;

public class Palindrome {
  public static Boolean isPalindrome(String input) {

    String temp = "";

    int length = input.length();

    for (int i = length - 1; i >= 0; i--) {
      temp = temp + input.charAt(i);
    }
    if (input.equals(temp)) {

      return true;

    } else {
      return false;
    }

  }
}
