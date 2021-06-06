open class Ejercicio1 (var tamaño : Int) {
    companion object Singleton : Ejercicio1(11) {
        val array = Array(tamaño){it * 7}
    }
}