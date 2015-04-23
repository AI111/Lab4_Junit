package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by sasha on 4/21/15.
 */
public class SquareMatrix {
    int[][]arr;
    public SquareMatrix(int[][]arr) throws ArrayNotSquareExeption {
        if (!isMatSquare(arr)) {
            throw new ArrayNotSquareExeption("");
        }
        this.arr=arr;
    }

    public static int[][] genSquereMat(int size) {
        int arr[][] = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = random.nextInt(1000);
            }
        }

        return arr;
    }

    public int[][] getArr() {
        return arr;
    }

    public void diagonalElChange(int col){
        if(arr.length==1)return;
        int minxy=diagonalMinElIndex(),
                rowMaxIndex=maxColElIndex(col),
                tmp=arr[minxy][minxy];
        arr[minxy][minxy]=arr[rowMaxIndex][col];
        arr[rowMaxIndex][col]=tmp;
    }

    int diagonalMinElIndex() {
        int min = arr[0][0],xy=0;
        for(int i=1;i<arr.length;i++){
            if (arr[i][i]<min) {
                min = arr[i][i];
                xy=i;
            }
        }
        return xy;
    }

    int maxColElIndex(int col) {
        int max = arr[0][col], y=0;
        for(int i=1;i<arr.length;i++){
            if (arr[i][col]>max){
                max=arr[i][col];
                y=i;
            }
        }
        return y;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder("Arr =\n");
        for(int[]row:arr) stringBuilder.append(Arrays.toString(row)).append("\n");
        return stringBuilder.toString();
    }

    boolean isMatSquare(int[][] arr) {
        for (int[] row : arr) {
            if (row.length != arr.length) return false;
        }
        return true;

    }

}
