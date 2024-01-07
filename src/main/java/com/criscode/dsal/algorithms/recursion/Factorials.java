package com.criscode.dsal.algorithms.recursion;

public class Factorials {

    public int findFactorialRecursive(int number) {
        if (number == 2) {
            return 2;
        }
        return number * findFactorialIterative(number - 1);
    }

    public int findFactorialIterative(int number) {
        int result = 1;
        if (number == 2) {
            result = 2;
        }
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorials factorials = new Factorials();
        System.out.println("Factorials with integrative: " + factorials.findFactorialIterative(2));
        System.out.println("Factorials with recursive: " + factorials.findFactorialRecursive(10));
    }

}
