import kotlin.math.max

fun main() {

    val f1 = Fraction(18f, 12f)
    val f2 = Fraction(10f,6f)

    println(f1.reduction()) // შეკვეცა
    println(f1.sum(f2)) // სხვაობა
    println(f1.difference(f2)) // ჯამი
    println(f1.product(f2)) // ნამრავლი
    println(f1.quotient(f2)) // განაყოფი

}

open class Fraction(a: Float, b: Float) {

    var numerator: Float = a
    var denominator: Float = b

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

    private fun usg(): Float {
        val a = numerator
        val b = denominator
        var usg = 1
        val maxNumb = max(a, b)
        for(i in maxNumb.toInt() downTo 0) {
            if(a.toInt() % i == 0 && b.toInt() % i == 0) {
                usg = i
                break
            }
        }
        return usg.toFloat()
    }

    fun reduction(): String {
        return "მოცემული წილადის შეკვეცილია, ${numerator/usg()}/${denominator/usg()}"
    }

    private fun usgForSumAndDif(num: Int, den: Int): Float {
        val a = num
        val b = den
        var usg = 1
        val maxNumb = max(a, b)
        for(i in maxNumb downTo 0) {
            if(a % i == 0 && b % i == 0) {
                usg = i
                break
            }
        }
        return usg.toFloat()
    }

    private fun redForSumAndDif(num: Int, den: Int): String {
        return "${num/usgForSumAndDif(num,den)}/${den/usgForSumAndDif(num,den)}"
    }

    fun sum(other: Any?): String {

        var num = 0
        var den = 0
        if(other is Fraction) {
            den = (denominator * other.denominator).toInt()
            num = (numerator * other.denominator + other.numerator * denominator).toInt()
            return "ჯამი = ${redForSumAndDif(num,den)}"
        }
        return ""
    }

    fun difference(other: Any?): String {

        var num = 0
        var den = 0
        if(other is Fraction) {
            num = (numerator * other.denominator - other.numerator * denominator).toInt()
            den = (denominator * other.denominator).toInt()
            return "სხვაობა = ${redForSumAndDif(num,den)}"
        }
        return ""
    }

    fun product(other: Any?): String {

        var num = 1
        var den = 1
        if(other is Fraction) {
            den = (denominator * other.denominator).toInt()
            num = (numerator * other.numerator).toInt()
            return "ნამრავლია = ${redForSumAndDif(num,den)}"
        }
        return ""
    }

    fun quotient(other: Any?): String {

        var num = 1
        var den = 1
        if(other is Fraction) {
            den = (denominator * other.numerator).toInt()
            num = (numerator * other.denominator).toInt()
            return "განაყოფია = ${redForSumAndDif(num,den)}"
        }
        return ""

    }
// მშვიდობით განისვენე ჩემო ნერვებო :'(

}

//fun main() {
//
//    val num1 = Point(7,19)
//    val num2 = Point(-15,-5)
//
//    println(num1.toString())
//    println(num1 == num2)
//    println(num2.carryover())
//
//}
//
//open class Point(x: Int, y: Int) {
//
//    var abscissa: Int = x
//    var ordinate: Int = y
//
//    override fun toString(): String {
//        return "($abscissa;$ordinate)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Point) {
//            if ((abscissa == other.abscissa) && (ordinate == other.ordinate)) {
//                return true
//            }
//        }
//        return false
//    }
//
//    fun carryover(): String {
//        val a = -abscissa
//        return "($abscissa;$ordinate) წერტილის y ღერძის მიმართ გადატანისას მიიღება ($a;$ordinate) წერტილი"
//    }
//
//}



