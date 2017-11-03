/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolly_ball;

/**
 *
 * @author RyansMac
 */
public class goodSpace extends space implements command{
    private actorTwo doIt;
    private int row;
    private int col;
    
    public goodSpace(int row, int col){
        actorTwo good = new actorTwo(false);
        doIt = good;
        this.row = row;
        this.col = col;
        
    }
    
    public void execute(){
        doIt.goodChangeColor(row, col);
    }
    
    
}
