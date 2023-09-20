package characterCreation.util;

import characterCreation.entity.Character;
import characterCreation.entity.Student;

public class StudentFactory implements CharacterFactory {
    public Character createCharacter(String playerName, String house) {
        return new Student(playerName, house);
    }
}