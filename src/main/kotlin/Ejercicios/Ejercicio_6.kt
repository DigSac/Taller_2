package Ejercicios

fun main() {
    // Entradas
    print("Ingrese la dimension de A del terreno: ")
    val A = readln()!!.toDouble()
    print("Ingrese la dimension de B del terreno: ")
    val B = readln()!!.toDouble()
    print("Ingrese la dimension de C del terreno: ")
    val C = readln()!!.toDouble()
    // Salidas
    println("El perimetro del terreno es: ${perimetro_terreno(A, B, C)}")
    println("El area del terreno es: ${area_terreno(A, B, C)}")
}

fun area_rectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun hipotenusa(cateto1: Double, cateto2: Double): Double {
    return Math.sqrt(Math.pow(cateto1, 2.0) + Math.pow(cateto2, 2.0))
}

fun area_triangulo(base: Double, altura: Double): Double {
    return base * altura / 2
}

fun perimetro_terreno(A: Double, B: Double, C: Double): Double {
    return A + B + C + hipotenusa(A - C, B)
}

fun area_terreno(A: Double, B: Double, C: Double): Double {
    return area_rectangulo(B, C) + area_triangulo(B, A - C)
}