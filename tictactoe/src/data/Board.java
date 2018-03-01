/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Estudiante
 */
public class Board {
    private Square [][] board;
    public Board(){
        char value ='0';
        board = new Square [3][3];
        
        
        for (int row = 0; col < board.length; row++){
            for (int col =0;col <board.length; col++){
                Square square =new Square (row,col,(char)(++value));
                board[row][col]=square;
            }
        }
    }
    
public Square [][] getBoard(){
    
}
public void updateSquare (Square square ){
    
}


