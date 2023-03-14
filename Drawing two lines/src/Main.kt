import java.awt.Color
import java.awt.image.BufferedImage  

fun drawLines(): BufferedImage {
    val height: Int = 200
    val width: Int = 200
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)

    val graphic = image.createGraphics()
    graphic.color = Color.RED
    graphic.drawLine(0, 0, 200, 200)
    graphic.color = Color.GREEN
    graphic.drawLine(200, 0, 0, 200)

    return image
}