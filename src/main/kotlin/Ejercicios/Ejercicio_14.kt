package Ejercicios

fun main() {

    // Entradas
    var n: String
    var e: Int
    print("Ingrese el nombre del primer hermano: ")
    n = readln()!!.toString()
    print("Ingrese la edad del primer hermano: ")
    e= readln()!!.toInt()
    val h1 = Hermano(n, e)
    print("Ingrese el nombre del segundo hermano: ")
    n = readln()!!.toString()
    print("Ingrese la edad del segundo hermano: ")
    e = readln()!!.toInt()
    val h2 = Hermano(n, e)
    print("Ingrese el nombre del tercer hermano: ")
    n = readln()!!.toString()
    print("Ingrese la edad del tercer hermano: ")
    e = readln()!!.toInt()
    val h3 = Hermano(n, e)
    // Salidas
    println("El hermano mayor es : ${hermano_mayor(h1, h2, h3)}")
}

class Hermano(var nombre: String, var edad: Int)

fun hermano_mayor(h1: Hermano, h2: Hermano, h3: Hermano): String {
    var hme: Hermano
    hme = h1
    if (hme.edad < h2.edad) {
        hme = h2
    }
    if (hme.edad < h3.edad){
        hme = h3
    }
    return hme.nombre
}