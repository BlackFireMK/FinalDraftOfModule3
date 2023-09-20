<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Potion Lesson - Socialize</title>
</head>
<body>
<h1>Potion Lesson - Socialize</h1>

<form action="potionLessonResult" method="post">
  <input type="hidden" name="playerName" value="${playerName}">
  <input type="hidden" name="house" value="${house}">
  <input type="hidden" name="lessonChoice" value="socialize">

  <!-- Добавьте вопросы и поля для ввода ответов соответствующие ветке "socialize" -->

  <input type="submit" value="Submit">
</form>
</body>
</html>