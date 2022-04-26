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
        System.out.println(Arrays.toString(arr));
    }
}