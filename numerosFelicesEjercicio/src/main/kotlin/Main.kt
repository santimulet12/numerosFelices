package org.example

/**
 * Determina si un número es feliz
 *
 * Un número es feliz si, al reemplazarlo repetidamente por la suma de los
 * cuadrados de sus dígitos, eventualmente llega a 1. Si el proceso entra
 * en un ciclo que no incluye el 1, entonces no es un número feliz.
 *
 * @param numero El número a verificar
 * @return true si el número es feliz, false en caso contrario
 */
fun esNumeroFeliz(numero: Int): Boolean {
    // Variable para rastrear el número actual en el proceso
    var num = numero

    // Lista para guardar los números que ya hemos visto
    // Nos ayuda a detectar ciclos, ya que si volvemos a encontrar
    // un número que ya vimos, sabemos que estamos en un ciclo
    val vistos = mutableSetOf<Int>()

    // Seguimos el bucle mientras no hayamos llegado a 1 y no hayamos detectado un ciclo
    while (num != 1 && !vistos.contains(num)) {

        // Añadimos el número actual al conjunto de números vistos
        vistos.add(num)

        // Calculamos el siguiente número en la secuencia
        num = sumaDeCuadradosDeDigitos(num)
    }

    // Si terminamos con 1, es un número feliz; si no, no lo es
    return num == 1
}

/**
 * Calcula la suma de los cuadrados de los dígitos de un número.
 *
 * @param num El número
 * @return La suma de los cuadrados de cada dígito en el número
 */
fun sumaDeCuadradosDeDigitos(num: Int): Int {
    // Variable para trabajar con el número sin modificar el parámetro original
    var n = num

    // Variable para acumular la suma de los cuadrados
    var suma = 0

    // Procesamos cada dígito del número
    while (n > 0) {
        // Obtenemos el último dígito
        val digito = n % 10

        // Sumamos el cuadrado del dígito al acumulador
        suma += digito * digito

        // Eliminamos el último dígito para procesar el siguiente
        n /= 10
    }

    // Devolvemos la suma total de los cuadrados
    return suma
}

/**
 * Función principal que solicita un número al usuario y verifica si es un número feliz.
 */
fun main() {
    // Solicitamos un número al usuario
    print("Ingresa un número: ")

    // Leemos la entrada y la convertimos a entero, manejando posibles errores
    val entrada = readLine()?.toIntOrNull()

    // Verificamos si la entrada es válida
    if (entrada != null) {
        // Determinamos si el número es feliz y mostramos el resultado
        if (esNumeroFeliz(entrada)) {
            println("$entrada es un número feliz")
        } else {
            println("$entrada NO es un número feliz")
        }
    } else {
        // Informamos al usuario si la entrada no es válida
        println("Entrada inválida.")
    }
}

