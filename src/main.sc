theme: /

    state: newNode_start
        a:  Добро пожаловать в Северные Деликатесы!\n
            Выберите категорию товара.
        buttons:
            "Рыба слабосолёная — филе" -> /newNode_cat1
            "Рыба слабосолёная — тушка" -> /newNode_cat2
            "Рыба ХК — филе" -> /newNode_cat3
            "Рыба ХК — тушка" -> /newNode_cat4
            "Филе-нарезка слабой соли" -> /newNode_cat5
            "Филе-нарезка ХК" -> /newNode_cat6
            "Пресервы 190 г" -> /newNode_cat7
            "Сугудай 190 г" -> /newNode_cat8
            "Пресервы 500 г" -> /newNode_cat9
            "Юкола" -> /newNode_cat10
            "Свежемороженная рыба" -> /newNode_cat11
            "Стейки" -> /newNode_cat12
            "Суповой набор" -> /newNode_cat13

    state: newNode_cat1
        a:  Рыба слабосолёная — филе:\n
            Пример товара: Омуль филе.
        buttons:
            "Омуль филе" -> /newNode_item1
            "Назад" -> /newNode_start

    state: newNode_item1
        a:  Омуль филе слабосолёный — 4032 ₽/кг\n            Вакуумная упаковка.
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat1

    state: newNode_cat2
        a:  Рыба слабосолёная — тушка:\n
            Пример товара: Омуль тушка.
        buttons:
            "Омуль тушка" -> /newNode_item2
            "Назад" -> /newNode_start

    state: newNode_item2
        a:  Омуль тушка слабосолёная — 3500 ₽/кг
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat2

    state: newNode_cat3
        a:  Рыба холодного копчения — филе:\n
            Пример товара: Нельма ХК филе.
        buttons:
            "Нельма филе ХК" -> /newNode_item3
            "Назад" -> /newNode_start

    state: newNode_item3
        a:  Нельма филе ХК — 10112 ₽/кг
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat3

    state: newNode_cat4
        a:  Рыба холодного копчения — тушка:\n
            Пример товара: Сиг ХК тушка.
        buttons:
            "Сиг тушка ХК" -> /newNode_item4
            "Назад" -> /newNode_start

    state: newNode_item4
        a:  Сиг тушка ХК — 4800 ₽/кг
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat4

    state: newNode_cat5
        a:  Филе-нарезка слабой соли:\n
            Пример товара: Омуль нарезка.
        buttons:
            "Омуль нарезка" -> /newNode_item5
            "Назад" -> /newNode_start

    state: newNode_item5
        a:  Омуль филе-нарезка слабой соли — 450 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat5

    state: newNode_cat6
        a:  Филе-нарезка ХК:\n
            Пример товара: Сиг нарезка ХК.
        buttons:
            "Сиг нарезка ХК" -> /newNode_item6
            "Назад" -> /newNode_start

    state: newNode_item6
        a:  Сиг филе-нарезка ХК — 520 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat6

    state: newNode_cat7
        a:  Пресервы 190 г:\n
            Пример товара: Омуль пресервы 190 г.
        buttons:
            "Омуль пресервы" -> /newNode_item7
            "Назад" -> /newNode_start

    state: newNode_item7
        a:  Омуль пресервы 190 г — 1018 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat7

    state: newNode_cat8
        a:  Сугудай 190 г:\n
            Пример товара: Сугудай муксун.
        buttons:
            "Сугудай муксун" -> /newNode_item8
            "Назад" -> /newNode_start

    state: newNode_item8
        a:  Сугудай муксун 190 г — 1267 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat8

    state: newNode_cat9
        a:  Пресервы 500 г:\n
            Пример товара: Муксун 500 г.
        buttons:
            "Муксун 500 г" -> /newNode_item9
            "Назад" -> /newNode_start

    state: newNode_item9
        a:  Муксун слабой соли в масле 500 г — 2100 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat9

    state: newNode_cat10
        a:  Юкола:\n
            Пример товара: Юкола нерка.
        buttons:
            "Юкола нерка" -> /newNode_item10
            "Назад" -> /newNode_start

    state: newNode_item10
        a:  Юкола нерка — 750 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat10

    state: newNode_cat11
        a:  Свежемороженная рыба:\n
            Пример товара: Нерка свежемороженная.
        buttons:
            "Нерка" -> /newNode_item11
            "Назад" -> /newNode_start

    state: newNode_item11
        a:  Нерка свежемороженная — цена по запросу
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat11

    state: newNode_cat12
        a:  Стейки:\n
            Пример товара: Стейк нельмы.
        buttons:
            "Стейк нельмы" -> /newNode_item12
            "Назад" -> /newNode_start

    state: newNode_item12
        a:  Стейк нельмы — 5200 ₽/кг
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat12

    state: newNode_cat13
        a:  Суповой набор:\n
            Пример товара: Набор нельмы.
        buttons:
            "Суповой набор Нельма" -> /newNode_item13
            "Назад" -> /newNode_start

    state: newNode_item13
        a:  Суповой набор Нельма — 350 ₽
        buttons:
            "Заказать" -> /newNode_order
            "Назад" -> /newNode_cat13

    state: newNode_order
        a:  Напишите ваш номер телефона и заказ одним сообщением.\n
            После отправки мы получим вашу заявку и свяжемся с вами.
        buttons:
            "В меню" -> /newNode_start
