fun main() {

    val r = RectangleBox(3f, 4f, 5f)
    println(r.getArea())
    println(r)
    println(r.getVolume())

}

interface IFigure {

    fun getArea(): Float
    fun getPerimeter(): Float

}

open class Rectangle(protected val width: Float, protected val height: Float) : IFigure {
    override fun getArea(): Float {
        return width * height
    }

    override fun getPerimeter(): Float {
        return 2 * (width + height)
    }

    override fun toString(): String {
        return "$width; $height"
    }

}

class RectangleBox(width: Float, height: Float, private val length: Float) : Rectangle(width, height) {

    override fun getArea(): Float {
        return super.getPerimeter() * length
    }

    override fun getPerimeter(): Float {
        return 2 * (width * height + width * length + height * length )
    }

    fun getVolume(): Float {
        return super.getArea() * length
    }

    override fun toString(): String {
        return super.toString() + "; $length"
    }

}