import java.util.Random;
import java.util.Scanner;

public class homework1_assignment2 {

public static int[] createRandomArray(int size) {

    // creating a new array in the given size
    int[] newArray = new int[size];
    Random rand = new Random();

    // Filling up the array with random numbers between 0-100, the length being the
    // size given
    for (int i = 0; i < size; i++) {
        newArray[i] = rand.nextInt(101);
    }
    return newArray;
}

public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("}");
        System.out.println();
}
    
        public static int findMax(int[] arrayEx) {
        int maxOfArray = arrayEx[0];
        // this assumtion for comparing with other index to detect the maximum of the
        // array.
        for (int n = 0; n < arrayEx.length; n++) {
            if (arrayEx[n] > maxOfArray) {
                maxOfArray = arrayEx[n];
            }
        }
        return maxOfArray;
    }

    public static int findMin(int[] arrayEx) {
        int minOfArray = arrayEx[0];
        // this assumtion for comparing with other index to detect the minimum of the
        // array.
        for (int n = 0; n < arrayEx.length; n++) {
            if (arrayEx[n] < minOfArray) {
                minOfArray = arrayEx[n];
            }
        }
        return minOfArray;
    }

}

