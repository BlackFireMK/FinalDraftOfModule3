package characterCreation.controllers;

import characterCreation.entity.HogwartsCharacter.Student;
import characterCreation.util.CharacterFactory;
import characterCreation.util.CharacterFactoryProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/startGame")
public class StartGameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String playerName = request.getParameter("playerName");
        String house = request.getParameter("house");

        CharacterFactory characterFactory = CharacterFactoryProvider.getInstance().getCharacterFactory();
        Student player = (Student) characterFactory.createCharacter(playerName, house);

        if (player != null) {
            request.setAttribute("playerName", playerName);
            request.setAttribute("house", house);
            request.getRequestDispatcher("/potionLesson.html").forward(request, response);
        } else {
            response.getWriter().println("Такой тип персонажа не поддерживается.");
        }
    }
}
