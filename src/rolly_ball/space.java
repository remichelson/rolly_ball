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
public class space extends PApplet{
    int x;
    int y;
    
    public void draw(int row, int col, actorTwo doIt){
        y = row * 10;
        x = (col - 1) * 10;
        
        
    }
    
    
}
