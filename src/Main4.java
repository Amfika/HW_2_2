import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //Реализуйте пульт дистанционного управления телевизора: пользователь
        //вводит номер канала, программа выводит название канала. Выход из
        //программы по вводу “0”. Используйте массив.

        int[] distance = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < distance.length; i++) {
            System.out.print("Выберите канал от 1 до 9. Для выхода - нажмите 0: ");
            int channel = new Scanner(System.in).nextInt();
            if (channel == distance[1]){
                System.out.println("Вы перенаправлены на первый канал! Желаете сменить канал? ");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[2]){
                System.out.println("Вы перенаправлены на второй канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[3]){
                System.out.println("Вы перенаправлены на третий канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[4]) {
                System.out.println("Вы перенаправлены на четвёртый канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[5]) {
                System.out.println("Вы перенаправлены на пятый канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[6]) {
                System.out.println("Вы перенаправлены на шестой канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[7]) {
                System.out.println("Вы перенаправлены на седьмой канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[8]) {
                System.out.println("Вы перенаправлены на восьмой канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[9]) {
                System.out.println("Вы перенаправлены на девятый канал! Желаете сменить канал?");
                System.out.println("Да - 1, Нет - 2 ");
                int choise = new Scanner(System.in).nextInt();
                    if (choise == 1){
                        System.out.println("Вы будете перенаправлены.");
                    }else {
                        System.out.println("Ок");
                    }
            }else if (channel == distance[0]) {
                System.out.println("Вы вышли из программы. Досвидания!");
                break;
            }else {
                System.out.println("Ошибка: Попробуйте ещё. ");
            }
        }
    }
}
