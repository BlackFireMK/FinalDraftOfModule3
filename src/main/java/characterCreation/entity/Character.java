package characterCreation.entity;
public abstract class Character {
    private String playerName;
    private String house;

    public Character(String playerName, String house) {
        this.playerName = playerName;
        this.house = house;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getHouse() {
        return house;
    }

    // Добавьте методы и логику для общей информации и функционала персонажа
}


