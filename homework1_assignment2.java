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
}

