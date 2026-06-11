package com.harshit.Backtracking;

import java.util.Scanner;

public class Nqueens {
    public static void Nqueens(char [][] board ,int row) {
        //base case

        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                Nqueens(board, row + 1);
                //backtracking
                board[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col) {

        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
                return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
                return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j< board.length;i--,j++)
        {
            if(board[i][j]=='Q')
                return false;
        }
        return true;

    }
    public static void printBoard(char[][] board)
    {
        System.out.println("----------chess board------------");
        for(int i=0;i< board.length;i++)
        {
            for(int j=0;j< board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void main() {

        Scanner scn =new Scanner(System.in);

        System.out.println("enter the no.of rows");
        int n=scn.nextInt();

        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        Nqueens(board,0);
    }
}
