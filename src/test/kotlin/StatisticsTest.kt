import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatisticsTest {

    private val input = listOf(6, 9, 15, -2, 92, 11)

    @Test
    fun `test statistics method for minimum number` () {
        val expected = -2
        val actual = stat("min",input)

        assertEquals(expected.toDouble(), actual)
    }

    @Test
    fun `test statistics method for maximum number` () {
        val expected = 92
        val actual = stat("max",input)

        assertEquals(expected.toDouble(), actual)
    }

    @Test
    fun `test statistics method to get total number of elements` () {
        val expected = 6
        val actual = stat("count", input)

        assertEquals(expected.toDouble(), actual)
    }

    @Test
    fun `test statistics method to get average value` () {
        val expected = 21.833333
        val actual = stat("average", input)

        assertEquals(expected.toDouble(), actual)
    }
}
