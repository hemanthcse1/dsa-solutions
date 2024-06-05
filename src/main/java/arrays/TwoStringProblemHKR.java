package arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoStringProblemHKR {

    public static void main(String[] args){

        String s1 = "abc";
        String s2 = "acd";

        System.out.println("is two string contains common substring? -> "+findSubStringInGivenTwoStrings(s1,s2));

    }

    public static String findSubStringInGivenTwoStrings(String s1, String s2){
        StringBuilder result = new StringBuilder();

        Set<Character> set1S1 = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set1S1.add(c);
        }

        Set<Character> set2S2 = new HashSet<>();

        for (char c : s2.toCharArray()) {
            set2S2.add(c);
        }

        set1S1.retainAll(set2S2);

        for (char c : set1S1) {
            result.append(c);
        }

        return result.toString();
    }
}
