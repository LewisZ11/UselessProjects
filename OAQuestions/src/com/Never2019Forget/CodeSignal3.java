package com.Never2019Forget;

public class CodeSignal3 {

    public static int solution(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;

        if (m == n && n == 1) {
            return 1;
        }

        int[][] rowsCount = new int[m][1001];
        int[][] colsCount = new int[n][1001];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowsCount[i][matrix[i][j]]++;
                colsCount[j][matrix[i][j]]++;
            }
        }

        if (m == n) {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {

                    boolean flag = true;

                    for (int k = 1; k <= 1000; k++) {
                        if (rowsCount[i][k] != colsCount[j][k]) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        result++;
                    }

                }
            }

            return result;

        } else if (m > n) {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    boolean flag = true;

                    for (int k = 1; k <= 1000; k++) {
                        if (rowsCount[i][k] > colsCount[j][k]) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        result++;
                    }

                }
            }

            return result;



        } else {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    boolean flag = true;

                    for (int k = 1; k <= 5; k++) {
                        if (rowsCount[i][k] < colsCount[j][k]) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        result++;
                    }

                }
            }

            return result;



        }





        // return result;


    }


    public static void main(String[] args) {

        int a = 1;
        int[][] matrix = new int[][]{{4,3,4,4,4}};

        int b = solution(matrix);
        System.out.println(solution(matrix));
    }
}
