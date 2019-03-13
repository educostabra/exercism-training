
import org.junit.Assert.assertTrue
import org.junit.Test


class RectangleTest{

    @Test
    fun example(){
        val rec = Rectangle(10,10)
        assertTrue(rec.isSquare)
    }
}