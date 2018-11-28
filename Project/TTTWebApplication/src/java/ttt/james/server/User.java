/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.james.server;

/**
 *
 * @author New User
 */
public class User {
    private String uname;
    private int wins = 0;
    private int draws = 0;
    private int losses = 0;
    
    User( String _uname ){
        uname = _uname;
    }
    
    public void addWin(){
        wins++;
    }
    public void addLoss(){
        losses++;
    }
    public void addDraw(){
        draws++;
    }
    public void addScore( String _score){
        if(_score.matches("win"))
            wins++;
        else if(_score.matches("loss"))
            losses++;
        else if(_score.matches("draw"))
            draws++;
    }
    public int getWins(){ return wins;}
    public int getLosses(){ return losses;}
    public int getDraws() { return draws;} 
    public String getUsername() { return uname;}
}
