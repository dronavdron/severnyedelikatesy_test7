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
        q!: $regex(/каталог/)
        a: {{carousel([{"title":"Северная семга","description":"1990 ₽/кг","imageUrl":"https://i.ibb.co/g9CHdP0/salmon-demo.jpg","buttons":[{"text":"Заказать","transition":"OrderStart"}]}])}}

    state: OrderStart
        a: Как вас зовут?
        go!: OrderName

    state: OrderName
        q!: $regex(/.+/)
        a: Спасибо! Теперь введите номер телефона.
        go!: OrderPhone(name="{{$request.query}}")

    state: OrderPhone
        q: $regex(/\d{11}/)
        a: Спасибо! Ваш заказ оформлен.
        go!: SendOrder(name="{{$data.name}}",phone="{{$request.query}}")

    state: OrderPhoneError
        q!: $regex(/.*/)
        a: Введите номер телефона в формате 79991234567
        go!: OrderPhone(name="{{$data.name}}")

    state: SendOrder
        a: Новый заказ: {{$data.name}}, телефон {{$data.phone}}
        go!: Start





