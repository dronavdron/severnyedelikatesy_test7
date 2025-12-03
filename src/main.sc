theme: /

state start:
    a: Привет! Это тестовый раздел каталога слабосолёной рыбы.
    buttons:
        "Слабосолёная рыба" -> /fish

state fish:
    a: Выберите продукт:
    buttons:
        "Чир филе" -> /chir
        "Нельма филе" -> /nelma
        "Назад" -> /start

state chir:
    a: Деликатесное слабосолёное филе северного Чира.
    image: https://raw.githubusercontent.com/kamushken/imgtest/master/chir.jpg
    buttons:
        "Назад к выбору" -> /fish
        "В меню" -> /start

state nelma:
    a: Премиальное филе Нельмы слабой соли.
    image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
    buttons:
        "Назад к выбору" -> /fish
        "В меню" -> /start
