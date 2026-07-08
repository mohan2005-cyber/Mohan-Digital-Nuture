# 🔍 Linear Search
---------------------------------------------------------------------------------------------
 **Explanation**
 --------------------------------------------------------------------------------------------
Linear Search is a sequential search algorithm. It starts at the very first element of a data collection and checks each element one by one until a match is found or the entire collection is exhausted.

---------------------------------------------------------------------------------------------
 **Java Code Implementation**
 -------------------------------------------------------------------------------------------
        public class LinearSearcher {
            public static int search(int[] arr, int target) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == target) {
                        return i; // Element found
                    }
                }
                return -1; // Element not found
            }
        }

---------------------------------------------------------------------------------------------
 **Time & Space Complexities**
 --------------------------------------------------------------------------------------------   Best Case       : O(1) — The target element is the very first item in the collection.
    Average Case    : O(N) — The target element is found somewhere in the middle.
    Worst Case      : O(N) — The target element is at the very end or completely missing, 
                               requiring (N) comparisons.
    Space Complexity: O(1) — Operates entirely in-place with no additional allocation.






# 🔍 Binary Search
---------------------------------------------------------------------------------------------
 **Explanation**
 --------------------------------------------------------------------------------------------
Binary Search is an efficient, divide-and-conquer algorithm designed for sorted datasets. It continuously halves the search space by comparing the target value to the middle element of the array. If the target is smaller than the mid-point, the right half is discarded; if larger, the left half is discarded.

---------------------------------------------------------------------------------------------
 **Java Code Implementation**
 -------------------------------------------------------------------------------------------
        public class BinarySearcher {
            public static int search(int[] arr, int target) {
                int left = 0;
                int right = arr.length - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2; // Prevents integer overflow

                    if (arr[mid] == target) {
                        return mid; // Element found
                    } else if (arr[mid] < target) {
                        left = mid + 1; // Target is in the right half
                    } else {
                        right = mid - 1; // Target is in the left half
                    }
                }
                return -1; // Element not found
            }
        }


---------------------------------------------------------------------------------------------
 **Time & Space Complexities**
 --------------------------------------------------------------------------------------------   Best Case       : O(1) — The target element lands exactly at the initial middle index.
    Average Case    : O(Log N) — The search space splits logarithmically.
    Worst Case      : O(Log N) — The target is at the extreme boundaries or absent. 
    Space Complexity: O(1) — Iterative implementation uses zero auxiliary space.




