package Ejercicios

fun main() {
    // Entradas
    print("Ingrese dia de la semana: ")
    val dia = readln()!!.toString()
    // Salidas
    println("El dia de manana es : ${dia_siguiente(dia)}")
}

fun dia_siguiente(dia: String): String {
    val manana: String

    manana = when(dia.uppercase()) {
        "LUNES" -> "Martes"
        "MARTES" -> "Miercoles"
        "MIERCOLES" -> "Jueves"
        "JUEVES" -> "Viernes"
        "VIERNES" -> "Sabado"
        "SABADO" -> "Domingo"
        "DOMINGO" -> "Lunes"
        else -> "indefinido"
    }
    return manana
}