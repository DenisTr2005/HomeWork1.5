import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int i;
        //Задание 1
        System.out.println("Задание 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] numbers = {1.57, 7.654, 9.986};
        char[] symbols = new char[26];
        for (i = 0; i < symbols.length; i++) {
            symbols[i] = (char) (i + 97);
        }
        //Задание 2
        System.out.println("\nЗадание 2");
        for (i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[i]);
        for (i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[i]);
        for (i = 0; i < symbols.length - 1; i++) {
            System.out.print(symbols[i] + ", ");
        }
        System.out.println(symbols[i]);
        //Задание 3
        System.out.println("\nЗадание 3");
        for (i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[i]);
        for (i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[i]);
        for (i = symbols.length - 1; i >0; i--) {
            System.out.print(symbols[i] + ", ");
        }
        System.out.println(symbols[i]);
        //Задание 4
        System.out.println("\nЗадание 4");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr) + "\n");
        System.out.println("Задание 5");
        int[][] matrix = new int[3][3];
        for (i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[matrix.length- i - 1][i] = matrix[i][i];
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("\nЗадание 6");
        int[] arr5 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr5));
        int[] arrNew = new int[arr5.length];
        for (i = 0; i < arr5.length; i++) {
            arrNew[arr5.length-i-1] = arr5[i];
        }
        System.out.println(Arrays.toString(arrNew));
        System.out.println("\nЗадание 7");
        System.out.println(Arrays.toString(arr5));
        for (i = 0; i < arr5.length/2; i++) {
            int buffer = arr5[i];
            arr5[i] = arr5[arr5.length - i - 1];
            arr5[arr5.length - i - 1] = buffer;

        }
        System.out.println(Arrays.toString(arr5));
        System.out.println("\nЗадание 8, 9");
        int[] arr8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int a, b;
        System.out.println("числа в массиве " + Arrays.toString(arr8) + ", сумма которых равна -2:");
        for (i = 0; i < arr8.length - 1; i++) {
            a = arr8[i];
            for (int j = i + 1; j < arr8.length; j++) {
                b = arr8[j];
                if (a + b == -2) {
                    System.out.println(a + " (" + (i+1) + "-е число в массиве), " + b + " (" + (j+1) + "-е число в массиве)");
                }
            }
        }
    }
}