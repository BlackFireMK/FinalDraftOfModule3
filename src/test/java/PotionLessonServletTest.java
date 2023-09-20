import characterCreation.HogwartsCharacter;
import characterCreation.controllers.PotionLessonServlet;
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

public class PotionLessonServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;

    private PotionLessonServlet potionLessonServlet;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        potionLessonServlet = new PotionLessonServlet();
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        when(request.getParameter("lessonChoice")).thenReturn("prepare");
        when(request.getRequestDispatcher("/potionLessonResult")).thenReturn(requestDispatcher);

        potionLessonServlet.doPost(request, response);

        // Тестирование сохранения данных о персонаже в базу данных или хранилище
        // ...

        verify(request).getRequestDispatcher("/potionLessonResult");
        verify(requestDispatcher).forward(request, response);
    }
}
