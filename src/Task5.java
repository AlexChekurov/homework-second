public class Task5 {
    public static void main(String[] args) {
        // 5. Вывести все числа палиндромы в массиве

        int[] array = {567, 21, 123, 149, 120, 201, 678, 4321, 8888, 0};

        System.out.println("Числа-палиндромы в массиве:");
        for (int element : array) {
            if (isPalindrome(element)) {
                System.out.print(element + " ");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
