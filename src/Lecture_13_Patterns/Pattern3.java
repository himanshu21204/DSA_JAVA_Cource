package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
//            for (int col = n; col > row; col--) {
//                System.out.print("* ");
//            }
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
