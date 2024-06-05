package arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class FindMissingNumbersHKR {


    public static void main(String[] args){

        int[] oarr ={7,4,3,5,6,7,8,9};
        int[] barr = {7,4,3,5,7,8};

        System.out.println(Arrays.toString(findMissingNumbers(oarr, barr)));
    }

    public static int[] findMissingNumbers(int[] oarr, int[] barr){


        TreeMap<Integer,Integer> freqMap = new TreeMap<>();

        for (int i: oarr){
            int freq = freqMap.getOrDefault(i,0);
            freq++;
            freqMap.put(i,freq);
        }

        for (int i: barr){
            int freq = freqMap.get(i);
            freq--;
            if (freq == 0){
                freqMap.remove(i);
            }else {

                freqMap.put(i,freq);
            }
        }
        int[] result = new int[freqMap.size()];
        int i = 0;
        for (Map.Entry<Integer,Integer> integerEntry: freqMap.entrySet()){
            result[i++] = integerEntry.getKey();
        }

        return result;
    }
}
