# Detector de Números Felices

## Descripción

Este programa en Kotlin permite determinar si un número es "feliz" según la definición matemática. Un número feliz es aquel que, al reemplazarlo repetidamente por la suma de los cuadrados de sus dígitos, eventualmente llega al número 1. Si este proceso entra en un ciclo que no incluye al 1, entonces el número no es feliz.

## Concepto de Número Feliz

Un número es feliz cuando, siguiendo un proceso específico, eventualmente se reduce al valor 1:

1. Tomar cada dígito del número por separado
2. Elevar cada dígito al cuadrado
3. Sumar todos estos cuadrados
4. Repetir el proceso con el resultado obtenido

Si esta secuencia termina en 1, el número original es feliz. Si entra en un ciclo sin llegar a 1, no es feliz.

### Ejemplo

El número 19 es feliz porque:
- 1² + 9² = 1 + 81 = 82
- 8² + 2² = 64 + 4 = 68
- 6² + 8² = 36 + 64 = 100
- 1² + 0² + 0² = 1 + 0 + 0 = 1

Llegamos a 1, por lo tanto 19 es un número feliz.

## Estructura del Código

El programa consta de tres funciones principales:

1. `esNumeroFeliz(numero: Int)`: Determina si un número es feliz mediante la implementación del algoritmo descrito anteriormente. Utiliza un conjunto para detectar ciclos.

2. `sumaDeCuadradosDeDigitos(num: Int)`: Calcula la suma de los cuadrados de cada dígito de un número.

3. `main()`: Función principal que maneja la interacción con el usuario, solicitando un número y mostrando si es feliz o no.

## Características

- Detección eficiente de ciclos usando un conjunto de números vistos
- Manejo de entrada de usuario con validación
- Implementación clara del algoritmo de números felices
- Comentarios detallados explicando la lógica y cada parte del código

## Uso

1. Ejecute el programa
2. Ingrese un número entero positivo cuando se le solicite
3. El programa informará si el número ingresado es feliz o no

```
Ingresa un número: 19
19 es un número feliz

Ingresa un número: 4
4 NO es un número feliz
```

## Notas Técnicas

- El programa utiliza un conjunto (`mutableSetOf`) para detectar ciclos, lo que garantiza que el algoritmo termine incluso con números que no son felices.
- La detección de ciclos es crucial, ya que algunos números no felices pueden entrar en ciclos infinitos si no se manejan adecuadamente.
- El programa incluye una línea de depuración (`println(!vistos.contains(num))`) que podría eliminarse en una versión de producción.

## Requisitos

- JDK 8 o superior
- Kotlin Runtime
