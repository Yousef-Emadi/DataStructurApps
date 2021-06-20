package YousefEmadi_June18;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Developed by: Yousef Emadi
 * including overloaded functions for:
 * arrayMaker
 * showArray
 * getTotal
 * getCount
 * getAverage
 * getColumnTotal
 * getRowTotal
 * getHighestInRow
 * getLowestInRow
 * getHighestInColumn
 * getLowestInColumn
 */
public class My2DArraysLibrary {

    /** /////////////////////////       Array maker int    ////////////////////////////*/
    public int[][] arrayMakerInt(int rowLength, int columnLength){
        int [][] array = new int[rowLength][columnLength];
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter all array entities starting from the first row separating by enter key");
        for (int row = 0 ; row < rowLength ; row ++){
            for (int col = 0 ; col < array[row].length ; col ++){
                array[row][col] = input.nextInt();
            }
        }
        return array;
    }


    /** /////////////////////////       Array maker long    ////////////////////////////*/
    public long[][] arrayMakerLong(int rowLength, int columnLength){
        long [][] array = new long[rowLength][columnLength];
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter all array entities starting from the first row separating by enter key");
        for (int row = 0 ; row < rowLength ; row ++){
            for (int col = 0 ; col < array[row].length ; col ++){
                array[row][col] = input.nextLong();
            }
        }
        return array;
    }


    /** /////////////////////////       Array maker float    ////////////////////////////*/
    public float[][] arrayMakerFloat(int rowLength, int columnLength){
        float [][] array = new float[rowLength][columnLength];
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter all array entities starting from the first row separating by enter key");
        for (int row = 0 ; row < rowLength ; row ++){
            for (int col = 0 ; col < array[row].length ; col ++){
                array[row][col] = input.nextFloat();
            }
        }
        return array;
    }

    /** /////////////////////////       Array maker double    ////////////////////////////*/
    public double[][] arrayMakerDouble(int rowLength, int columnLength){
        double [][] array = new double[rowLength][columnLength];
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter all array entities starting from the first row separating by enter key");
        for (int row = 0 ; row < rowLength ; row ++){
            for (int col = 0 ; col < array[row].length ; col ++){
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }

    /** /////////////////////////       Show Array (overloaded)     ////////////////////////////*/
    public void showArray(int[][] array){
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col++){
                System.out.print(array[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public void showArray(long[][] array){
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col++){
                System.out.print(array[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public void showArray(float[][] array){

        // Format for removing the .0 from the double and float whole numbers
        DecimalFormat df = new DecimalFormat("###.#");

        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col++){
                System.out.print(df.format(array[row][col]) + "\t");
            }
            System.out.println();
        }
    }

    public void showArray(double[][] array){

        // Format for removing the .0 from the double and float whole numbers
        DecimalFormat df = new DecimalFormat("###.#");

        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col++){
                System.out.print(df.format(array[row][col]) + "\t");
            }
            System.out.println();
        }
    }

    /** /////////////////////////       get Total (overloaded)     ////////////////////////////*/
    public int getTotal(int[][] array){
        int sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                sum += array[row][col];
            }
        }
        return sum;
    }

    public long getTotal(long[][] array){
        long sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                sum += array[row][col];
            }
        }
        return sum;
    }

    public float getTotal(float[][] array){
        float sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                sum += array[row][col];
            }
        }
        return sum;
    }

    public double getTotal(double[][] array){
        double sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                sum += array[row][col];
            }
        }
        return sum;
    }

    /** /////////////////////////    get Count - number of array entities (overloaded)    ////////////////////////////*/

    public int getCount(int[][] array){
        int count = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                count++;
            }
        }
        return count;
    }

    public int getCount(long[][] array){
        int count = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                count++;
            }
        }
        return count;
    }

    public int getCount(float[][] array){
        int count = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                count++;
            }
        }
        return count;
    }

    public int getCount(double[][] array){
        int count = 0;
        for (int row = 0 ; row < array.length ; row++){
            for (int col = 0 ; col < array[row].length ; col ++){
                count++;
            }
        }
        return count;
    }

    /** /////////////////////////       get Average (overloaded)     ////////////////////////////*/

    public double getAverage(int[][] array){return getTotal(array)/getCount(array);}
    public double getAverage(long[][] array){return getTotal(array)/getCount(array);}
    public double getAverage(float[][] array){return getTotal(array)/getCount(array);}
    public double getAverage(double[][] array){return getTotal(array)/getCount(array);}

    /** /////////////////////////       get Column Total (overloaded)     ////////////////////////////*/
    public int getColumnTotal(int[][] array, int col){
        int sum = 0;
        for (int row = 0 ; row < array.length ; row++){
                sum += array[row][col];
            }
        return sum;
    }

    public long getColumnTotal(long[][] array, int col){
        long sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            sum += array[row][col];
        }
        return sum;
    }

    public float getColumnTotal(float[][] array, int col){
        float sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            sum += array[row][col];
        }
        return sum;
    }

    public double getColumnTotal(double[][] array, int col){
        double sum = 0;
        for (int row = 0 ; row < array.length ; row++){
            sum += array[row][col];
        }
        return sum;
    }

    /** /////////////////////////       get Row Total (overloaded)     ////////////////////////////*/
    public int getRowTotal(int[][] array, int row){
        int sum = 0;
            for (int col = 0 ; col < array[row].length ; col ++){
                sum += array[row][col];
            }
        return sum;
    }

    public long getRowTotal(long[][] array, int row){
        long sum = 0;
        for (int col = 0 ; col < array[row].length ; col ++){
            sum += array[row][col];
        }
        return sum;
    }

    public float getRowTotal(float[][] array, int row){
        float sum = 0;
        for (int col = 0 ; col < array[row].length ; col ++){
            sum += array[row][col];
        }
        return sum;
    }

    public double getRowTotal(double[][] array, int row){
        double sum = 0;
        for (int col = 0 ; col < array[row].length ; col ++) {
            sum += array[row][col];
        }
        return sum;
    }

    /** /////////////////////////       get Highest in Row (overloaded)     ////////////////////////////*/
    public int getHighestInRow(int[][] array, int row){
        int max = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] > max) max = array[row][col];
        }
        return max;
    }

    public long getHighestInRow(long[][] array, int row){
        long max = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] > max) max = array[row][col];
        }
        return max;
    }

    public float getHighestInRow(float[][] array, int row){
        float max = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] > max) max = array[row][col];
        }
        return max;
    }

    public double getHighestInRow(double[][] array, int row){
        double max = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] > max) max = array[row][col];
        }
        return max;
    }

    /** /////////////////////////       get Lowest in Row (overloaded)     ////////////////////////////*/
    public int getLowestInRow(int[][] array, int row){
        int min = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] < min) min = array[row][col];
        }
        return min;
    }

    public long getLowestInRow(long[][] array, int row){
        long min = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] < min) min = array[row][col];
        }
        return min;
    }

    public float getLowestInRow(float[][] array, int row){
        float min = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] < min) min = array[row][col];
        }
        return min;
    }

    public double getLowestInRow(double[][] array, int row){
        double min = array[row][0];
        for (int col = 0 ; col < array[row].length ; col ++){
            if (array[row][col] < min) min = array[row][col];
        }
        return min;
    }

    /** /////////////////////////       get Highest in Column (overloaded)     ////////////////////////////*/
    public int getHighestInColumn(int[][] array, int col){
        int result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] > result) result = array[row][col];
        }
        return result;
    }

    public long getHighestInColumn(long[][] array, int col){
        long result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] > result) result = array[row][col];
        }
        return result;
    }

    public float getHighestInColumn(float[][] array, int col){
        float result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] > result) result = array[row][col];
        }
        return result;
    }

    public double getHighestInColumn(double[][] array, int col){
        double result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] > result) result = array[row][col];
        }
        return result;
    }

    /** /////////////////////////       get Lowest in Column (overloaded)     ////////////////////////////*/
    public int getLowestInColumn(int[][] array, int col){
        int result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] < result) result = array[row][col];
        }
        return result;
    }

    public long getLowestInColumn(long[][] array, int col){
        long result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] < result) result = array[row][col];
        }
        return result;
    }

    public float getLowestInColumn(float[][] array, int col){
        float result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] < result) result = array[row][col];
        }
        return result;
    }

    public double getLowestInColumn(double[][] array, int col){
        double result = array[0][col];
        for (int row = 0 ; row < array.length ; row++){
            if (array[row][col] < result) result = array[row][col];
        }
        return result;
    }

} // end of class
