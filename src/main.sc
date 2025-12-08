theme: /

state: Start
    a: Добро пожаловать в «Северные деликатесы»!
       Нажмите кнопку ниже, чтобы открыть каталог.
    buttons:
        "Каталог" -> /Catalog

state: Catalog
    a: Выберите раздел:
    buttons:
        "Рыба слабосолёная филе" -> /SaltFish
        "Рыба холодного копчения" -> /SmokedFish
        "В меню" -> /Start

state: SaltFish
    a: Рыба слабосолёная филе:
       1) Омуль — 4032 ₽/кг
    buttons:
        "Омуль филе" -> /Item_OmulSalt
        "Назад" -> /Catalog

state: Item_OmulSalt
    a: Омуль слабосолёный филе — 4032 ₽/кг
       Вакуумная упаковка.
    buttons:
        "Заказать" -> /Order
        "Назад" -> /SaltFish

state: SmokedFish
    a: Рыба холодного копчения:
       1) Нельма ХК — 10112 ₽/кг
    buttons:
        "Нельма ХК" -> /Item_NelmaSmoked
        "Назад" -> /Catalog

state: Item_NelmaSmoked
    a: Нельма филе холодного копчения — 10112 ₽/кг
    buttons:
        "Заказать" -> /Order
        "Назад" -> /SmokedFish

state: Order
    a: Напишите ваш номер телефона и заказ одним сообщением.
    q!: /.*/
    a+: Спасибо! Мы получили вашу заявку. Менеджер свяжется с вами.
    go!: /Start

state: NoMatch
    event!: noMatch
    a: Не поняла вас. Нажмите «Каталог», чтобы посмотреть товары.
