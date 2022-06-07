package Ejercicios

fun main() {
    // Entradas
    print("Ingrese el primer numero entero: ")
    val num1 = readln()!!.toInt()
    print("Ingrese el segundo numero entero: ")
    val num2 = readln()!!.toInt()
    // Salidas
    println("El numero mayor es: ${numero_mayor(num1, num2)}")
}

fun numero_mayor(num1: Int, num2: Int): Int {
    if (num1 > num2) {
        return num1
    }
    else {
        return num2
    }
}
