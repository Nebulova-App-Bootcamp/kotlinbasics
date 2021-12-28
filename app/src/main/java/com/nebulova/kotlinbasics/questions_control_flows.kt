package com.example.kotlinbasics


fun main(){
    /*
    Ejercicio:
    Escriba un bucle while que verifique la humedad (no el nivel de humedad).
    El nivel de humedad variable comienza en 80.
    La humedad variable se inicializa con "húmedo". Si está "húmedo", entonces debería reducir el "nivel de humedad" en 5 e imprimir "humedad disminuida".
    Una vez que el nivel de humedad esté por debajo de 60, debería imprimir "ahora es cómodo" y establecer la humedad en "cómodo".
     */


    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            humidity = "comfy"
            println("it's comfy now")
        }
    }

    /*
    Cuestionario Loops

    Qué imprime el siguiente ciclo:
    for(i in 1 until 10 step 2) {
    print("$i ")
    }

    respuesta: 1 3 5 7 9

    var x = 1
    while(x <= 10) {
    print("$x")
    if (x == 4){
        x = 10
    }
    x++
    }

    respuesta: 1234


    ¿Qué está mal en el siguiente ciclo?

    var z = 12
    do {
    print("$z ")
    } while(z <= 10)

    respuesta: El ciclo nunca para. Habría que inicializar una condición donde el estado no coincidiera.


    ¿Cuántas veces se ejecutará la instrucción println en el siguiente código?


    for (x in 0..9) {
    for (y in 0..9) {
       println("Result = ${x * y}")
    }
    }

    respuesta: 100


    ¿Cuál es el valor de x en el siguiente ejemplo?

    var x = 0
    for (y in 0..9) {
     x += y
    }

    println("$x")

    respuesta: 45

     */
}