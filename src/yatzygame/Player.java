/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzygame;

/**
 *
 * @author febe
 */
public class Player {
    
    private String name;
    private int points = 0;
    private String[][] scoreCard;
    
    
    public Player(String nameOfPlayer){
        this.name = nameOfPlayer;
        this.points = points;
        ScoreSheet s = new ScoreSheet();
        this.scoreCard = s.initializeScoreCard();
    }
    
    public String getPlayerName(){
        return name;
    }
    
    public void setPoint(int i){
        points = points + i;
    }
    
    public String[][] getScoreCard(){
        return scoreCard;
    }
    
    public String toString(){
        return name + " has " + points + " points";
    }
    
}
