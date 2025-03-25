import java.util.*;

public class MeasureAlgGrowth {

    public static void main(String args[]) {
        ConstantTime();
        LinearTime();
        LogTime();
        QaudraticTime();
    }

    public static void ConstantTime() {
        int[] arr = { 2, 3, 4, 8, 0 };
        int i = 2;
        long StartTime = System.nanoTime();
        int value = arr[i];
        long EndTime = System.nanoTime();
        System.out.println("O(1)Time: " + (EndTime - StartTime));
        System.out.println("O(1)Answer: " + value + '\n');

    }

    public static void LinearTime() {
        int N = 100000;
        int sum = 0;
        int[] arr = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = r.nextInt();
        }
        long StartTime = System.nanoTime();
        for (int num : arr) {
            sum += num;
        }
        long EndTime = System.nanoTime();
        System.out.println("O(N)Time: " + (EndTime - StartTime));
        System.out.println("O(N)Answer: " + sum + '\n');

    }

    public static void LogTime() {

        int[] arr = new int[100000];
        int target = 9987;

        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
            if (i == target) {
                long StartTime = System.nanoTime();
                int index = Arrays.binarySearch(arr, target);
                long EndTime = System.nanoTime();
                System.out.println("O(Log(N))Time: " + (EndTime - StartTime));
                System.out.println("O(Log(N))Answer: " + index + '\n');
            }
        }

    }

    public static void QaudraticTime() {
        int N = 100000;
        int[] arr = new int[N];

        Random r = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = r.nextInt();
        }

        int count = 0;
        long StartTime = System.nanoTime();

        // dummy operation
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    count++;
                }
            }
        }

        long EndTime = System.nanoTime();
        System.out.println("O(N^2)Time: " + (EndTime - StartTime));
        System.out.println("O(N^2)Answer: " + count);

    }
}