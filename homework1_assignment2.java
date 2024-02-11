import java.util.Random;
import java.util.Scanner;

public class homework1_assignment2 {
    
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    boolean exit = false;
    int size = -1;
    //Creating an array and displaying the menu over and over again unntil the user chooses to exit
    while (!exit) {
        
        boolean firstRun = true;

        while (size < 1) {
            if (firstRun) {
            
                System.out.print("Enter a size for your array: ");

                while (!input.hasNextInt()) {
    
                System.out.print("Please enter a positive integer: ");
                input.next();
    
                }
    
                size = input.nextInt();
                firstRun = false;

            }

            else {

                System.out.print("Please enter a positive integer: ");

                while (!input.hasNextInt()) {
    
                System.out.print("Please enter a positive integer: ");
                input.next();
    
                }
    
                size = input.nextInt();

            }   
        }

        //Creating a random array based on the size input
        int[] newArray = createRandomArray(size);

        //Displaying the random array created
        System.out.print("The randomly generated array is: ");
        printArray(newArray);
        System.out.println("");

        //Displaying the options for the menu
        System.out.println("Operations: ");
        System.out.println("1: Find the minimum and maximum of the array ");
        System.out.println("2: Display the difference of each element from the average ");
        System.out.println("3: Find the sum of elements with odd and even-numbered indexes ");
        System.out.println("4: Exit ");
        System.out.print("Please select the operation you want to proceed with: ");
        int option = input.nextInt();
        
        //Deciding what the action will be based on the option chosen by the user
        switch (option) {
            case 1:
                System.out.println("Minimum of the array is: " + findMin(newArray));
                System.out.println("Maximum of the array is: " + findMax(newArray));                    
                break;
            case 2:
                int[] diffArray = calcArray(newArray);
                System.out.println("The differences from the average of each element: ");
                printArray(diffArray);
                break;
            case 3:
                System.out.println("The sum of the odd indexes is: " + sumOfEvenOrOdd(newArray, false));
                System.out.println("The sum of the even indexes is: " + sumOfEvenOrOdd(newArray, true));                    
                break;
            case 4:
                System.out.println(" Exiting... ");
                exit = true;
                break;

            default:
                System.out.println("Invalid option! Please choose a valid option.");
                break;
        }

    }
    input.close();
}    

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

    public static int[] calcArray(int[] array) {
        int sum = 0;
        int average = 0;
        // finding the summation of the given array.
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // finding the average of the given array.
        average = sum / array.length;
        System.out.println(average);
        int arrayOfAverage[] = new int[array.length];
        // creating a new array of the differences of the numbers in the original array and the average of the new array.
        for (int i = 0; i < array.length; i++) {
            arrayOfAverage[i] = array[i] - average;
        }
        return arrayOfAverage;
    }

    public static int sumOfEvenOrOdd (int[] array, boolean isEven)
    {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
            {
                evenSum += array[i];
            }
            else
            {
                oddSum += array[i];
            }
        }
        if(isEven)
        {
            return evenSum;
        }
        else
        {
            return oddSum;
        }
    }

}


