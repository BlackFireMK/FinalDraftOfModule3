package characterCreation.util;

import characterCreation.entity.HogwartsCharacter.Student;

public class CharacterFactoryProvider {
    private static final CharacterFactoryProvider instance = new CharacterFactoryProvider();
    private final CharacterFactory characterFactory;

    private CharacterFactoryProvider() {
        characterFactory = new StudentFactory();
    }

    public static CharacterFactoryProvider getInstance() {
        return instance;
    }

    public CharacterFactory getCharacterFactory() {
        return characterFactory;
    }
}