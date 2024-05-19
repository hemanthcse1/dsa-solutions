package problems.reverseprefixofword

import java.lang.StringBuilder
import java.util.Stack

fun main() {

    val word = "abcdefd"
    val ch = 'd'

    println("Solution 1 -> ${reversePrefixSolution1(word = word, ch = ch)}")

    println("Solution 2 -> ${reversePrefixSolution2(word = word, ch = ch)}")

    println("Solution 3 -> ${reversePrefixSolution3(word = word, ch = ch)}")
}

fun reversePrefixSolution1(word: String, ch: Char): String {
    var result = StringBuilder()

    val firstOccurrence = word.indexOf(ch)
    if (firstOccurrence == -1) {
        return word
    }

    var letters: Stack<Char> = Stack()
    for (i in 0..firstOccurrence) {
        letters.push(word[i])
    }

    while (!letters.isEmpty()) {
        result.append(letters.pop())
    }

    for (i in (firstOccurrence + 1) until word.length) {
        result.append(word[i])
    }

    return result.toString()
}

fun reversePrefixSolution2(word: String, ch: Char): String {
    val result = StringBuilder()

    val firstOccurrence = word.indexOf(ch)
    if (firstOccurrence == -1) {
        return word
    }

    for (i in firstOccurrence downTo 0) {
        result.append(word[i])
    }

    for (i in (firstOccurrence + 1) until word.length) {
        result.append(word[i])
    }

    return result.toString()
}

fun reversePrefixSolution3(word: String, ch: Char): String {
    val firstOccurrence = word.indexOf(ch)
    if (firstOccurrence == -1){
        return word
    }

    val result = CharArray(word.length)

    for (i in 0..firstOccurrence){
        result[i] = word[firstOccurrence-i]
    }

    for (i in (firstOccurrence+1) until word.length){
        result[i] = word[i]
    }

    return String(result)
}