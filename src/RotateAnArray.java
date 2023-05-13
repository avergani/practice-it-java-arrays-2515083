import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {

      Object[] arr = new Integer[]{1,2,3,4,5,6};
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
  }

public static Object[] rotateRight(Object[] arr){
 
  if(arr == null){
    return null;
  }
  Object[] result = new Object[arr.length];
 
  for(int i=0;i< arr.length; i++){
    result[(i+1) % result.length]= arr[i];
  }
  return result;
}

  
}

