theme: /

state: start
    a: Добро пожаловать в Северные Деликатесы!
    buttons:
        "Чир филе" -> /chir

state: chir
    send:
        - type: image
          imageUrl: "https://static.tildacdn.com/stor3037-6365-4264-b830-663934363461/cda2e52890592f49c8f3d6a364ad4acd.jpg"
        - type: image
          imageUrl: "https://static.tildacdn.com/stor3263-3065-4134-b130-333563666162/2cd62333e9acac7108dbe82d85981084.jpg"
    a: |
        Чир филе слабосолёный  
        Деликатес высокого качества.
    buttons:
        "Назад" -> /start
