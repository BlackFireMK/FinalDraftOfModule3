package characterCreation.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/potionLessonResult")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String playerName = request.getParameter("playerName");
        String house = request.getParameter("house");

        String lessonChoice = request.getParameter("lessonChoice");

        request.setAttribute("playerName", playerName);
        request.setAttribute("house", house);
        request.setAttribute("lessonChoice", lessonChoice);

        if (lessonChoice.equals("prepare")) {
            boolean isCorrectAnswer1 = Boolean.parseBoolean(request.getParameter("isCorrectAnswer1"));
            boolean isCorrectAnswer2 = Boolean.parseBoolean(request.getParameter("isCorrectAnswer2"));

            request.setAttribute("isCorrectAnswer1", isCorrectAnswer1);
            request.setAttribute("isCorrectAnswer2", isCorrectAnswer2);

            if (isCorrectAnswer1 && isCorrectAnswer2) {
                request.getRequestDispatcher("/preparePotion.html").forward(request, response);
            } else {
                request.getRequestDispatcher("/expelled.html").forward(request, response);
            }
        } else if (lessonChoice.equals("socialize")) {
            request.getRequestDispatcher("/potionLessonSocializeResult").forward(request, response);
        } else {
            response.getWriter().println("Недопустимый выбор.");
        }
    }
}
