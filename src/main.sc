theme: /

require: slotfilling/slotFilling.sc
  module = sys.zb-common

state: Start
    q!: $regex</start>
    a: Бот запущен. Напишите "каталог", чтобы посмотреть товар.

state: Hello
    intent!: /привет/i
    a: Привет! Напишите "каталог", чтобы открыть каталог.

state: Bye
    intent!: /пока/i
    a: Пока! Рада была помочь.

state: Catalog
    intent!: /каталог|товары|продук/i
    a: Каталог северных деликатесов:
    a: 1) Северная строганина — 990 ₽
    a: Чтобы добавить товар в заказ, напишите: Добавить строганину

state: AddItem
    intent!: /Добавить строганину/i
    a: Северная строганина добавлена в ваш заказ.
    a: Чтобы оформить заказ, напишите: Заказ

state: Order
    intent!: /Заказ/i
    a: Введите ваш телефон для оформления заказа.
    context: waiting_phone

state: SavePhone
    context!: waiting_phone
    q!: $any
    a: Спасибо! Ваш заказ принят.
    a: Мы свяжемся с вами в ближайшее время.

state: Match
    event!: match
    a: {{$context.intent.answer}}

state: NoMatch
    event!: noMatch
    a: Не поняла вас. Напишите "каталог", чтобы увидеть товары.
