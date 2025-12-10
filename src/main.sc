theme: /

    state: newNode_13
        a:  Добро пожаловать в Северные Деликатесы! \n
            Выберите категорию товара.
        buttons:
            "Рыба слабосолёная филе" -> /newNode_fish

    state: newNode_fish
        a:  Выберите товар:
        buttons:
            "Чир филе" -> /newNode_chir
            "Нельма филе" -> /newNode_nelma
            "Вернуться в меню" -> /newNode_13

    state: newNode_chir
        a:  Чир филе слабосолёный \n
            Деликатесное слабосолёное филе северного Чира.
        image: https://raw.githubusercontent.com/kamushken/imgtest/master/chir.jpg
        buttons:
            "Заказать" -> /newNode_order_chir
            "Назад" -> /newNode_fish
            "В меню" -> /newNode_13

    state: newNode_nelma
        a:  Нельма филе слабосолёная \n
            Премиальное филе Нельмы слабой соли. \n
            Нежная текстура, плотное мясо — подходит для салатов и нарезки.
        image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
        buttons:
            "1 шт" -> /newNode_nelma_q1
            "2 шт" -> /newNode_nelma_q2
            "3 шт" -> /newNode_nelma_q3
            "4 шт" -> /newNode_nelma_q4
            "Назад" -> /newNode_fish
            "В меню" -> /newNode_13
        reactions:
            telegram:
                reply_keyboard:
                    resize_keyboard: true
                    keyboard:
                        - ["1 шт", "2 шт"]
                        - ["3 шт", "4 шт"]
                        - ["Назад", "В меню"]

    state: newNode_nelma_q1
        a:  Нельма — 1 шт добавлена в заказ.
        buttons:
            "Заказать" -> /newNode_order_nelma_1
            "Назад" -> /newNode_nelma
            "В меню" -> /newNode_13

    state: newNode_nelma_q2
        a:  Нельма — 2 шт добавлены в заказ.
        buttons:
            "Заказать" -> /newNode_order_nelma_2
            "Назад" -> /newNode_nelma
            "В меню" -> /newNode_13

    state: newNode_nelma_q3
        a:  Нельма — 3 шт добавлены в заказ.
        buttons:
            "Заказать" -> /newNode_order_nelma_3
            "Назад" -> /newNode_nelma
            "В меню" -> /newNode_13

    state: newNode_nelma_q4
        a:  Нельма — 4 шт добавлены в заказ.
        buttons:
            "Заказать" -> /newNode_order_nelma_4
            "Назад" -> /newNode_nelma
            "В меню" -> /newNode_13

    state: newNode_order_chir
        a:  Ваш заказ: Чир филе. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_1
        a:  Ваш заказ: Нельма — 1 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_2
        a:  Ваш заказ: Нельма — 2 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_3
        a:  Ваш заказ: Нельма — 3 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_4
        a:  Ваш заказ: Нельма — 4 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13
