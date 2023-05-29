import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Доработайте пример с оператором if… else (слайд 46) - если пользователь
        //вводит значение вне диапазона 0 - 100, вывести сообщение “Введено
        //некорректное значение” и попросить повторить ввод (использовать цикл)

        while(true) {
            System.out.print("Попадите в загаданный диапазон. Введите число: ");
            int score = new Scanner(System.in).nextInt();
            if (score > 100) {
                System.out.println("Введено некорректное значение. Попробуйте снова!");
            } else if (score < 0){
                System.out.println("Введено некорректное значение. Попробуйте снова!");
            }else{
                System.out.println("Получилось!");
                break;
            }

        }
    }
}
