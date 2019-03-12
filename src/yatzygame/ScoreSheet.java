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
public class ScoreSheet {
    
    private int points;
    private String categoryName;
    private String[][] upperSectionArray = { {"Aces", "4"}, {"Twos", "0"}, {"Threes", "0"}, {"Fours", "0"}, {"Fives", "0"}, {"Sixes", "0"}, {"Total Score", "0"}, {"Bonus", "0"}, {"Total", "0"} };
    private String[][] lowerSectionArray = { {"3 of a kind", "2"}, {"4 of a kind", "0"}, {"Full House", "0"}, {"Small Straight", "0"}, {"Large Straight", "0"}, {"Yatzy!", "0"}, {"Chance", "0"}, {"Yatzy Bonus", "0"}, {"Total of Lower Section", "0"}, {"Total of Upper Section", "0"}, {"Grand Total", "0"} };
   // private String[][] scoreCard = { upperSectionArray, lowerSectionArray };

    //Create a score card for the player that is empty of results and has the calculation functionality
    public String[][] initializeScoreCard(){
      String[][] createdScoreCard = new String[upperSectionArray.length + lowerSectionArray.length][upperSectionArray.length + lowerSectionArray.length];
      for(int x = 0; x < upperSectionArray.length; x++){
          for(int y = 0; y < upperSectionArray[x].length; y++){
              createdScoreCard[x][y] = upperSectionArray[x][y];
          }
          
      }
      for(int x = 0; x < lowerSectionArray.length; x++){
          for(int y = 0; y < lowerSectionArray[x].length; y++){
              createdScoreCard[upperSectionArray.length + 1][upperSectionArray.length + 1] = lowerSectionArray[x][y];
          }
      }
      return createdScoreCard;
    }
    
    public void setTotalUpperSectionScore(){
        int sum = 0;
        for(int x = 0; x < upperSectionArray.length; x++){
            for(int y = 1; y < upperSectionArray[x].length; y++){
                int points = Integer.parseInt(upperSectionArray[x][y]);
                sum = points + sum;
            }
        }
        upperSectionArray[6][1] = Integer.toString(sum);
        lowerSectionArray[9][1] = Integer.toString(sum);
        
    }
    
    public void setTotalLowerSectionScore(){
      int sum = 0;
      for(int x = 0; x < lowerSectionArray.length; x++){
          for(int y = 1; y < lowerSectionArray[x].length; y++){
              int points = Integer.parseInt(lowerSectionArray[x][y]);
              sum = points + sum;
          }
      }
      lowerSectionArray[8][1] = Integer.toString(sum);
        
    }
    
    public int setTotalScore(){
       setTotalUpperSectionScore(); 
       setTotalLowerSectionScore();
       int sum = Integer.parseInt(lowerSectionArray[8][1]) + Integer.parseInt(lowerSectionArray[9][1]);
       lowerSectionArray[10][1] = Integer.toString(sum);
               return sum;
    }
  }
   

