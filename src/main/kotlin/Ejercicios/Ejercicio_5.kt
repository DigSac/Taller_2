package Ejercicios

fun main() {
    // Entradas
    print("Ingrese radio exterior: ")
    val R = readln()!!.toDouble()
    print("Ingrese radio interior: ")
    val r = readln()!!.toDouble()
    // Salidas
    println("El area de la corona es: ${area_corona(R, r)}")
}

fun area_corona(R: Double, r: Double): Double {
    return area_circulo(R) - area_circulo(r)
}

fun area_circulo(radio: Double): Double {
    return Math.PI * Math.pow(radio, 2.0)
}