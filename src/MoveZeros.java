import java.util.Arrays;

public class MoveZeros {

  public static void moveZerosToTheEnd(int[] arr){
    
    int count = 0;
    for(int i = 0; i< arr.length; i++){

      if(arr[i] != 0){
        arr[count] = arr[i];
        count++;
      }
    }
    /*
    como el contador solo incrementa cuando el valor es distinto de cero
    entonces debo completar el array con ceros hasta alcanzar el size del mismo.
    */
    while(count < arr.length){
      arr[count] = 0;
      count++;
    }
  }

  public static void main(String[] args) {

    int[] arr = new int[]{1,0,1,0,1,0};

    System.out.println(Arrays.toString(arr));
    moveZerosToTheEnd(arr);
    System.out.println(Arrays.toString(arr));

  }
  
}
