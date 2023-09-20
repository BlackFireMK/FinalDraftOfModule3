import characterCreation.HogwartsCharacter;
import characterCreation.controllers.PreparePotionServlet;
import characterCreation.util.CharacterFactory;
import characterCreation.util.CharacterFactoryProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PreparePotionServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;

    private PreparePotionServlet preparePotionServlet;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        preparePotionServlet = new PreparePotionServlet();
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        CharacterFactoryProvider factoryProvider = CharacterFactoryProvider.getInstance();
        factoryProvider.setCharacterFactory(new TestCharacterFactory());

        HogwartsCharacter character = new TestCharacter("Harry Potter", "Gryffindor");
        when(request.getAttribute("character")).thenReturn(character);
        when(request.getParameter("potionChoice")).thenReturn("book");
        when(request.getRequestDispatcher("/preparePotion.jsp")).thenReturn(requestDispatcher);

        preparePotionServlet.doPost(request, response);

        // Тестирование обновления данных о персонаже
        // ...

        verify(request).setAttribute("character", character);
        verify(requestDispatcher).forward(request, response);
    }

    private class TestCharacterFactory implements CharacterFactory {
        public HogwartsCharacter createCharacter(String playerName) {
            String house = "Test House";
            return new TestCharacter(playerName, house);
        }
    }

    private class TestCharacter extends HogwartsCharacter {
        public TestCharacter(String playerName, String house) {
            super(playerName, house);
        }
    }
}
