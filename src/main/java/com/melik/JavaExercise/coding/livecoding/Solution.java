import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a Java program that finds all pairs of integers within an array which sum to a specified target.
 * Each element can only be used once, and you need to handle duplicates appropriately.
 * Return the pairs in a list of arrays where each array contains two integers.
 *
 * * Example 1:
 * Input: numbers = [2, 7, 11, 15, 3, 6, 8, 1], target = 9
 * Output: [[1, 8], [2, 7], [3, 6]]
 *
 * * Example 2:
 * Input: numbers = [1, 1, 2, 3, 4], target = 5
 * Output: [[1, 4], [2, 3]]
 *
 * * Example 3:
 * Input: numbers = [2, 2, 2, 2], target = 4
 * Output: [[2, 2]]
 *
 * */
class Solution {
  public static void main(String[] args) {
     int[] numbers = new int[] {1,1,2,3,4};
     int target = 5;
 
     System.out.println(findPairs(numbers, target));
  }
 
  public static List<List<Integer>> findPairs(int[] numbers, int target) {
      List<Integer> integerList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
      HashSet<Integer> hashSet=new HashSet<>(integerList);
      List<Integer> processedList=new ArrayList<>();
      List<List<Integer>> resultList=new ArrayList<>();
      for (int i = 0; i < numbers.length; i++) {
          int number = numbers[i];
          int difference=target - number;
          boolean isContain = hashSet.contains(difference);
          if (isContain && !processedList.contains(number)){
              List<Integer> list=new ArrayList<>();
              list.add(number);
              list.add(difference);
              resultList.add(list);
              processedList.add(number);
              hashSet.remove(number);
              hashSet.remove(target);
          }
      }
    return resultList;
  }
}