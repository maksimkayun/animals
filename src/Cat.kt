class Cat(food: String, location: String, meow: String) : Animal(food, location) {
    var meow: String? = null
        private set

    init {
        this.meow = meow
    }

    override fun makeNoise() {
        meowOrMrrr()
    }

    override fun eat() {
        println("Котейка ест ${this.food} в локации:${location}")
    }

    fun meowOrMrrr() {
        val rand = (1..10).random()
        if (rand > 5)
            println(meow)
        else
            println("mrrr")
    }
}