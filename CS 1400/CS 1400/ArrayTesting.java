import java.util.Random;
class ArrayTesting{
	public static void main(String []args){
      //TODO put code here
      int []numbers = { 2, 4, 6, 8, 10 };
      int []anotherNumberArray = new int[5];
      System.out.println(numbers.length);
      anotherNumberArray[0] = 1;
      
      
      anotherNumberArray[1] = 3;
      anotherNumberArray[2] = 5;
      anotherNumberArray[3] = 7;
      anotherNumberArray[4] = 9;
      
      System.out.println(numbers[numbers.length - 1]);
      System.out.println(numbers[0]);
      System.out.println(numbers[1]);
      //System.out.println(numbers[numbers.length]);
      System.out.println(numbers);	
      
      System.out.println(anotherNumberArray[4]);
      System.out.println(anotherNumberArray.length);
      System.out.println(anotherNumberArray[1] - anotherNumberArray[4]);
      
    
     int i = 0;
     //int[] numbers = new int[100];
     if( i < numbers.length)
     { 
         i += 2;
         numbers[i] = i;
         System.out.println(numbers[i]);
     }
     




	}
   }
