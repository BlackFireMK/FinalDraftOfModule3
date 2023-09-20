package characterCreation.util;

import characterCreation.entity.Character;
import characterCreation.entity.Student;

public interface CharacterFactory {
    Character createCharacter(String playerName, String house);
}

