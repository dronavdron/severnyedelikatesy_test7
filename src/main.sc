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
        a: {{carousel([{"title":"Северная семга","description":"Цена 1990 ₽/кг","imageUrl":"https://i.ibb.co/g9CHdP0/salmon-demo.jpg","buttons":[{"text":"Заказать","transition":"OrderStart","data":{"product":"Северная семга","price":"1990 ₽/кг"}}]}])}}

    state: OrderStart
        a: Вы выбрали {{$data.product}} за {{$data.price}}. Как вас зовут?
        go!: OrderName(product="{{$data.product}}",price="{{$data.price}}")

    state: OrderName
        q!: $regex(/.+/)
        a: Спасибо! Теперь введите номер телефона.
        go!: OrderPhone(product="{{$data.product}}",price="{{$data.price}}",name="{{$request.query}}")

    state: OrderPhone
        q: $regex(/\+?\d{10,15}/)
        a: Спасибо! Заказ оформлен.
        go!: SendOrder(product="{{$data.product}}",price="{{$data.price}}",name="{{$data.name}}",phone="{{$request.query}}")

    state: OrderPhoneError
        q!: $regex(/.*/)
        a: Введите номер телефона в формате +79991234567
        go!: OrderPhone(product="{{$data.product}}",price="{{$data.price}}",name="{{$data.name}}")

    state: SendOrder
        a: Заказ: {{$data.product}} за {{$data.price}}. Клиент {{$data.name}}, телефон {{$data.phone}}
        go!: Start





