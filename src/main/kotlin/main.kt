import kotlin.random.Random

fun main() {
    //Ejercicio_1
    for (numero in Ejercicio1(11).array){
        print("$numero, ")
    }
    println()



    //Ejercicio _
    Ejercicio2(10){ Random.nextInt(50, 250)}.array.forEach { print("$it,") }
}