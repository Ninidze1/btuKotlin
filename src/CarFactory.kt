fun main() {

    val rav4 = CarFactory()
    rav4.name = "Toyota Rav 4"
    rav4.color = "Yellow"
    rav4.withTurbo = false
    rav4.year = 2017
    rav4.maxSpeed = 180

    rav4.printCarInfo()
    rav4.coloring("Yellow")
    rav4.coloring("Red")
    rav4.printCarInfo()

    var tucson: CarFactory? = CarFactory()
    tucson?.name = "Hyndai Tucson"
    tucson?.year = 2012
    tucson?.color = "Blue"
    tucson?.maxSpeed = 200
    tucson?.withTurbo = true

    tucson = null

    tucson?.printCarInfo()
    tucson?.coloring("Gradient")
    tucson?.printCarInfo()

    tucson?.printCarInfo()

    var rav4_1 = rav4
    rav4_1.coloring("Black")
    rav4.printCarInfo()

}

class CarFactory {

    var name: String = ""
    var maxSpeed: Int = 0
    var year: Int = 0
    var withTurbo: Boolean = false
    var color: String = ""

    fun printCarInfo() {
        println("$name - $year - $color")
    }

    fun coloring(color: String) {
        if (color == this.color) {
            println("Same Color")
        } else {
            println("Coloring...")
            this.color = color
        }
    }

}