package Ejercicios

fun main() {
    // Entradas
    print("Ingrese el salario: ")
    val salario = readln()!!.toDouble()
    // Salidas
    val datos = gastos(salario)
    println("Gastos en arriendo: ${datos.first}")
    println("Gastos en comida: ${datos.second}")
    println("Dinero que queda: ${datos.third}")
}

fun gastos(salario: Double): Triple<Double, Double, Double> {
    val arriendo = 0.4 * salario
    val comida = 0.15 * salario
    return Triple(arriendo, comida, salario - arriendo - comida)
}