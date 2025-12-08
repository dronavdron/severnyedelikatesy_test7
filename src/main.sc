require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}

    state: Catalog
        q!: $regex(/каталог|товары|деликатесы/i)
        a:
            Вот тестовый каталог северных деликатесов:
            {{carousel([
                {
                    "title": "Северная семга охлаждённая",
                    "description": "Настоящий северный деликатес. Цена: 1990 ₽/кг",
                    "imageUrl": "https://i.ibb.co/g9CHdP0/salmon-demo.jpg",
                    "buttons": [
                        {
                            "text": "Заказать",
                            "transition": "OrderStart",
                            "data": {
                                "product": "Северная семга охлаждённая",
                                "price": "1990 ₽/кг"
                            }
                        }
                    ]
                }
            ])}}

    state: OrderStart
        a:
            Отлично! Вы выбрали: {{$data.product}} ({{$data.price}}).
            Напишите, пожалуйста, как вас зовут.
        do:
            $session.selectedProduct = $data.product;
            $session.selectedPrice = $data.price;
        go!: OrderName

    state: OrderName
        q!: $regex(/.+/)
        a: Спасибо! Теперь укажите ваш номер телефона.
        do:
            $session.clientName = $request.query;
        go!: OrderPhone

    state: OrderPhone
        q: $regex(/\+?\d{10,15}/)
        a: Спасибо! Ваш заказ оформлен.
        do:
            $session.clientPhone = $request.query;
        go!: SendOrder

    state: OrderPhone
        q!: $regex(/.*/)
        a: Пожалуйста, введите номер телефона в формате +79991234567
        go!: OrderPhone

    state: SendOrder
        a:
            Получен заказ:

            Товар: {{$session.selectedProduct}}
            Цена: {{$session.selectedPrice}}
            Имя клиента: {{$session.clientName}}
            Телефон: {{$session.clientPhone}}

            Спасибо за заказ!
        go!: Start




