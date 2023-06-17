import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 9;
        int nums[] = {-1, 0, 3, 5, 9, 12};

        // int index = Arrays.binarySearch(nums,target);
        int index = binarySearch(nums,target);
        
        if (index == -1) {
            System.out.println(-1);
        } else {
            System.out.println(index);
        }
    }
    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

             if (value < target) low = middle + 1;
             else if (value > target) high = middle -1;
             else return middle; // target is found
        }
        return -1; // target not found
    }
}
