package Exe2;
import java.util.*;

public class Square {
 
  public static HashMap getSquare(int[] array) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
    for (int n: array) {
      map.put( n, n*n);
    }
    return map;
  }
 
  public static void main(String[] args) {
    int array[] = new int[]{6,8,4,7,9,8};
    HashMap<Integer, Integer> map = getSquare(array);
 
    Iterator<Integer> it = map.keySet().iterator();
    while(it.hasNext()){
    Integer key = it.next();
      System.out.println(key + " : " + map.get(key));
    }
  }
}
