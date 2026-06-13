package com.harshit.Backtracking;
import java.math.BigInteger;
import java.util.Scanner;

public class gridwayslinearTC {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger countPaths(int m, int n) {
        BigInteger numerator = factorial(m + n);
        BigInteger denominator = factorial(m).multiply(factorial(n));
        return numerator.divide(denominator);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of down moves (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of right moves (n): ");
        int n = sc.nextInt();

        System.out.println("Number of paths = " + countPaths(m, n));

        sc.close();
    }
}