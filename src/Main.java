import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Доработайте пример с циклом while - преобразуйте его в бесконечный цикл с выходом
        //если введена строка Exit

        String str = new String();
        Scanner scanner = new Scanner(System.in);//считывает str

        while (true){
            System.out.print("Please enter something:");
            str = scanner.nextLine();
                if (str.equalsIgnoreCase("Exit")){
                    System.out.println("Bye!");
                    break;
                }
        }
    }
}
