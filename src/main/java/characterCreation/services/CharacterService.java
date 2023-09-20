package characterCreation.services;

import characterCreation.data_base.CharacterRepository;
import characterCreation.entity.Character;

import java.util.List;

public class CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void saveCharacter(Character character) {
        characterRepository.save(character);
    }

    public List<Character> getAllCharacters() {
        return characterRepository.getAll();
    }
}
