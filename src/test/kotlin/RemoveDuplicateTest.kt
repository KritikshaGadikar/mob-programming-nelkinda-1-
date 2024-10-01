import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicateTest {

    @Test
    fun `test for empty list should return empty list` () {
        val list = emptyList<Int>()
        val actual = removeDuplicates(list)
        val expected = emptyList<Int>()
        assertEquals(expected, actual)
    }

    @Test
    fun `list should not contain duplicate should return same list` () {
        val list = listOf(1,2)
        val actual = removeDuplicates(list)
        val excepted = listOf(1,2)
        assertEquals(excepted,actual)
    }
}
