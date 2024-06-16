public class Task3 {
    public static void main(String[] args) {
        // 3. Вывести самое длинное и короткое число

        int[] numbers = {32, 555, 7, 21, 800, 10984, 51, 12, 0, -5};

        int longestNumber = numbers[0];
        int shortestNumber = numbers[0];

        for (int number : numbers) {
            if (countDigits(number) > countDigits(longestNumber)) {
                longestNumber = number;
            }
            if (countDigits(number) < countDigits(shortestNumber)) {
                shortestNumber = number;
            }
        }

        System.out.println("Самое короткое число в массиве: " + shortestNumber);
        System.out.println("Самое длинное число в массиве: " + longestNumber);
    }

    // Метод для подсчета количества цифр в числе
    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        // Подсчитываем количество цифр
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
