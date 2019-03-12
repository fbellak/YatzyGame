/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzygame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author febe
 */
public class YatzyGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Player p = new Player("YatzySlayer2000");
      
      System.out.println(p);
      ScoreSheet s = new ScoreSheet();
     // s.setTotalUpperSectionScore();
      //s.setTotalLowerSectionScore();
      System.out.println(s.setTotalScore());
      s.initializeScoreCard();
      System.out.println(s.initializeScoreCard().length);
     
    }
    
}
