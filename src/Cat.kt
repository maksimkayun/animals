class Cat(food: String, location: String, private val meow: String) : Animal(food, location) {

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