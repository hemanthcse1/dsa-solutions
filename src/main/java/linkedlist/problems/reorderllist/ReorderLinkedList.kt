package linkedlist.problems.reorderllist

class LListNode(var value: Int) {
    var next: LListNode? = null
}

fun main() {
    val n1 = LListNode(4)
    val n2 = LListNode(8)
    val n3 = LListNode(15)
    val n4 = LListNode(16)
    val n5 = LListNode(23)

    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    n5.next = null

    val head = n1
    reorderList(head)
    printList(head)
}

fun reorderList(head: LListNode?) {
    if (head == null || head.next == null) {
        return
    }

    // Step 1: Find the middle of the linked list
    var slow: LListNode? = head
    var fast: LListNode? = head

    while (fast?.next != null && fast.next?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    // Step 2: Reverse the second half of the list
    val middle = slow
    var current = slow?.next

    while (current?.next != null) {
        val nextNode = current.next
        current.next = nextNode?.next
        nextNode?.next = middle?.next
        middle?.next = nextNode
    }

    // Step 3: Merge the two halves
    var first: LListNode? = head
    var second: LListNode? = middle?.next

    while (first != middle) {
        middle?.next = second?.next
        second?.next = first?.next
        first?.next = second
        first = second?.next
        second = middle?.next
    }
}

fun printList(head: LListNode?) {
    var current = head
    while (current != null) {
        print("${current.value} ")
        current = current.next
    }
    println()
}