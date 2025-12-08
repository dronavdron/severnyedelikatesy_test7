require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Catalog
        q!: $regex(/каталог/)
        a: {{carousel([{"title":"Семга","description":"1990 ₽","imageUrl":"https://i.ibb.co/g9CHdP0/salmon-demo.jpg","buttons":[{"text":"Заказать","transition":"OrderStart"}]}])}}

    state: OrderStart
        a: Как вас зовут?
        go!: OrderName

    state: OrderName
        q!: $regex(/.+/)
        a: Спасибо! Теперь телефон.
        go!: OrderPhone(name="{{$request.query}}")

    state: OrderPhone
        q: $regex(/\d{11}/)
        a: Заказ оформлен.
        go!: SendOrder(name="{{$data.name}}",phone="{{$request.query}}")

    state: SendOrder
        a: Клиент {{$data.name}}, телефон {{$data.phone}}
        go!: Start





