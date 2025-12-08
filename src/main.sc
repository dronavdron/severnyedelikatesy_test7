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
    a: Северная семга – 1990 ₽/кг. Напишите «Заказать», чтобы оформить заказ.

state: OrderStart
    intent!: /Заказать
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
    a: Введите номер телефона 11 цифр.
    go!: OrderPhone(name="{{$data.name}}")

state: SendOrder
    a: Новый заказ: {{$data.name}}, телефон {{$data.phone}}
    go!: Start
