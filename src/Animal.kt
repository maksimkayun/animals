abstract class Animal constructor(food: String, location: String) {
    var food: String? = null
        protected set
    var location: String? = null
        protected set

    init {
        this.food = food
        this.location = location
    }

    abstract fun makeNoise()
    abstract fun eat()
    open fun sleep() {
        println("Животное ${this::class.simpleName} спит")
    }
}