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
    fun `when unique element list pass should return same list` () {
        val list = listOf(1,2)
        val actual = removeDuplicates(list)
        val excepted = listOf(1,2)
        assertEquals(excepted,actual)
    }

    @Test
    fun `list contain duplicate should return unique list`(){
        val initialList= listOf(1,1,2,3,4,4,5)
        val result= listOf(1,2,3,4,5)
        assertEquals(result,removeDuplicates(initialList))

    }
}
