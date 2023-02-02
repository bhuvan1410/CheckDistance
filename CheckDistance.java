import java.util.*;

public class CheckDistance {
    public static boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> distanceMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!distanceMap.containsKey(s.charAt(i))) {
                distanceMap.put(s.charAt(i), i + 1);
            }

            else if (distance[s.charAt(i) - 'a'] != i - distanceMap.get(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String firstString = "abaccb";
        String secondString = "aa";

        int[] array1 = new int[26];
        int[] array2 = new int[26];

        // [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        // [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 0;
        array1[3] = 5;
        array1[5] = 0;
        array1[6] = 0;
        array1[7] = 0;
        array1[8] = 0;
        array1[9] = 0;
        array1[10] = 0;
        array1[11] = 0;
        array1[12] = 0;
        array1[13] = 0;
        array1[14] = 0;
        array1[15] = 0;
        array1[16] = 0;
        array1[17] = 0;
        array1[18] = 0;
        array1[19] = 0;
        array1[20] = 0;
        array1[21] = 0;
        array1[22] = 0;
        array1[23] = 0;
        array1[24] = 0;
        array1[25] = 0;
        array1[26] = 0;

        array2[0] = 1;
        array2[1] = 0;
        array2[2] = 0;
        array2[3] = 0;
        array2[5] = 0;
        array2[6] = 0;
        array2[7] = 0;
        array2[8] = 0;
        array2[9] = 0;
        array2[10] = 0;
        array2[11] = 0;
        array2[12] = 0;
        array2[13] = 0;
        array2[14] = 0;
        array2[15] = 0;
        array2[16] = 0;
        array2[17] = 0;
        array2[18] = 0;
        array2[19] = 0;
        array2[20] = 0;
        array2[21] = 0;
        array2[22] = 0;
        array2[23] = 0;
        array2[24] = 0;
        array2[25] = 0;
        array2[26] = 0;

        boolean distance1 = checkDistances(firstString, array1);
        boolean distance2 = checkDistances(secondString, array2);

        System.out.println("For the first array and string value, the distance is " + distance1);
        System.out.println("For the second array and string value, the distance is " + distance2);

    }

}
