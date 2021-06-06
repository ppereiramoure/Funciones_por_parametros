import kotlin.random.Random

fun main() {
    //Ejercicio 1
    for (numero in Ejercicio1(11).array){
        print("$numero, ")
    }

    println()

    //Ejercicio 2
    val arrayNumeros = Ejercicio2(10){ Random.nextInt(50, 250)}
    arrayNumeros.array.forEach { print("$it,") }

    println()

    //Ejercicio 3
    Ejercicio3().arrayNumeros(arrayNumeros.array).forEach{ print("$it,")}

}