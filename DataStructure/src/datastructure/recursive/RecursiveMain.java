package datastructure.recursive;

import static datastructure.recursive.RecursiveUtils.*;

public class RecursiveMain {
    public static void main(String[] args) {
        System.out.println("일반함수: sum(100) = " + sum(100));
        System.out.println("재귀함수: sum2(100) = " + sum2(100));
        System.out.println("================================");

        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("================================");

        int n = 10;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fibonacci: ");
        for (int i = 0; i < n; i++) {
            stringBuilder.append(fibonacci(i)).append(" ");
        }
        System.out.println(stringBuilder);
        System.out.println("================================");

        topOfHanoi(3, "A", "B", "C");
        System.out.println("================================");
    }
}
