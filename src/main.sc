theme: /

    state: newNode_13
        a: Добро пожаловать в Северные Деликатесы!
        a: Выберите категорию товара.
        buttons:
            Рыба слабосолёная филе -> /newNode_fish

    state: newNode_fish
        a: Выберите товар:
        buttons:
            Чир филе -> /newNode_chir
            Нельма филе -> /newNode_nelma
            Назад -> /newNode_13
            В меню -> /newNode_13

    state: newNode_chir
        a: Чир филе слабосолёный
        a: Деликатесное слабосолёное филе северного Чира.
        image: https://raw.githubusercontent.com/kamushken/imgtest/master/chir.jpg
        buttons:
            1 шт -> /newNode_chir_q1
            2 шт -> /newNode_chir_q2
            3 шт -> /newNode_chir_q3
            4 шт -> /newNode_chir_q4
            Назад -> /newNode_13
            В меню -> /newNode_13

    state: newNode_chir_q1
        a: Вы выбрали Чир — 1 шт.
        buttons:
            Заказать -> /newNode_order_chir_q1
            Назад -> /newNode_chir
            В меню -> /newNode_13

    state: newNode_chir_q2
        a: Вы выбрали Чир — 2 шт.
        buttons:
            Заказать -> /newNode_order_chir_q2
            Назад -> /newNode_chir
            В меню -> /newNode_13

    state: newNode_chir_q3
        a: Вы выбрали Чир — 3 шт.
        buttons:
            Заказать -> /newNode_order_chir_q3
            Назад -> /newNode_chir
            В меню -> /newNode_13

    state: newNode_chir_q4
        a: Вы выбрали Чир — 4 шт.
        buttons:
            Заказать -> /newNode_order_chir_q4
            Назад -> /newNode_chir
            В меню -> /newNode_13

    state: newNode_order_chir_q1
        a: Ваш заказ: Чир — 1 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_chir_q2
        a: Ваш заказ: Чир — 2 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_chir_q3
        a: Ваш заказ: Чир — 3 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_chir_q4
        a: Ваш заказ: Чир — 4 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_nelma
        a: Нельма филе слабосолёная
        a: Премиальное филе Нельмы слабой соли.
        a: Цена: 4032 ₽.
        a: Выберите количество:
        image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
        buttons:
            1 шт -> /newNode_nelma_q1
            2 шт -> /newNode_nelma_q2
            3 шт -> /newNode_nelma_q3
            4 шт -> /newNode_nelma_q4
            Назад -> /newNode_fish
            В меню -> /newNode_13

    state: newNode_nelma_q1
        a: Вы выбрали Нельма — 1 шт.
        buttons:
            Заказать -> /newNode_order_nelma_q1
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_nelma_q2
        a: Вы выбрали Нельма — 2 шт.
        buttons:
            Заказать -> /newNode_order_nelma_q2
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_nelma_q3
        a: Вы выбрали Нельма — 3 шт.
        buttons:
            Заказать -> /newNode_order_nelma_q3
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_nelma_q4
        a: Вы выбрали Нельма — 4 шт.
        buttons:
            Заказать -> /newNode_order_nelma_q4
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_order_nelma_q1
        a: Ваш заказ: Нельма — 1 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_q2
        a: Ваш заказ: Нельма — 2 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_q3
        a: Ваш заказ: Нельма — 3 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_q4
        a: Ваш заказ: Нельма — 4 шт. Мы скоро свяжемся с вами!
        go!: /newNode_13
