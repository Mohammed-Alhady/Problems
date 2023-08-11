package gfg3;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {

        ArrayList<Integer> array = new ArrayList<>();
        int leader = arr[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > leader || arr[i] == leader) {
                leader = arr[i];
                array.add(leader);
            }
        }
        Collections.reverse(array);
        return array;
    }
}
