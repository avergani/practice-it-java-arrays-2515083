public class Challenge2 {
  
public static Integer[] arr = {1,2,3,4,5,6};


  public static void main(String[] args) {

    triangle(arr);

}

public static void triangle(Object[] arr){

  for(int row=0; row<= arr.length - 1; row++){
    
    for(int col=0;col<=row;col++){
      System.out.print(arr[col]);
    }
    System.out.println();
    } 
  }
}
