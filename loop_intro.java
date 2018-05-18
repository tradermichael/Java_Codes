public class HelloWorld{

     public static void main(String []args){
      System.out.println("Hello World, this is a while loop"); 
      int x = 1;
      System.out.println("before the loop");
      while (x < 5) {
      System.out.print("Feeling loopy-");
      System.out.println("Value of x is now " + x);
         x = x + 1; //this is to ensure the loop does not go on forever
     }
    System.out.println("Loop has looped"); 
}
}

//work around For Loop to print array. java 5 has java.util.arrays option of Arrays.toString(arr)

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        for(int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
};
        int length = numbers[2];
        System.out.println (length);
        char[] chars = new char[length];
        System.out.println(length);
        chars[numbers.length-1] = 'y';
        System.out.println("Done!");
    }
}
