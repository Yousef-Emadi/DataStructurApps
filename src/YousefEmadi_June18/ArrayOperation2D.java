package YousefEmadi_June18;

import java.util.Scanner;

public class ArrayOperation2D {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /**  using function library */
        My2DArraysLibrary myLib = new My2DArraysLibrary();

        /** Arrays number of rows and columns by user */
        System.out.println("--- Array Operation App ---");
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
        switch (datatype) {
            case 1: {
                int[][] array1 = myLib.arrayMakerInt(row,col);
                System.out.println("Array values:");
                myLib.showArray(array1);
                System.out.println();
                System.out.println("Total: " + myLib.getTotal(array1));
                System.out.println("average: " + myLib.getTotal(array1));
                for (int i = 0 ; i < array1.length ; i++){
                    System.out.println("Total of row " + i + " : " + myLib.getRowTotal(array1, i));
                }


                for (int i = 0 ; i < array1[0].length ; i++){
                    System.out.println("Total of column " + i + " : " + myLib.getColumnTotal(array1, i));
                }

                for (int i = 0 ; i < array1.length ; i++){
                    System.out.println("Highest value in row " + i + " is: " + myLib.getHighestInRow(array1, i));
                }


                for (int i = 0 ; i < array1[0].length ; i++){
                    System.out.println("Highest value in column " + i + " is: " + myLib.getHighestInColumn(array1, i));
                }

                for (int i = 0 ; i < array1.length ; i++){
                    System.out.println("Lowest value in row " + i + " is: " + myLib.getLowestInRow(array1, i));
                }


                for (int i = 0 ; i < array1[0].length ; i++){
                    System.out.println("Lowest value in column " + i + " is: " + myLib.getLowestInColumn(array1, i));
                }

                break;
            }

            case 2: {
                long[][] array2 = myLib.arrayMakerLong(row,col);
                System.out.println("Array values:");
                myLib.showArray(array2);
                System.out.println();
                System.out.println("Total: " + myLib.getTotal(array2));
                System.out.println("average: " + myLib.getTotal(array2));
                for (int i = 0 ; i < array2.length ; i++){
                    System.out.println("Total of row " + i + " : " + myLib.getRowTotal(array2, i));
                }


                for (int i = 0 ; i < array2[0].length ; i++){
                    System.out.println("Total of column " + i + " : " + myLib.getColumnTotal(array2, i));
                }

                for (int i = 0 ; i < array2.length ; i++){
                    System.out.println("Highest value in row " + i + " is: " + myLib.getHighestInRow(array2, i));
                }


                for (int i = 0 ; i < array2[0].length ; i++){
                    System.out.println("Highest value in column " + i + " is: " + myLib.getHighestInColumn(array2, i));
                }

                for (int i = 0 ; i < array2.length ; i++){
                    System.out.println("Lowest value in row " + i + " is: " + myLib.getLowestInRow(array2, i));
                }


                for (int i = 0 ; i < array2[0].length ; i++){
                    System.out.println("Lowest value in column " + i + " is: " + myLib.getLowestInColumn(array2, i));
                }

                break;
            }


            case 3: {
                float[][] array3 = myLib.arrayMakerFloat(row,col);
                System.out.println("Array values:");
                myLib.showArray(array3);
                System.out.println();
                System.out.println("Total: " + myLib.getTotal(array3));
                System.out.println("average: " + myLib.getTotal(array3));
                for (int i = 0 ; i < array3.length ; i++){
                    System.out.println("Total of row " + i + " : " + myLib.getRowTotal(array3, i));
                }


                for (int i = 0 ; i < array3[0].length ; i++){
                    System.out.println("Total of column " + i + " : " + myLib.getColumnTotal(array3, i));
                }

                for (int i = 0 ; i < array3.length ; i++){
                    System.out.println("Highest value in row " + i + " is: " + myLib.getHighestInRow(array3, i));
                }


                for (int i = 0 ; i < array3[0].length ; i++){
                    System.out.println("Highest value in column " + i + " is: " + myLib.getHighestInColumn(array3, i));
                }

                for (int i = 0 ; i < array3.length ; i++){
                    System.out.println("Lowest value in row " + i + " is: " + myLib.getLowestInRow(array3, i));
                }


                for (int i = 0 ; i < array3[0].length ; i++){
                    System.out.println("Lowest value in column " + i + " is: " + myLib.getLowestInColumn(array3, i));
                }

                break;
            }
            case 4: {
                double[][] array4 = myLib.arrayMakerDouble(row,col);
                System.out.println("Array values:");
                myLib.showArray(array4);
                System.out.println();
                System.out.println("Total: " + myLib.getTotal(array4));
                System.out.println("average: " + myLib.getTotal(array4));
                for (int i = 0 ; i < array4.length ; i++){
                    System.out.println("Total of row " + i + " : " + myLib.getRowTotal(array4, i));
                }


                for (int i = 0 ; i < array4[0].length ; i++){
                    System.out.println("Total of column " + i + " : " + myLib.getColumnTotal(array4, i));
                }

                for (int i = 0 ; i < array4.length ; i++){
                    System.out.println("Highest value in row " + i + " is: " + myLib.getHighestInRow(array4, i));
                }


                for (int i = 0 ; i < array4[0].length ; i++){
                    System.out.println("Highest value in column " + i + " is: " + myLib.getHighestInColumn(array4, i));
                }

                for (int i = 0 ; i < array4.length ; i++){
                    System.out.println("Lowest value in row " + i + " is: " + myLib.getLowestInRow(array4, i));
                }


                for (int i = 0 ; i < array4[0].length ; i++){
                    System.out.println("Lowest value in column " + i + " is: " + myLib.getLowestInColumn(array4, i));
                }

                break;
            }
        }

    }
}
