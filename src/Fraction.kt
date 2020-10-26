
fun main() {

    val f1 = Fraction(3f, 4f)
    val f2 = Fraction(6f,8f)
    println(f1)


}

class Fraction(n: Float, d: Float) {

   var numerator: Float = n
    var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if ((numerator * other.denominator) == (denominator * other.numerator)) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }




}


