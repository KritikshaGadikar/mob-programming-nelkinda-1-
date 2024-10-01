import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatisticsTest {

    @Test
    fun `test statistics method for minimum number` () {
        val input = listOf(6, 9, 15, -2, 92, 11)
        val expected = -2
        val actual = stat("min",input)

        assertEquals(expected.toDouble(), actual)
    }

    @Test
    fun `test statistics method for maximum number` () {
        val input = listOf(6, 9, 15, -2, 92, 11)
        val expected = 92
        val actual = stat("max",input)

        assertEquals(expected.toDouble(), actual)
    }
}
