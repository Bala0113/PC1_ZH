import java.util.ArrayList;

public class Matrix {

    public static int countNumbersDivisibleBySeven(int[][] matrix) {
        int counter=0;
        for(int i =0; i<matrix.length;i++) {
            for(int j =0;j<matrix[i].length;j++) {
                if(matrix[i][j]%7==0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static ArrayList<Integer> columnsWithMax(int[][] matrix) {

        ArrayList<Integer> columswithmax = new ArrayList<>();
        int maxNumber =0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[j][i]> maxNumber)
                {
                    maxNumber= matrix[j][i];
                }
            }
        }
        int index=0;
        for(int i =0; i<matrix.length;i++) {
            for(int j =0;j<matrix[i].length;j++) {
                if(matrix[i][j]==maxNumber) {
                    columswithmax.add(i);
                }
            }
        }
        return columswithmax;
    }
}