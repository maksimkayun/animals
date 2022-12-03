class Dog(food: String, location: String, wof: String) : Animal(food, location) {
    var wof: String? = null
        private set

    init {
        this.wof = wof
    }

    override fun eat() {
        println("Собака сейчас ест ${this.food}, лапу даст потом. Её миска в локации:${location}")
    }

    override fun makeNoise() {
        WOF()
    }

    fun WOF() {
        println("${wof}! ${wof}! ${wof}!")
    }
}