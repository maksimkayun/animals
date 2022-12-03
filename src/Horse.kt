class Horse(food: String, location: String, whinny: String) : Animal(food, location) {
    private var whinny: String? = null
        private set

    init {
        this.whinny = whinny
    }

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