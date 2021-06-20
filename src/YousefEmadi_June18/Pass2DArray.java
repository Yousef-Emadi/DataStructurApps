package YousefEmadi_June18;

import java.util.Scanner;

public class Pass2DArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /**  using function library */
        My2DArraysLibrary myLib = new My2DArraysLibrary();

        /** Arrays number of rows and columns by user */
        System.out.println("--- 2D Array App ---");
        System.out.println("To create a 2 dimensional array you need to enter 2 numbers as rows and columns");
        System.out.print("Enter number of rows: ");
        int row = keyboard.nextInt();
        System.out.print("Enter number of columns: ");
        int col = keyboard.nextInt();

        /** Array data type by user */
        System.out.println("1. int");
        System.out.println("2. long");
        System.out.println("3. float");
        System.out.println("4. double");
        System.out.println("Select an option number as the array data type: ");
        int datatype = keyboard.nextInt();

        /** Process and show the result */
        System.out.println("Here are the values in the array:");
        switch (datatype) {
            case 1: {
                int[][] array1 = myLib.arrayMakerInt(row,col);
                myLib.showArray(array1);
                System.out.println("The sum of the array values is: " + myLib.getTotal(array1));
                break;
            }

            case 2: {
                long[][] array2 = myLib.arrayMakerLong(row,col);
                myLib.showArray(array2);
                System.out.println("The sum of the array values is: " + myLib.getTotal(array2));
                break;
            }
            case 3: {
                float[][] array3 = myLib.arrayMakerFloat(row,col);
                myLib.showArray(array3);
                System.out.println("The sum of the array values is: " + myLib.getTotal(array3));
                break;
            }
            case 4: {
                double[][] array4 = myLib.arrayMakerDouble(row,col);
                myLib.showArray(array4);
                System.out.println("The sum of the array values is: " + myLib.getTotal(array4));
                break;
            }
        }
    }
}
