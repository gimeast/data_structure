package datastructure.recursive;

public class RecursiveUtils {

    /**
     * 덧셈 일반함수
     * @param num
     * @return
     */
    public static int sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    /**
     * 덧셈 재귀함수
     * @param range
     * @return
     */
    public static int sum2(int range) {
        if (range == 0) {
            return range;
        }
        return range + sum2(--range);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(--num);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void topOfHanoi(int disks, String begin, String middle, String end) {
        if (disks == 1) {
            System.out.printf("1번 원반을 %s 기둥으로 옮깁니다.\n", end);
            return;
        }

        topOfHanoi(disks-1, begin, end, middle);
        System.out.printf("%s번 원반을 %s 기둥으로 옮깁니다.\n", disks, end);
        topOfHanoi(disks-1, middle, begin, end);
    }
}
