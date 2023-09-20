package characterCreation;

import characterCreation.entity.HogwartsCharacter;
import characterCreation.entity.HogwartsCharacter.Student;
import characterCreation.util.CharacterFactory;
import characterCreation.util.CharacterFactoryProvider;
import java.util.Scanner;

// Класс игры
public class HogwartsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Добро пожаловать в Хогвартс! ***");

        System.out.print("Введите имя своего персонажа: ");
        String playerName = scanner.nextLine();

        System.out.print("Выберите Дом, к которому хотите принадлежать (Гриффиндор, Когтевран, Пуффендуй, Слизерин): ");
        String house = scanner.nextLine();

        // Создание персонажа с помощью фабрики
        CharacterFactoryProvider characterFactoryProvider = CharacterFactoryProvider.getInstance();
        CharacterFactory characterFactory = characterFactoryProvider.getCharacterFactory();
        Student player = (Student) characterFactory.createCharacter(playerName, house);

        if (player != null) {
            System.out.println("\n*** Приключение начинается! ***");
            System.out.println(player.getName() + ", добро пожаловать в Хогвартс, Дом " + player.getHouse() + "!");
            System.out.println("Ты попал в мир магии и загадок.");

            System.out.print("Хочешь начать свое приключение (да/нет)? ");
            String startAdventure = scanner.nextLine();

            if (startAdventure.equalsIgnoreCase("да")) {
                player.notify();

                // Здесь можно добавить логику для продолжения приключения и выбора вариантов действий

                PotionLessonGame.main(args);

            } else {
                System.out.println("Жаль! Надеюсь, что ты сможешь присоединиться к приключениям позже.");
            }

        } else {
            System.out.println("Такой тип персонажа не поддерживается.");
        }

        System.out.println("\n*** Конец игры ***");

        scanner.close();
    }
}