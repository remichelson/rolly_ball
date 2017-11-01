/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolly_ball;

import processing.core.PApplet;

/**
 *
 * @author RyansMac
 */
public class board extends PApplet{
    int rows = 9;
    int cols = 3;
    actorTwo[][] board = new actorTwo[rows][cols];
    
    public void settings(){
        size(30, 90);
    }
    
    public void draw(){
        
    }
    
    public void setup(){
        for(int row = 0; row < rows; row++){
            int good = (int) (Math.random() * 3);
            if (good == 0)
                board[row][0] = new goodSpace()
        }
        
        
        
        
        
    }
}
