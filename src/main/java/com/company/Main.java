package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size ");
        int size = scanner.nextInt();
        SquareMatrix matrix = new SquareMatrix(MatrixUtils.genSquereMat(size));

        System.out.print(matrix);
        System.out.print("Enter collum index ");
        int col = scanner.nextInt();

        try{
            matrix.diagonalElChange(col);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("collum index not in array");
            System.exit(1);
        }
        System.out.print(matrix);

    }

}
