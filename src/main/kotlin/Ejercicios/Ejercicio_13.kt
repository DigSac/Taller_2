package Ejercicios

fun main() {
    // Entradas
    print("Ingrese el salario actual: ")
    val salario_actual = readln()!!.toDouble()
    // Salidas
    val (aumento, nuevo_salario) = aumento_salarial(salario_actual)
    println("El valor del aumento es ${aumento} y por tanto el salario quedara en ${nuevo_salario}")
}

fun aumento_salarial(salario: Double): Pair<Double, Double> {
    val aumento: Pair<Double, Double>
    aumento = when(salario) {
        in 0.0 .. 800000.0 -> Pair(0.1 * salario, 1.1 * salario)
        in 800000.0 .. 1200000.0 -> Pair(0.08 * salario, 1.08 * salario)
        else -> Pair(0.05 * salario, 1.05 * salario)
    }
    return aumento
}
