package problems.reverseonlyletters

import java.lang.StringBuilder
import java.util.Stack

fun main(){


    val s = "ab-cd";

    println("Solution 1 -> "+ reverseOnlyLettersSolution1(s = s))

    println("Solution 2 -> "+ reverseOnlyLettersSolution2(s = s))

}

fun reverseOnlyLettersSolution1(s : String): String{
    val result = StringBuilder()

    val letters = Stack<Char>()
    val chars = s.toCharArray()

    for (char in chars){
        if (char.isLetter()){
            letters.push(char)
        }
    }

    for (char in chars){
        if (char.isLetter()){
            result.append(letters.pop())
        }else{
            result.append(char)
        }
    }

    return result.toString()
}

fun reverseOnlyLettersSolution2(s: String): String{

    val chars = s.toCharArray()

    var i = 0;
    var j = chars.size -1

    while (i < j){
        if (!chars[i].isLetter()){
            i++
        }else if (!chars[j].isLetter()){
            j--
        }else{
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp

            i++
            j--
        }
    }

    return String(chars)
}