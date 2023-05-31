package homework5;

public class task3 {
    static int count = 0;
    static int N = 8;

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        eightQueen(0, array);
    }

    private static void eightQueen(int row, int[][] array) {
        if (row == N) {
            count++;
            System.out.println("  " + count + " вариант:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            int[][] newArr = new int[N][N];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    newArr[i][j] = array[i][j];
                }
            }
            for (int collumn = 0; collumn < N; collumn++) {
                if (noDangerous(row, collumn, newArr)) {
                    for (int c = 0; c < N; c++) {
                        newArr[row][c] = 0;
                    }
                    newArr[row][collumn] = 1;
                    eightQueen(row + 1, newArr);
                }
            }
        }
    }

    public static boolean noDangerous(int row, int collumn, int[][] newArr) {
        for (int r = row - 1; r >= 0; r--) {
            if (newArr[r][collumn] == 1) {
                return false;
            }
        }
        for (int r = row - 1, c = collumn - 1; r >= 0 && c >= 0; r--, c--) {
            if (newArr[r][c] == 1) {
                return false;
            }
        }
        for (int r = row - 1, c = collumn + 1; r >= 0 && c < N; r--, c++) {
            if (newArr[r][c] == 1) {
                return false;
            }
        }
        return true;
    }
}