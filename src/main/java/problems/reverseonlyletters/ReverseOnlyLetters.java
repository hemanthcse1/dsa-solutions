package problems.reverseonlyletters;

import java.util.Stack;

public class ReverseOnlyLetters {


    public static void main(String[] args) {

        String s = "ab-cd";

        System.out.println("-----------------Using Stack ds---------------");
        System.out.println("Solution 1 -> " + reverseOnlyLettersSolution1(s));


        System.out.println("-----------------Using 2 pointer technique---------------");
        System.out.println("Solution 2 -> " + reverseOnlyLettersSolution2(s));


    }

    public static String reverseOnlyLettersSolution1(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> letters = new Stack<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                letters.push(chars[i]);

            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                result.append(letters.pop());
            } else {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }

    public static String reverseOnlyLettersSolution2(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (!Character.isLetter(chars[i])){
                i++;
            }else if (!Character.isLetter(chars[j])){
                j--;
            }else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                i++;
                j--;
            }
        }

        return new String(chars);
    }

}
