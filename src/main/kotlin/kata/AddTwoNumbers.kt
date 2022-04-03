package kata

import model.ListNode

/*
    Give two non-empty linked lists representing two non-negative integers, with digits stored in reverse order,
    add the two numbers and return the sum as a linked list.
 */
fun ListNode?.sum(l2: ListNode?): ListNode? {
    if (this == null || l2 == null) {
        return null
    } else {

        val (head1: ListNode?, head2: ListNode?) =
            if (getListSize() < l2.getListSize()) {
                l2 to this
            } else {
                this to l2
            }

        val (sum: Int, rem: Int) = getSumAndRemaining(head1.value, head2.value)
        var remaining = rem

        val result = ListNode(sum)
        var tail: ListNode? = result

        var next1: ListNode? = head1.next
        var next2: ListNode? = head2.next

        while (next1 != null) {
            val (currentSum: Int, currentRem: Int) = getSumAndRemaining(remaining + next1.value, (next2?.value ?: 0))
            remaining = currentRem
            tail!!.next = ListNode(currentSum)
            tail = tail.next
            next1 = next1.next
            next2 = next2?.next
        }

        if (remaining > 0) {
            tail!!.next = ListNode(remaining)
        }

        return result
    }
}

private fun getSumAndRemaining(value1: Int, value2: Int): Pair<Int, Int> {
    val result = value1 + value2
    return if (result > 9) {
        result - 10 to 1
    } else {
        result to 0
    }
}

private fun ListNode?.getListSize(): Int =
    if (this == null) {
        0
    } else {
        var next: ListNode? = this
        var size = 0
        while (next != null) {
            size++
            next = next.next
        }
        size
    }