package characterCreation.entity;

public abstract class HogwartsCharacter {
    protected String name;
    protected String house;

    public HogwartsCharacter(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public abstract void performAction();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    // Конкретный класс для создания студентов
    public static class Student extends HogwartsCharacter {
        public Student(String name, String house) {
            super(name, house);
        }

        // Реализация абстрактного метода
        public void performAction() {
            System.out.println(name + ", ученик дома " + house + ", отправляется на свое первое задание.");
            // Здесь можно добавить логику для заданий студентов
            System.out.println("Ты выбираешь урок зельеварения.");
            System.out.println("Готовишься к уроку.");

            // Тут можно добавить логику для подготовки к уроку зельеварения
        }
    }

}