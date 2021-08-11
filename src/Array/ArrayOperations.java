package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperations {
    public static void main (String[] args)
    {
        //Insertion
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);

        //Travers
        int[] intArr = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("The array elements are ");
        // Print all the array elements
        for (int i = 0; i < intArr.length; i++) {
        System.out.print(intArr[i] + " ");
        }

        //Update
        int array[] = {1,2,3,4};
        System.out.println("Before update" + array[2]);
        array[2] = 9;//updating the value
        System.out.println("After update" + array[2]);

        //Array Concat
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));

        // convert array to arraylist
        ArrayList<String> languages= new ArrayList(Arrays.asList(array1));

        System.out.println("ArrayList: " + languages);
    }
}
