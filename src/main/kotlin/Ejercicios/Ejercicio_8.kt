package Ejercicios

fun main() {
    // Entradas
    print("Ingrese el numero de estudiantes: ")
    val estudiantes = readln()!!.toInt()
    print("Ingrese el numero de salones por piso: ")
    val salones_piso = readln()!!.toInt()
    print("Ingrese la capacidad de cada salon: ")
    val capacidad_salon = readln()!!.toInt()
    // Salidas
    val (salones, pisos) = nuevo_edificio(estudiantes, salones_piso, capacidad_salon)
    println("El nuevo edificio tendra ${pisos} pisos y contara con ${salones} salones")
}

fun nuevo_edificio(estudiantes: Int, salones_piso: Int, capacidad_salon: Int): Pair<Int, Int> {
    val estudiantes_piso = capacidad_salon * salones_piso
    val pisos = Math.ceil(estudiantes.toDouble() / estudiantes_piso.toDouble()).toInt()
    val salones = pisos * salones_piso
    return Pair(salones, pisos)
}
