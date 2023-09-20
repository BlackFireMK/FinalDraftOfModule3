package characterCreation.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/potionLesson")
public class PotionLessonServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String playerName = request.getParameter("playerName");
        String house = request.getParameter("house");

        String lessonChoice = request.getParameter("lessonChoice");

        request.setAttribute("playerName", playerName);
        request.setAttribute("house", house);
        request.setAttribute("lessonChoice", lessonChoice);

        if (lessonChoice.equals("prepare")) {
            boolean isCorrectAnswer1 = false;
            // Проверьте и установите значение isCorrectAnswer1 в зависимости от правильности ответа на вопрос 1

            boolean isCorrectAnswer2 = false;
            // Проверьте и установите значение isCorrectAnswer2 в зависимости от правильности ответа на вопрос 2

            request.setAttribute("isCorrectAnswer1", isCorrectAnswer1);
            request.setAttribute("isCorrectAnswer2", isCorrectAnswer2);

            request.getRequestDispatcher("/potionLessonResult").forward(request, response);
        } else if (lessonChoice.equals("socialize")) {
            request.getRequestDispatcher("/potionLessonSocialize").forward(request, response);
        } else {
            response.getWriter().println("Недопустимый выбор.");
        }
    }
}
