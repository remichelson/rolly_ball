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
public class actorTwo extends PApplet {
    private boolean isBad;
    //private int row;
    //private int col;
    
    public actorTwo(boolean isBad){
        this.isBad = isBad;
        //this.row = row;
        //this.col = col;
    }

    
    public void goodChangeColor(int row, int col){
        int topX = col * 10;
        int topY = (row * 10) + 10;
        int extentX = 10;
        int extentY = 10;
        
        
        fill(0, 255, 0);
        rect(topX, topY, extentX, extentY);
        
    }
    
    public void badChangeColor(int row, int col){
        int topX = col * 10;
        int topY = (row * 10) + 10;
        int extentX = 10;
        int extentY = 10;
        
        
        fill(255, 0, 0);
        rect(topX, topY, extentX, extentY);
    }
    }
