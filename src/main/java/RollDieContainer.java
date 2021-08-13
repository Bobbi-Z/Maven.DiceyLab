import java.util.ArrayList;
import java.util.List;


public class RollDieContainer {
//contains Bins and lists created for rollDie() - will capture every individual die roll

   static List<Integer> listD4 = new ArrayList<>();
   static List<Integer> listD6 = new ArrayList<>();
   static List<Integer> listD8 = new ArrayList<>();
   static List<Integer> listD10 = new ArrayList<>();
   static List<Integer> listD12 = new ArrayList<>();
   static List<Integer> listD20 = new ArrayList<>();
   static List<Integer> listD100 = new ArrayList<>();




   public static void collectDataFromRollDie(Integer numberOfSides, Integer rollDieResult){
      //switch case to determine which list receives the results based on which die was rolled and to create the bin that
      // will help the data be mapped.
      switch (numberOfSides){
         case (4):
            createD4Bin(numberOfSides);
            resultsFromD4(rollDieResult);
            break;
         case (6):
            createD6Bin(numberOfSides);
            resultsFromD6(rollDieResult);
            break;
         case (8):
            createD8Bin(numberOfSides);
            resultsFromD8(rollDieResult);
            break;
         case (10):
            createD10Bin(numberOfSides);
            resultsFromD10(rollDieResult);
            break;
         case(12):
            createD12Bin(numberOfSides);
            resultsFromD12(rollDieResult);
            break;
         case (20):
            createD20Bin(numberOfSides);
            resultsFromD20(rollDieResult);
            break;
         case (100):
            createD100Bin(numberOfSides);
            resultsFromD100(rollDieResult);
            break;
      }
   }

   public static Bins createD4Bin(Integer numOfSides){
      Bins binD4 = new Bins(1, numOfSides);
      BinsMap.create(binD4);
      return binD4;
   }

   public static List<Integer> resultsFromD4(Integer rollRollDieResult){
      listD4.add(rollRollDieResult);
      return listD4;
   }

   public static Bins createD6Bin(Integer numOfSides){
      Bins binD6 = new Bins(1, numOfSides);
      BinsMap.create(binD6);
      return binD6;
   }

   public static List<Integer> resultsFromD6(Integer rollRollDieResult){
      listD6.add(rollRollDieResult);
      return listD6;
   }

   public static Bins createD8Bin(Integer numOfSides){
      Bins binD8 = new Bins(1, numOfSides);
      BinsMap.create(binD8);
      return binD8;
   }

   public static List<Integer> resultsFromD8(Integer rollRollDieResult){
      listD8.add(rollRollDieResult);
      return listD8;
   }

   public static Bins createD10Bin(Integer numOfSides){
      Bins binD10 = new Bins(1, numOfSides);
      BinsMap.create(binD10);
      return binD10;
   }

   public static List<Integer> resultsFromD10(Integer rollRollDieResult){
      listD10.add(rollRollDieResult);
      return listD10;
   }

   public static Bins createD12Bin(Integer numOfSides){
      Bins binD12 = new Bins(1, numOfSides);
      BinsMap.create(binD12);
      return binD12;
   }

   public static List<Integer> resultsFromD12(Integer rollRollDieResult){
      listD12.add(rollRollDieResult);
      return listD12;
   }

   public static Bins createD20Bin(Integer numOfSides){
      Bins binD20 = new Bins(1, numOfSides);
      BinsMap.create(binD20);
      return binD20;
   }

   public static List<Integer> resultsFromD20(Integer rollRollDieResult){
      listD20.add(rollRollDieResult);
      return listD20;
   }
   public static Bins createD100Bin(Integer numOfSides){
      Bins binD100 = new Bins(1, numOfSides);
      BinsMap.create(binD100);
      return binD100;
   }

   public static List<Integer> resultsFromD100(Integer rollRollDieResult){
      listD100.add(rollRollDieResult);
      return listD100;
   }

}
