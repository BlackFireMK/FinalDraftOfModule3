package characterCreation.controllers;

import characterCreation.entity.HogwartsCharacter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/preparePotion")
public class PreparePotionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получение данных о персонаже из базы данных или хранилища
        HogwartsCharacter character = null; // Получите персонажа из базы данных или хранилища

        String potionChoice = request.getParameter("potionChoice");

        // Обновление данных о персонаже с учетом выбора метода приготовления зелья
        // character.setPotionChoice(potionChoice);

        // Сохранение обновленных данных персонажа в базу данных или хранилище

        request.setAttribute("character", character);
        request.getRequestDispatcher("/preparePotion.jsp").forward(request, response);
    }
}
