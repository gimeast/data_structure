package datastructure.recursive.practice;

public class Recursive {
    public static void main(String[] args) {
        int square = square(3, 5);
        System.out.println("square = " + square);

        int n = 10;
        printStars(n, 1);
    }

    public static int square(int x, int n) {
        if(n <= 1) {
            return x;
        }
        return x * square(x, --n);
    }

    public static void printStars(int n, int current) {
        if(n == 0) {
            return;
        }
        space(n-1);
        asterisk(current);
        System.out.println();
        printStars(--n, ++current);
    }

    public static void asterisk(int n) {
        if(n < 1) {
            return;
        }
        System.out.print("* ");
        asterisk(--n);
    }

    public static void space(int n) {
        if(n < 1) {
            return;
        }
        System.out.print(" ");
        space(--n);
    }
}
