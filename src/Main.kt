fun main(args: Array<String>) {
    val veterinarian = Veterinarian()

    val animals = arrayOf(
        Cat("кошачий корм", "кухня", "мяу"),
        Dog("кость", "где-то на улице", "ГАВ"),
        Horse("сено и яблоки", "поле", "игогогогого!")
    )

    for (animal in animals) {
        veterinarian.treatAnimal(animal)
    }
}
