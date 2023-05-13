import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {

    //Create an array
    int[] lotteryNumbers = {92,12,38,74};  //new double[5];

    //System.out.println(lotteryNumbers[2]);
    //overwrite
    //lotteryNumbers[2] = 40;
    //System.out.println(lotteryNumbers[2]);

    for(int i= 0; i< lotteryNumbers.length; i++){
      System.out.println(lotteryNumbers[i]);
    }
    System.out.println();
    
    for(int i = lotteryNumbers.length -1 ; i>= 0 ; i--){
      System.out.println(lotteryNumbers[i]);
    }
    System.out.println();

    for (int i = lotteryNumbers.length - 1; i >=0; i = i - 2) {
      System.out.println(lotteryNumbers[i]);
    }
    System.out.println();

    for (int item : lotteryNumbers){
      System.out.println(item);
    }
    System.out.println();



    //Java Stream
    Arrays.stream(lotteryNumbers).forEach(System.out::println);

    //Arrays.stream(lotteryNumbers).filter()
    // Arrays.stream(lotteryNumbers).average()
    // Arrays.stream(lotteryNumbers).sum()

  }

}