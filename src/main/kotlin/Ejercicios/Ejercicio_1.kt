package Ejercicios

fun main() {
    // Entradas
    print("Ingrese x: ")
    val x = readln()!!.toDouble()
    print("Ingrese y: ")
    val y = readln()!!.toDouble()
    // Salidas
    println("El resultado es: ${ejercicio_uno(x,y)}")
}

fun ejercicio_uno(x: Double, y: Double): Double {
    return Math.pow(x, 2.0) + 2 * x * y + Math.pow(y, 2.0)
}