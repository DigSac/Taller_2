package Ejercicios

fun main() {
    // Entradas
    print("Ingrese numero de estudiantes flacos: ")
    val flacos = readln()!!.toInt()
    print("Ingrese numero de estudiantes gordos: ")
    val gordos = readln()!!.toInt()
    print("Ingrese numero de sillas en el bus: ")
    val sillas = readln()!!.toInt()
    // Salidas
    println("Los buses necesarios son: ${buses(flacos, gordos, sillas)}")
}

fun buses(gordos: Int, flacos: Int, sillas: Int): Int {
    require(sillas > 0 && flacos >= 0 && gordos >= 0)
    return Math.ceil((flacos.toDouble() + 2 * gordos.toDouble()) / sillas.toDouble()).toInt()
}
