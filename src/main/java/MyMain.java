import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list,0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (i == list.size()-1)
        {
            return true;
        }
        else{
            if(list.get(i) <= list.get(i+1))
            {
                i++;
                return isSortedRec(list, i);
            }
             return false;
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i, int c) {
        if (i == arr.length-1)
        {
            if(arr[i] == x)
            {
                c++;
            }
            if(c == count)
            {
                return true;
            }
        }

        else
        {
            if(arr[i] == x)
            {
                c++;
            }
            i++;
            return hasCountCopiesRec(arr, x, count, i, c);
        }
        return false;
        
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
           if (!(lowerBound <= upperBound))
           {
               return false;
           }   
           else
           {
               int middleIndex = lowerBound + (upperBound - lowerBound) / 2;
               if (arr[middleIndex] < num)
               {
                   lowerBound = middleIndex + 1;
                   return binarySearchRec(arr,num,lowerBound,upperBound);
               }
               else if ( arr[middleIndex] > num) {
                   upperBound = middleIndex -1;
                   return binarySearchRec(arr,num,lowerBound,upperBound);
               }
               else {
                   return true;
               }
           }
        
    }

    public static void main(String[] args) {
       
    }
}


//Jason skeoch helped me out with this some
