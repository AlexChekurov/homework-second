public class Task1 {
    public static void main(String[] args) {
        // 1. Вывести макс и мин

        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12, -5};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }
}
