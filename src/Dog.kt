class Dog(food: String, location: String, private val wof: String) : Animal(food, location) {

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