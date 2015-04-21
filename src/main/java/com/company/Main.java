package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SquareMatrix matrix = null;
        try {
            matrix = new SquareMatrix(SquareMatrix.genSquereMat(3));
        } catch (ArrayNotSquareExeption arrayNotSquareExeption) {
            arrayNotSquareExeption.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
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
