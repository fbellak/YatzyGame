/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzygame;

import java.util.ArrayList;

/**
 *
 * @author febe
 */
public class GameEngine {
    
    public ArrayList<Dice> getListOfDices(){
    ArrayList<Dice> dices = new ArrayList<>();
      
      for(int i = 1; i < 7; i++){
        dices.add(new Dice(i));
      }
      
      return dices;
    }
    
    public void buildGame(){
        for(Dice d : getListOfDices()){
            System.out.println(d);
        }
    }
    
      
    
    
}
