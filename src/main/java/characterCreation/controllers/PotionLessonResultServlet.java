package characterCreation.controllers;

import characterCreation.entity.HogwartsCharacter;
import characterCreation.util.PotionLessonValidator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/potionLessonResult")
public class PotionLessonResultServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получение данных о персонаже из базы данных или хранилища
        HogwartsCharacter character = null; // Получите персонажа из базы данных или хранилища

        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");

        boolean isCorrectAnswer1 = PotionLessonValidator.validateAnswer1(answer1);
        boolean isCorrectAnswer2 = PotionLessonValidator.validateAnswer2(answer2);

        // Обновление данных о персонаже с учетом результатов урока
        // character.setIsCorrectAnswer1(isCorrectAnswer1);
        // character.setIsCorrectAnswer2(isCorrectAnswer2);
        // Сохранение обновленных данных персонажа в базу данных или хранилище

        request.setAttribute("character", character);
        request.getRequestDispatcher("/potionLessonResult.jsp").forward(request, response);
    }
}