theme: /

state: start
    a: Добро пожаловать!
    buttons:
        "Чир" -> /chir

state: chir
    a: Чир филе слабосолёный
    send:
        - type: image
          imageUrl: "https://static.tildacdn.com/stor3037-6365-4264-b830-663934363461/cda2e52890592f49c8f3d6a364ad4acd.jpg"
    buttons:
        "Назад" -> /start
