import characterCreation.entity.Student;
import characterCreation.entity.HogwartsCharacter;
import characterCreation.exceptions.InvalidCharacterTypeException;
import characterCreation.util.CharacterFactory;
import characterCreation.util.StudentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CharacterFactoryTest {
    private CharacterFactory characterFactory;

    @Before
    public void setup() {
        characterFactory = new StudentFactory();
    }

    @Test
    public void testCreateCharacter() throws InvalidCharacterTypeException {
        String playerName = "Harry Potter";
        HogwartsCharacter character = characterFactory.createCharacter(playerName);

        Assert.assertNotNull(character);
        Assert.assertEquals(playerName, character.getPlayerName());
        Assert.assertTrue(character instanceof Student);
    }
}