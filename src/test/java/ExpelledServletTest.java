import characterCreation.controllers.ExpelledServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.Before;
import characterCreation.controllers.ExpelledServlet;
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

public class ExpelledServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;

    private ExpelledServlet expelledServlet;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        expelledServlet = new ExpelledServlet();
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        when(request.getRequestDispatcher("/expelled.html")).thenReturn(requestDispatcher);

        expelledServlet.doGet(request, response);

        verify(request).getRequestDispatcher("/expelled.html");
        verify(requestDispatcher).forward(request, response);
    }
}
