import java.util.Arrays;

public class Challenge {

  public static Integer[] challenge = { 5, 8, 3, 2, 6 };
  public static Integer[] challenge1 = { 0, 8, 3, 2, 6 };
  public static Integer[] challenge2 = { 1, 8, 3, 2, 6 };
  public static Integer[] challenge3 = { 5, 8, 9, 2, 6 };
  public static Integer[] challenge4 = { };

  public static void main(String[] args) {

    System.out.println(secondSmallest(challenge));
    System.out.println(secondSmallest(challenge1));
    System.out.println(secondSmallest(challenge2));
    System.out.println(secondSmallest(challenge3));
    System.out.println(secondSmallest(challenge4));

    System.out.println(secondSmallest2(challenge2));

    }


  public static Integer  secondSmallest(Integer[] challenge){
      if(challenge.length <= 1){
        return null;
      }

      Arrays.sort(challenge);
      for(int i = 0; i < challenge.length -1; i++){
        if (challenge[i] != challenge[i+1]){
            return challenge[i+1];
        }
      }
      return null;
    }

    //Función larga para obtener el segundo menor valor del array
    public static Integer  secondSmallest2(Integer[] challenge){
      int smallest = Integer.MAX_VALUE;
      int secSmallest = Integer.MAX_VALUE;

      for (int i = 0; i < challenge.length; i++){
        int current = challenge[i];
        if(current<smallest){
        secSmallest = smallest;
        smallest = current;
        }else if(current <secSmallest && current != smallest){
          secSmallest = current;
        }
      }
      if(secSmallest == Integer.MAX_VALUE){
        return null;
      }
      return secSmallest;
    }

}