package Arsenals.HackerRank;

import java.io.*;
import java.util.*;

public class JavaLoops2 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += b * Math.pow(2, j);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}