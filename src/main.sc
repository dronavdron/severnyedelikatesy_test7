theme: /

    state: newNode_13
        a:  Привет! Это тестовая версия сценария внутри рабочего проекта.

            Этот проект основан на ZenFlow CAILA.
        go!: /newNode_0

    state: newNode_0
        a: Выберите категорию товара:
        buttons:
            "Ноутбуки" -> /newNode_3
            "Телефоны" -> /newNode_7

    state: newNode_3
        a: Выберите ноутбук
        go!: /newNode_1

    state: newNode_1
        a: Apple MacBook Pro 16"
        image: https://248305.selcdn.ru/zfl_prod/248684181/248684188/oPykFjj2T2m2m4o2.png
        buttons:
            "Выбрать Apple MacBook Pro 16" -> /newNode_5
            "Другой ноутбук" -> /newNode_2
            "Вернуться в меню" -> /newNode_0

    state: newNode_2
        a: Apple MacBook Air 13
        image: https://248305.selcdn.ru/zfl_prod/248684181/248684188/GVdu9VYOJcJsTJ1b.png
        buttons:
            "Выбрать Apple MacBook Air 13" -> /newNode_6
            "Другой ноутбук" -> /newNode_1
            "Вернуться в меню" -> /newNode_0

    state: newNode_5
        a:  Вы выбрали Apple MacBook Pro 16".
        buttons:
            "Вернуться в меню" -> /newNode_0

    state: newNode_6
        a:  Вы выбрали Apple MacBook Air 13.
        buttons:
            "Вернуться в меню" -> /newNode_0

    state: newNode_7
        a: Выберите телефон
        go!: /newNode_9

    state: newNode_9
        a: Apple iPhone 12 Pro
        image: https://248305.selcdn.ru/zfl_prod/248684181/248684188/lnqfnjBYbJWUoo1D.png
        buttons:
            "Выбрать Apple iPhone 12 PRO" -> /newNode_12
            "Другой телефон" -> /newNode_10
            "Вернуться в меню" -> /newNode_0

    state: newNode_10
        a: Apple iPhone 11
        image: https://248305.selcdn.ru/zfl_prod/248684181/248684188/OcELM7pjsoBeQWh6.png
        buttons:
            "Выбрать Apple iPhone 11" -> /newNode_11
            "Другой телефон" -> /newNode_9
            "Вернуться в меню" -> /newNode_0

    state: newNode_11
        a:  Вы выбрали Apple iPhone 11.
        buttons:
            "Вернуться в меню" -> /newNode_0

    state: newNode_12
        a:  Вы выбрали Apple iPhone 12 Pro.
        buttons:
            "Вернуться в меню" -> /newNode_0
