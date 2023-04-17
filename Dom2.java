package Domaha;
public class Dom2 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int sum = 0;

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > 0 && sequence[i + 1] < 0) {
                sum += sequence[i];
            }
        }

        System.out.println("Сумма положительных чисел, после которых следует отрицательное число: " + sum);
    }
}