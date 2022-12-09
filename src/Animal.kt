abstract class Animal constructor(val food: String, val location: String) {
    abstract fun makeNoise()
    abstract fun eat()
    open fun sleep() {
        println("Животное ${this::class.simpleName} спит")
    }
}