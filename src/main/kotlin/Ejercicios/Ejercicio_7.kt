package Ejercicios

fun main() {
    // Entradas
    print("Ingrese la coordenada x del punto 1: ")
    val x1 = readln()!!.toDouble()
    print("Ingrese la coordenada y del punto 1: ")
    val y1 = readln()!!.toDouble()
    print("Ingrese la coordenada x del punto 2: ")
    val x2 = readln()!!.toDouble()
    print("Ingrese la coordenada y del punto 2: ")
    val y2 = readln()!!.toDouble()
    // Salidas
    println("La distancia entre los dos puntos es: ${distancia_puntos(x1, y1, x2, y2)}")
    println("La pendiente de la recta que une los dos puntos es: ${pendiente_puntos(x1, y1, x2, y2)}")
    println("Las coordenadas del punto medio es: ${punto_medio(x1, y1, x2, y2)}")
}

fun distancia_puntos(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return Math.sqrt(Math.pow(y2 - y1, 2.0) + Math.pow(x2 - x1, 2.0))
}

fun pendiente_puntos(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return (y2 - y1) / (x2 - x1)
}

fun punto_medio(x1: Double, y1: Double, x2: Double, y2: Double): Pair<Double, Double> {
    return Pair((x1 + x2) / 2, (y1 + y2) / 2)
}