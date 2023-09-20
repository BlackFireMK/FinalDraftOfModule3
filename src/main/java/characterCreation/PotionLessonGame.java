package characterCreation;

import java.util.Scanner;

public class PotionLessonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Добро пожаловать на урок зельеварения! ***");

        System.out.println("Выберите, что вы хотите сделать:");
        System.out.println("1. Поговорить с сокурсниками");
        System.out.println("2. Готовиться к уроку");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // Общение с сокурсниками
            System.out.println("Вы начинаете общаться с сокурсниками.");

            // Здесь можно добавить диалог или другую логику общения

            System.out.println("Профессор: Настало время начать урок зельеварения!");
        } else if (choice == 2) {
            // Готовка к уроку
            System.out.println("Вы решаете готовиться к уроку.");

            // Здесь можно добавить логику подготовки к уроку зельеварения

            System.out.println("Профессор: Настало время начать урок зельеварения!");
        } else {
            System.out.println("Недопустимый выбор. Попробуйте еще раз.");
            scanner.close();
            return;
        }

        // Здесь можно добавить дальнейшую логику и код для игры, основанной на сценарии урока зельеварения

        System.out.println("Спасибо за участие в уроке зельеварения!");
        scanner.close();
    }
}
