class Horse(food: String, location: String, private val whinny: String) : Animal(food, location) {

    override fun makeNoise() {
        igogo()
    }

    override fun eat() {
        println("Лоашдь ест ${food} в локации:${location}")
    }

    override fun sleep() {
        super.sleep()
        println("И делает она это стоя!")
    }
    fun igogo() {
        println(whinny)
    }
}