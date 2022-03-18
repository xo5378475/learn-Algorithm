package com.atguigu.sparsearray;




public class SparseArray {
    public static void main(String[] args)  {
        // 創建一個原始數組 11 * 11
        // 0表示沒有 1 表示黑子 2表示藍子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;
        int sum = 0;
        for (int[] row : chessArr1) {
            for (int  data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        // 將二維數組 轉稀疏數組使用
        // 先遍歷二維數組的到非零的數據的個數
        for (int[] row : chessArr1) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] != 0) {
                    sum++;
                }
            }
        }
        // System.out.println(sum);
        // 創建對應的稀疏數組
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = 11;//row 數
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        // count 紀錄第幾個非零數
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];

                }
                
            }
        }
        System.out.println("sparseArr");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }


        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        for (int[] row : chessArr2) {
            for ( int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        
    }
   
}
