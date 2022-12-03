class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Ветеринар исследует животное:")
        animal.eat()
        animal.makeNoise()
        animal.sleep()

        println()
    }
}