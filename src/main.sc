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
            "Нельма филе новая" -> /newNode_nelma_new
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
            Премиальное филе Нельмы слабой соли.
        image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
        buttons:
            "Заказать" -> /newNode_order_nelma
            "Назад" -> /newNode_fish
            "В меню" -> /newNode_13

    state: newNode_nelma_new
        a:  Нельма филе слабосолёная (новая позиция) \n
            Премиальное нежное филе, слабой соли.
        image: https://github.com/dronavdron/dronphoto/raw/4037ace1a333a023b81156b75243376b201837ca/5_%D0%9D%D0%B5%D0%BB%D1%8C%D0%BC%D0%B0_%D0%A4%D0%B8%D0%BB%D0%B5_2%20(1).jpg
        buttons:
            "Заказать" -> /newNode_order_nelma_new
            "Назад" -> /newNode_fish
            "В меню" -> /newNode_13

    state: newNode_order_chir
        a:  Ваш заказ: Чир филе. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma
        a:  Ваш заказ: Нельма филе. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma_new
        a:  Ваш заказ: Нельма филе (новая позиция). Мы скоро свяжемся с вами!
        go!: /newNode_13
