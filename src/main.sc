
theme: /

    state: menu
        a: Выберите товар:
        buttons:
            "Чир филе" -> /product_chir
            "Нельма филе" -> /product_nelma

    state: product_chir
        a: Чир филе слабосолёный\nДеликатесное слабосолёное филе северного Чира.
        image: "https://i.ibb.co/5L9b9rH/chir.png"
        buttons:
            "Заказать" -> /menu
            "Назад" -> /menu

    state: product_nelma
        a: Нельма филе слабосолёное\nПремиальное филе Нельмы слабой соли.
        image: "https://i.ibb.co/7vVZD8M/nelma.png"
        buttons:
            "Заказать" -> /menu
            "Назад" -> /menu
