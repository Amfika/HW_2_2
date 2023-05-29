import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Доработать пример с циклом for с вводом отрицательного числа

        Scanner scanner = new Scanner(System.in);
        int val = 0; //счётчик для положительных чисел
        int noVal = 0;//счётчик для отрицательных чисел
        for (int i = 0; i < 5; i++) { //цикл с условием счёта до 5 вводов
            System.out.print("Введите число: ");
            int x = scanner.nextInt();
            if (x >= 0) {
                val++;
            } else if (x < 0) {
                noVal++;
            }
        }
        System.out.println("Введено положительных чисел: " + val);
        System.out.println("Введено отрицательных чисел: " + noVal);
    }
}
