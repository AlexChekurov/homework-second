public class Task4 {
    public static void main(String[] args) {
        // 4. * Выводить только те числа, которые идут в порядке возрастания

        int[] array = {567, 21, 123, 149, 120, 201, 678, 4321, 8888, 0};

        for (int i = 0; i < array.length; i++) {
            String numberStr = Integer.toString(array[i]);
            char[] currentIncreasingNumberArray = numberStr.toCharArray();
            boolean isIncreasing = true;

            for (int j = 0; j < currentIncreasingNumberArray.length - 1; j++) {
                if (currentIncreasingNumberArray[j] >= currentIncreasingNumberArray[j + 1]) {
                    isIncreasing = false;
                    break;
                }
            }

            if (isIncreasing) {
                System.out.print(numberStr + " ");
            }
        }
    }
}
