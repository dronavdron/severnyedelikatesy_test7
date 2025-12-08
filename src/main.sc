require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

state: Start
    q!: $regex</start>
    a: Начнём.

state: Hello
    intent!: /привет/i
    a: Привет привет

state: Bye
    intent!: /пока/i
    a: Пока пока

state: Catalog
    intent!: /каталог|товары|продук/i
    a: Каталог северных деликатесов
    image: https://via.placeholder.com/500x300
    a+: Северная строганина — 990 ₽
    a+: Описание: настоящий северный деликатес
    a+: Напишите "Добавить строганину", чтобы добавить товар

state: AddItem
    q!: /Добавить строганину/i
    set: $session.order = "Северная строганина — 990 ₽"
    a: Строганина добавлена в заказ.
    a+: Напишите "Заказ", чтобы оформить его.

state: Order
    q!: /Заказ/i
    a: Введите ваш телефон для связи:

state: SavePhone
    event!: noMatch
    set: $session.phone = $request.query
    a: Спасибо! Ваш заказ отправлен.
    send: admin
        text: "Заказ: {{$session.order}}, Телефон: {{$session.phone}}"

state: NoMatch
    event!: noMatch
    a: Я не понял. Вы сказали: {{$request.query}}

state: Match
    event!: match
    a: {{$context.intent.answer}}
