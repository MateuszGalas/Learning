import java.awt.Color
import java.awt.image.BufferedImage

fun drawPolygon(): BufferedImage {
    val width = 300
    val height = 300

    val x = intArrayOf(50, 100, 200, 250, 200, 100)
    val y = intArrayOf(150, 250, 250, 150, 50, 50)
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    graphics.color = Color.YELLOW
    graphics.drawPolygon(x, y, 6)
    return image
}