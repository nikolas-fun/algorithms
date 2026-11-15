package arrays;

import java.util.Arrays;

public class Task5_SortWithoutHashSet {
  /*  int[] numbers = {100, 4, 200, 4,  1, 3, 2, 5, 6};
  * масив без дубликатов */

    public static int[] longest(int[] arr) {
        int[] result = new int[arr.length];

        int currentLength = 0;

        for(int i=0; i <arr.length; i++){
            boolean duplicate = false;
            for(int j=0; j < currentLength; j++){
                if(arr[i] == result[j]){
                    duplicate = true;
                    break;
                }
            } if(!duplicate){
                result[currentLength] = arr[i];
                currentLength++;
        }


        }
        return Arrays.copyOf(result, currentLength);
    }
}
