<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Хогвартс - игра</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Добро пожаловать в Хогвартс!</h1>
<form action="play" method="post">
    <label for="playerName">Введите имя своего персонажа:</label>
    <input type="text" id="playerName" name="playerName" required><br><br>
    <label for="house">Выберите Дом, к которому хотите принадлежать (Гриффиндор, Когтевран, Пуффендуй, Слизерин):</label>
    <input type="text" id="house" name="house" required><br><br>
    <input type="submit" value="Играть">
</form>

<%
    String playerName = request.getParameter("playerName");
    String house = request.getParameter("house");
    request.setAttribute("playerName", playerName);
    request.setAttribute("house", house);
%>

<a href="potionLesson">Начать урок зельеварения</a>

</body>
</html>