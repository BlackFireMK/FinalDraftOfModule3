import characterCreation.util.PotionLessonValidator;
import org.junit.Assert;
import org.junit.Test;

public class PotionLessonValidatorTest {
    @Test
    public void testValidateAnswer1Correct() {
        String answer = "Правильный ответ на вопрос 1";
        boolean result = PotionLessonValidator.validateAnswer1(answer);
        Assert.assertTrue(result);
    }

    @Test
    public void testValidateAnswer1Incorrect() {
        String answer = "Неправильный ответ на вопрос 1";
        boolean result = PotionLessonValidator.validateAnswer1(answer);
        Assert.assertFalse(result);
    }

    @Test
    public void testValidateAnswer2Correct() {
        String answer = "Правильный ответ на вопрос 2";
        boolean result = PotionLessonValidator.validateAnswer2(answer);
        Assert.assertTrue(result);
    }

    @Test
    public void testValidateAnswer2Incorrect() {
        String answer = "Неправильный ответ на вопрос 2";
        boolean result = PotionLessonValidator.validateAnswer2(answer);
        Assert.assertFalse(result);
    }
}