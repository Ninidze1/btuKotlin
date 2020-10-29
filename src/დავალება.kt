fun main() {

    val num1 = Point(7,19)
    val num2 = Point(-15,-5)

    println(num1.toString())
    println(num1 == num2)
    println(num2.carryover())

}

open class Point(x: Int, y: Int) {

    var abscissa: Int = x
    var ordinate: Int = y

    override fun toString(): String {
        return "($abscissa;$ordinate)"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if ((abscissa == other.abscissa) && (ordinate == other.ordinate)) {
                return true
            }
        }
        return false
    }

    fun carryover(): String {
        val a = -abscissa
        return "($abscissa;$ordinate) წერტილის y ღერძის მიმართ გადატანისას მიიღება ($a;$ordinate) წერტილი"
    }

}