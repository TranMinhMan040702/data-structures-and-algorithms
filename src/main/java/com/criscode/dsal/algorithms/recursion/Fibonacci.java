package com.criscode.dsal.algorithms.recursion;

public class Fibonacci {

    public int fibonacciIterative(int n) { // O(n)
        int result = 1;
        int prev = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            int temp = result;
            result += prev;
            prev = temp;
        }
        return result;
    }

    public int fibonacciRecursive(int n) { // O(2^n)
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacciIterative(12));
        System.out.println(fibonacci.fibonacciRecursive(43));
    }

}
