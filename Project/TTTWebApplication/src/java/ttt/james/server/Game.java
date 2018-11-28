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
public class Game {
    private int gameID;
    private String player1ID;
    private String player2ID;
    private String started;
    public Game(){

    }
    
    public void setPlayer1( String _id ){
        player1ID = _id;
    }
    public void setPlayer2( String _id ){
        player2ID = _id;
    }
    public void setGameID( int _id){
        gameID = _id;
    }
    public void setStarted( String _started){
        started = _started;
    }
    public int getID(){ return gameID;}
    public String getPlayer1() { return player1ID;}
    public String getPlayer2() { return player2ID;}
     public String getStarted(){ return started;}
}
