start:
  transitions:
    - state: hello

states:

  hello:
    action:
      say: "Бот запущен. Напишите 'каталог', чтобы посмотреть товар."
    transitions:
      - intent: hello
        state: greeting
      - intent: catalog
        state: catalog

  greeting:
    action:
      say: "Привет! Напишите 'каталог', чтобы открыть каталог."
    transitions:
      - state: hello

  bye:
    action:
      say: "Пока! Рада была помочь."

  catalog:
    action:
      say: "Каталог северных деликатесов:\n1) Северная строганина — 990 ₽\nНапишите 'Добавить строганину'."
    transitions:
      - intent: add_str
        state: addItem

  addItem:
    action:
      say: "Строганина добавлена. Напишите 'заказ' чтобы оформить заказ."
    transitions:
      - intent: order
        state: order

  order:
    action:
      say: "Введите ваш телефон."
    transitions:
      - intent: phone
        state: savePhone

  savePhone:
    action:
      say: "Спасибо! Ваш заказ принят."
    transitions:
      - state: hello

noMatch:
  action:
    say: "Не поняла вас. Напишите 'каталог', чтобы увидеть товары."
