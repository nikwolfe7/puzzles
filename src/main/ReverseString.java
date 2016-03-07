package main;

public class ReverseString {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("abcdefg: " + reverse("abcdefg"));
    System.out.println("abcdefg: " + reverseRecursive("abcdefg"));
  }
  
  public static String reverse(String str) {
    char[] arr = str.toCharArray();
    char[] reverse = new char[arr.length];
    for(int i = 0; i < arr.length; i++) {
      reverse[i] = arr[arr.length - 1 - i];
    }
    return new String(reverse);
  }
  
  public static String reverseRecursive(String str) {
    char[] arr = str.toCharArray();
    char[] rev = new char[arr.length]; 
    return reverseRecHelper(0, arr.length-1, arr, rev);
  }
  
  private static String reverseRecHelper(int i, int j, char[] str, char[] rev) {
    if(j >= 0) {
      rev[i] = str[j];
      reverseRecHelper(i+1, j-1, str, rev);
    } 
    return new String(rev);
  }
  
}
