package Ejercicios

fun main() {
    // Entradas
    print("Ingrese el primer numero: ")
    val num1 = readln()!!.toDouble()
    print("Ingrese el segundo numero: ")
    val num2 = readln()!!.toDouble()
    print("Ingrese el operador aritmetico: ")
    val operador = readln()!!.toString()
    // Salidas
    val resultado_operacion = operacion_aritmetica(num1, num2, operador)
    println("El resultado de la ${resultado_operacion.second} es: ${resultado_operacion.first}")
}

fun operacion_aritmetica(num1: Double, num2: Double, operador: String): Pair<Double, String> {

    val resultado: Pair<Double, String>

    resultado = when(operador) {
        "+" -> Pair(num1 + num2, "suma")
        "-" -> Pair(num1 - num2, "resta")
        "*" -> Pair(num1 * num2, "multiplicacion")
        "/" -> Pair(num1 / num2, "division")
        "%" -> Pair(num1 % num2, "modulo")
        "**" -> Pair(Math.pow(num1, num2), "potencia")
        else -> Pair(0.0, "operacion no reconocida")
    }
    return resultado
}