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
public class badSpace extends space implements command{
    private actorTwo doIt;
    private int row;
    private int col;
    
    public badSpace(int row, int col){
        actorTwo bad = new actorTwo(true);
        doIt = bad;
        this.row = row;
        this.col = col;
    }
    
    public void execute(){
        doIt.badChangeColor(row, col);
    }
    
    
    
}
