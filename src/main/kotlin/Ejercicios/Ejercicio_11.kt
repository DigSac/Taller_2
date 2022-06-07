package Ejercicios

fun main() {
    // Entradas
    print("Ingrese un numero entre el 1 y el 99: ")
    val num = readln()!!.toInt()
    // Salidas
    if (num < 0 || num / 100 >= 1) {
        return println("ERROR: El numero debe estar entre 1 y 99")
    }
    else {
        println("El numero ${num} en romano es: ${numero_romano(num)}")
    }
}

fun numero_romano(num: Int): String {
    val digitos = digitos(num)
    return digito_decenas_romano(digitos.first) + digito_unidades_romano(digitos.second)
}

fun digito_unidades_romano(num: Int): String {
    val romano: String
    romano = when(num) {
        0 -> ""
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> ""
    }
    return romano
}

fun digito_decenas_romano(num: Int): String {
    val romano: String
    romano = when(num) {
        0 -> ""
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> ""
    }
    return romano
}

fun digitos(num: Int): Pair<Int, Int> {
    val decenas = num / 10
    val unidades = num % 10
    return Pair(decenas, unidades)
}