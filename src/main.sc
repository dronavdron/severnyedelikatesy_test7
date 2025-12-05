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
    photo: https://static.tildacdn.com/stor3037-6365-4264-b830-663934363461/cda2e52890592f49c8f3d6a364ad4acd.jpg
    a: Чир филе слабосолёный 

       Деликатесное слабосолёное филе северного Чира.
    buttons:
            "Заказать" -> /newNode_order_chir
            "Назад" -> /newNode_fish
            "В меню" -> /newNode_13

    state: newNode_nelma
    photo: https://static.tildacdn.com/stor3263-3065-4134-b130-333563666162/2cd62333e9acac7108dbe82d85981084.jpg
    a: Нельма филе слабосолёная 

       Премиальное филе Нельмы слабой соли.
    buttons:
            "Заказать" -> /newNode_order_nelma
            "Назад" -> /newNode_fish
            "В меню" -> /newNode_13

    state: newNode_order_chir
        a:  Ваш заказ: Чир филе. Мы скоро свяжемся с вами!
        go!: /newNode_13

    state: newNode_order_nelma
        a:  Ваш заказ: Нельма филе. Мы скоро свяжемся с вами!
        go!: /newNode_13
