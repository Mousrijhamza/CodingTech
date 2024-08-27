package main;

import java.util.Scanner;

public class Exe3 {
    public static void calcul(int a, int b) {
        System.out.println(add(a,b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(mod(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;

    }
    public static long mod(int a, int b) {
        return a % b;
    }
}
