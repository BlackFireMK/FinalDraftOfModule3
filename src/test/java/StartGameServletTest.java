package characterCreation.controllers;

import characterCreation.HogwartsCharacter;
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

public class StartGameServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;

    private StartGameServlet startGameServlet;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        startGameServlet = new StartGameServlet();
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        CharacterFactoryProvider factoryProvider = CharacterFactoryProvider.getInstance();
        factoryProvider.setCharacterFactory(new TestCharacterFactory());

        String playerName = "Harry Potter";
        String house = "Gryffindor";

        when(request.getParameter("playerName")).thenReturn(playerName);
        when(request.getParameter("house")).thenReturn(house);
        when(request.getRequestDispatcher("/potionLesson")).thenReturn(requestDispatcher);

        startGameServlet.doPost(request, response);

        verify(request).getAttribute("character");
        verify(request).getRequestDispatcher("/potionLesson");

        // Тестирование сохранения персонажа в базу данных или хранилище
        // Можно использовать mock объект CharacterRepository для проверки методов
        // ...

        verify(request).setAttribute("character", new TestCharacter(playerName, house));
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