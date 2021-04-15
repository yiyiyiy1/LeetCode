package medium;

public class SubrectangleQueries_1476 {
    int[][] arr;
    public SubrectangleQueries_1476(int[][] rectangle) {
        arr = new int[rectangle.length][rectangle[0].length];
        for (int i = 0; i <rectangle.length ; i++) {
                 arr[i]=rectangle[i].clone();

        }
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <=row2 ; i++) {
            for (int j = col1; j <=col2 ; j++) {
                if(i>=0&&i<arr.length&&j>=0&&j<arr[0].length) arr[i][j]=newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return arr[row][col];
    }
}
