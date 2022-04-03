package kata

import model.ListNode
import org.junit.Assert.*
import org.junit.Test

class AddTwoNumbersTest {

    @Test
    fun `should sum two numbers correctly`() {
        val list1: ListNode? = listOf(9, 9, 9, 9, 9, 9, 9).toLinkedList()
        val list2: ListNode? = listOf(9, 9, 9, 9).toLinkedList()

        val result: ListNode? = list1?.sum(list2)

        var tail: ListNode? = result
        assertNotNull(tail)
        assertEquals(8, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(9, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(9, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(9, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(0, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(0, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(0, tail!!.value)
        tail = tail.next
        assertNotNull(tail)
        assertEquals(1, tail!!.value)
        tail = tail.next
        assertNull(tail)
    }
}