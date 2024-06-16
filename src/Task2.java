public class Task2 {
    public static void main(String[] args) {
        // 2. Вывести чет и не чет числа

        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12, -5};

        // Вывод четных чисел
        System.out.print("Even numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println();

        // Вывод нечетных чисел
        System.out.print("Odd numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

    }
}
