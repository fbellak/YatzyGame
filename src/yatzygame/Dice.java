/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzygame;

import java.util.Random;
/**
 *
 * @author febe
 */
public class Dice{

    private int diceID = 1;
    private int diceNumber = 1;
    
    
    public Dice(int id){
        this.diceNumber = diceNumber;
        this.diceID = id;
    }
    
    public int getDiceNumber(){
        return diceNumber;
    }
    
    public void setDiceNumber(int newNumber){
        
        if(newNumber > 0 && newNumber < 7){
            this.diceNumber = newNumber;
        } else {
            throw new IllegalArgumentException("Something went wrong, the dice rolled: " + newNumber);
        }
    }
    
    public void rollDice(Dice d){
      Random randomize = new Random();
      int currentNumber = d.getDiceNumber();
       
        currentNumber = randomize.nextInt(6);
        currentNumber += 1;
        
      setDiceNumber(currentNumber);
    }
    
    public String toString(){
        return "Dice #" + diceID + ", is showing: " + diceNumber;
    }
    
}
