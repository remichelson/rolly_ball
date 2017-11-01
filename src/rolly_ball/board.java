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
    int[][] board = new int[3][9];
    
    public void settings(){
        size(30, 90);
    }
    
    public void draw(){
        
    }
    
    public void setup(){
        int good = (int) (Math.random() * 3) + 1;
        
        
        
    }
}
