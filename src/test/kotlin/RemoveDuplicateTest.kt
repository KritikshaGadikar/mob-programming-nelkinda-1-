import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class RemoveDuplicateTest {

    @Test
    fun `test for empty list should return empty list` () {
        val lst = emptyList<Int>()
        val actual = removeDuplicates(lst)
        val expected = emptyList<Int>()
        assertEquals(expected, actual)
    }

}