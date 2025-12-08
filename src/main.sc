theme: /

    state: newNode_13
        a: Добро пожаловать в «Северные деликатесы»!
        buttons:
            "Каталог" -> /CatalogMenu

    state: CatalogMenu
        a: Выберите раздел каталога:
        buttons:
            "Рыба слабосолёная филе" -> /CatSaltFillet
            "Рыба холодного копчения филе" -> /CatSmokedFillet
            "Пресервы (190 г)" -> /CatPreserves190
            "Сугудай (190 г)" -> /CatSugudai190

    state: CatSaltFillet
        a: Рыба слабосолёная филе:\n1) Омуль — 4032 ₽/кг
        buttons:
            "Омуль филе" -> /Item_OmulSaltFillet
            "В меню" -> /newNode_13

    state: Item_OmulSaltFillet
        a: Омуль слабосолёный филе — 4032 ₽/кг
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSaltFillet

    state: CatSmokedFillet
        a: Рыба холодного копчения филе:\n1) Омуль ХК — 4368 ₽/кг
        buttons:
            "Омуль ХК филе" -> /Item_OmulSmokedFillet
            "В меню" -> /newNode_13

    state: Item_OmulSmokedFillet
        a: Омуль ХК — 4368 ₽/кг
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSmokedFillet

    state: CatPreserves190
        a: Пресервы 190 г:\n1) Омуль — 1018 ₽
        buttons:
            "Омуль пресервы" -> /Item_OmulPreserve190
            "В меню" -> /newNode_13

    state: Item_OmulPreserve190
        a: Омуль пресервы 190 г — 1018 ₽
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatPreserves190

    state: CatSugudai190
        a: Сугудай 190 г:\n1) Омуль — 1018 ₽
        buttons:
            "Сугудай Омуль" -> /Item_OmulSugudai190
            "В меню" -> /newNode_13

    state: Item_OmulSugudai190
        a: Сугудай Омуль — 1018 ₽
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSugudai190

    state: OrderIntro
        a: Напишите ваш телефон и заказ одним сообщением.
        go!: /OrderWaitMessage

    state: OrderWaitMessage
        q!: /.*/
        a: Спасибо! Ваша заявка передана менеджеру.

    state: NoMatch
        event!: noMatch
        a: Я вас не поняла. Напишите «Каталог».
