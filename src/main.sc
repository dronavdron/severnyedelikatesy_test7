theme: /

    state: newNode_13
        a:  Добро пожаловать в «Северные деликатесы»!\n
            Я помогу вам выбрать и заказать северную рыбу и пресервы.
        buttons:
            "Каталог" -> /CatalogMenu

    state: CatalogMenu
        a:  Выберите раздел каталога:
        buttons:
            "Рыба слабосолёная филе" -> /CatSaltFillet
            "Рыба холодного копчения филе" -> /CatSmokedFillet
            "Пресервы (190 г)" -> /CatPreserves190
            "Сугудай (190 г)" -> /CatSugudai190

    state: CatSaltFillet
        a:  Рыба слабосолёная филе (цены с наценкой +28%):\n
            1) Омуль слабосолёный филе — 4032 ₽/кг\n
            2) Сиг слабосолёный филе — 5377 ₽/кг
        buttons:
            "Омуль филе" -> /Item_OmulSaltFillet
            "Сиг филе" -> /Item_SigSaltFillet
            "В меню" -> /newNode_13

    state: Item_OmulSaltFillet
        a:  ОМУЛЬ слабосолёный филе\n
            Нежное филе северного омуля слабой соли. Вакуумная упаковка.\n
            Цена: 4032 ₽/кг
        image: https://github.com/dronavdron/dronphoto/raw/dae17b394694fb124135639d82ea3664d4e8cbaa/%D1%80%D1%8B%D0%B1%D0%B0/%D0%BE%D0%BC%D1%83%D0%BB%D1%8C%D0%A1%D0%A1.jpg
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSaltFillet
            "В меню" -> /newNode_13

    state: Item_SigSaltFillet
        a:  СИГ слабосолёный филе\n
            Нежное слабосолёное филе северного сига. Вакуумная упаковка.\n
            Цена: 5377 ₽/кг
        image: https://github.com/dronavdron/dronphoto/raw/dae17b394694fb124135639d82ea3664d4e8cbaa/%D1%80%D1%8B%D0%B1%D0%B0/%D1%81%D0%B8%D0%B3%20%D1%81%D0%BB%D0%B0%D0%B1%D0%BE%D1%81%D0%BE%D0%BB.jpg
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSaltFillet
            "В меню" -> /newNode_13

    state: CatSmokedFillet
        a:  Рыба холодного копчения филе (цены с наценкой +28%):\n
            1) Омуль ХК филе — 4368 ₽/кг\n
            2) Нельма ХК филе — 10112 ₽/кг
        buttons:
            "Омуль ХК филе" -> /Item_OmulSmokedFillet
            "Нельма ХК филе" -> /Item_NelmaSmokedFillet
            "В меню" -> /newNode_13

    state: Item_OmulSmokedFillet
        a:  ОМУЛЬ филе холодного копчения\n
            Ароматное филе омуля холодного копчения. Вакуумная упаковка.\n
            Цена: 4368 ₽/кг
        image: https://github.com/dronavdron/dronphoto/raw/dae17b394694fb124135639d82ea3664d4e8cbaa/%D1%80%D1%8B%D0%B1%D0%B0/%D0%BE%D0%BC%D1%83%D0%BB%D1%8C%20%D0%BF%D0%BE%D0%BB%D1%83%D1%82%D1%83%D1%88%D0%BA%D0%B0%20%D0%A5%D0%9A2.jpg
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSmokedFillet
            "В меню" -> /newNode_13

    state: Item_NelmaSmokedFillet
        a:  НЕЛЬМА филе холодного копчения\n
            Премиальное филе нельмы холодного копчения. Вакуумная упаковка.\n
            Цена: 10112 ₽/кг
        image: https://github.com/dronavdron/dronphoto/raw/dae17b394694fb124135639d82ea3664d4e8cbaa/%D1%80%D1%8B%D0%B1%D0%B0/%D0%BD%D0%B5%D0%BB%D1%8C%D0%BC%D0%B0%20%D0%A5%D0%9A.jpg
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSmokedFillet
            "В меню" -> /newNode_13

    state: CatPreserves190
        a:  Пресервы 190 г (филе-ломтики слабой соли в масле):\n
            1) Омуль — 1018 ₽\n
            2) Муксун — 1267 ₽
        buttons:
            "Пресервы Омуль 190 г" -> /Item_OmulPreserve190
            "Пресервы Муксун 190 г" -> /Item_MuksunPreserve190
            "В меню" -> /newNode_13

    state: Item_OmulPreserve190
        a:  ОМУЛЬ филе-ломтики слабой соли в масле 190 г\n
            Готовый к употреблению продукт, нежные ломтики омуля в масле.\n
            Цена: 1018 ₽ за банку 190 г
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatPreserves190
            "В меню" -> /newNode_13

    state: Item_MuksunPreserve190
        a:  МУКСУН филе-ломтики слабой соли в масле 190 г\n
            Премиальные ломтики муксуна в масле, готовые к подаче.\n
            Цена: 1267 ₽ за банку 190 г
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatPreserves190
            "В меню" -> /newNode_13

    state: CatSugudai190
        a:  Сугудай 190 г:\n
            1) Сугудай из омуля — 1018 ₽\n
            2) Сугудай из муксуна — 1267 ₽
        buttons:
            "Сугудай из омуля 190 г" -> /Item_OmulSugudai190
            "Сугудай из муксуна 190 г" -> /Item_MuksunSugudai190
            "В меню" -> /newNode_13

    state: Item_OmulSugudai190
        a:  СУГУДАЙ из филе ОМУЛЯ 190 г\n
            Традиционное северное блюдо из свежей рыбы.\n
            Цена: 1018 ₽ за банку 190 г
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSugudai190
            "В меню" -> /newNode_13

    state: Item_MuksunSugudai190
        a:  СУГУДАЙ из филе МУКСУНА 190 г\n
            Нежный сугудай из муксуна, готовый к подаче.\n
            Цена: 1267 ₽ за банку 190 г
        buttons:
            "Заказать" -> /OrderIntro
            "Назад" -> /CatSugudai190
            "В меню" -> /newNode_13

    state: OrderIntro
        a:  Для оформления заказа напишите одним сообщением:\n
            ваш номер телефона и какие позиции вы выбрали.\n
            Пример: +7 999 123-45-67, Омуль филе 1 кг, пресервы муксун 2 шт.\n
            Мы отправим заявку на почту и свяжемся с вами.
        go!: /OrderWaitMessage

    state: OrderWaitMessage
        q!: $any
        a:  Спасибо! Ваша заявка передана менеджеру.\n
            Мы свяжемся с вами в ближайшее время.
        # Здесь в реальном проекте можно добавить отправку письма через mail.js
        # с использованием адреса av-rabota@bk.ru

    state: NoMatch
        event!: noMatch
        a:  Я вас не поняла. Напишите «Каталог», чтобы посмотреть товары.
