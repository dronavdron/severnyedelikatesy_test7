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
            Заказать -> /newNode_order_chir
            Назад -> /newNode_13
            В меню -> /newNode_13

    state: newNode_nelma
        a: Нельма филе слабосолёная
        a: Премиальное филе Нельмы слабой соли.
        a: Цена: 4032 ₽/кг.
        a: Выберите количество, чтобы добавить в корзину.
        image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
        buttons:
            0,5 кг -> /newNode_nelma_q05
            1 кг -> /newNode_nelma_q1
            2 кг -> /newNode_nelma_q2
            Назад -> /newNode_13
            В меню -> /newNode_13

    state: newNode_nelma_q05
        a: Вы выбрали Нельма — 0,5 кг.
        a: Добавить в корзину?
        buttons:
            Добавить в корзину -> /newNode_cart_nelma_q05
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_nelma_q1
        a: Вы выбрали Нельма — 1 кг.
        a: Добавить в корзину?
        buttons:
            Добавить в корзину -> /newNode_cart_nelma_q1
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_nelma_q2
        a: Вы выбрали Нельма — 2 кг.
        a: Добавить в корзину?
        buttons:
            Добавить в корзину -> /newNode_cart_nelma_q2
            Назад -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_cart_nelma_q05
        a: В вашей корзине: Нельма — 0,5 кг.
        a: Нажмите «Заказать», чтобы оформить заказ.
        buttons:
            Заказать -> /newNode_order_nelma_q05
            Очистить корзину -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_cart_nelma_q1
        a: В вашей корзине: Нельма — 1 кг.
        a: Нажмите «Заказать», чтобы оформить заказ.
        buttons:
            Заказать -> /newNode_order_nelma_q1
            Очистить корзину -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_cart_nelma_q2
        a: В вашей корзине: Нельма — 2 кг.
        a: Нажмите «Заказать», чтобы оформить заказ.
        buttons:
            Заказать -> /newNode_order_nelma_q2
            Очистить корзину -> /newNode_nelma
            В меню -> /newNode_13

    state: newNode_order_chir
        a: Ваш заказ: Чир филе. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_q05
        a: Ваш заказ: Нельма — 0,5 кг. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_q1
        a: Ваш заказ: Нельма — 1 кг. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_q2
        a: Ваш заказ: Нельма — 2 кг. Мы скоро свяжемся с вами!
        go!: /newNode_13
