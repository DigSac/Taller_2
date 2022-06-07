package Ejercicios

fun main() {
    // Entradas
    print("Ingrese altura de la escalera sobre la pared: ")
    val x = readln()!!.toDouble()
    print("Ingrese el angulo de inclinacion de la escalera: ")
    val alfa = readln()!!.toDouble()
    // Salidas
    println("La longitud de la escalera es: ${longitud_escalera(x, alfa)}")
}

fun longitud_escalera(x: Double, alfa: Double): Double {
    return x / Math.sin(Math.toRadians(alfa))
}