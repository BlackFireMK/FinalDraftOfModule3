package characterCreation.data_base;

import characterCreation.entity.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterRepository {
    private final List<Character> characters;

    public CharacterRepository() {
        characters = new ArrayList<>();
    }

    public void save(Character character) {
        characters.add(character);
    }

    public List<Character> getAll() {
        return new ArrayList<>(characters);
    }
}
