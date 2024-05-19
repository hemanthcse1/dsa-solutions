package problems.reverseprefixofword;

import java.util.Stack;

public class ReversePrefixOfWord {

    public static void main(String[] args){

        String s = "abcdefd";
        Character ch = 'f';

        System.out.println("result -> "+reversePrefix(s,ch));
    }

    public static String reversePrefix(String word, Character ch){

        int firstOccurrence = word.indexOf(ch);
        if (firstOccurrence == -1){
            return word;
        }

        Stack<Character> letters = new Stack<>();

        for (int i = 0; i<= firstOccurrence; i++){
            letters.push(word.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while (!letters.isEmpty()){
            result.append(letters.pop());
        }

        for (int i = (firstOccurrence+1); i< word.length(); i++){
            result.append(word.charAt(i));
        }

        return result.toString();
    }
}
