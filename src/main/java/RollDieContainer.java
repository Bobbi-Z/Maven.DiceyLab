import java.util.ArrayList;
import java.util.List;


public class RollDieContainer { // these will be persisted within the map
//contains Bins and lists created for rollDie() - will capture every individual die roll

   static List<Integer> listD4 = new ArrayList<>();
   static List<Integer> listD6 = new ArrayList<>();
   static List<Integer> listD8 = new ArrayList<>();
   static List<Integer> listD10 = new ArrayList<>();
   static List<Integer> listD12 = new ArrayList<>();
   static List<Integer> listD20 = new ArrayList<>();
   static List<Integer> listD100 = new ArrayList<>();
   static Bins binD4;
   static Bins binD6;
   static Bins binD8;
   static Bins binD10;
   static Bins binD12;
   static Bins binD20;
   static Bins binD100;




   public static void collectDataFromRollDie(Dice dice, Integer rollDieResult){
      //switch case to determine which list receives the results based on which die was rolled and to create the bin that
      // will help the data be mapped.
      switch (dice.getNumberOfSides()){
         case (4):
            createD4Bin(dice);
            resultsFromD4(rollDieResult);
            break;
         case (6):
            createD6Bin(dice);
            resultsFromD6(rollDieResult);
            break;
         case (8):
            createD8Bin(dice);
            resultsFromD8(rollDieResult);
            break;
         case (10):
            createD10Bin(dice);
            resultsFromD10(rollDieResult);
            break;
         case(12):
            createD12Bin(dice);
            resultsFromD12(rollDieResult);
            break;
         case (20):
            createD20Bin(dice);
            resultsFromD20(rollDieResult);
            break;
         case (100):
            createD100Bin(dice);
            resultsFromD100(rollDieResult);
            break;
      }
   }
   public static Bins createD4Bin(Dice dice){
      binD4 = BinsUtil.creatingABin(dice);
      return binD4;
   }

   public static List<Integer> resultsFromD4(Integer rollDieResult){
      listD4.add(rollDieResult);
      return listD4;
   }

   public static Bins createD6Bin(Dice dice){
       binD6 = BinsUtil.creatingABin(dice);
      return binD6;
   }

   public static List<Integer> resultsFromD6(Integer rollDieResult){
      listD6.add(rollDieResult);
      return listD6;
   }

   public static List<Integer> resultsFromD8(Integer rollDieResult){
      listD8.add(rollDieResult);
      return listD8;
   }

   public static Bins createD8Bin(Dice dice){
      binD8 = BinsUtil.creatingABin(dice);
      return binD8;
   }

   public static List<Integer> resultsFromD10(Integer rollDieResult){
      listD10.add(rollDieResult);
      return listD10;
   }

   public static Bins createD10Bin(Dice dice){
      binD10 = BinsUtil.creatingABin(dice);
      return binD10;
   }

   public static List<Integer> resultsFromD12(Integer rollDieResult){
      listD12.add(rollDieResult);
      return listD12;
   }

   public static Bins createD12Bin(Dice dice){
      binD12 = BinsUtil.creatingABin(dice);
      return binD12;
   }


   public static List<Integer> resultsFromD20(Integer rollDieResult){
      listD20.add(rollDieResult);
      return listD20;
   }

   public static Bins createD20Bin(Dice dice){
       binD20 = BinsUtil.creatingABin(dice);
      return binD20;
   }


   public static List<Integer> resultsFromD100(Integer rollDieResult){
      listD100.add(rollDieResult);
      return listD100;
   }
   public static Bins createD100Bin(Dice dice){
      binD100 = BinsUtil.creatingABin(dice);
      return binD100;
   }

}
