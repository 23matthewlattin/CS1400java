class BinaryNumber
{
   private int decimal = 0;
   private String binary;
   
   //constructor
   public BinaryNumber()
   {
      binary = "0";
   }
   
   public void setBinary(String binary)
   {
      this.binary = binary;
      convertToDecimal();
   }
   
   public void convertToDecimal()
   {
      //64 32 16 8 4 2 1 
      //         1 0 1 0
      //default values of the power and ddecimal number
      int pow = 1;
      decimal = 0;
      //counts backwards in the binary string form end to 0
      for(int i = binary.length()-1; i >= 0; i--)
      {
         if(binary.charAt(i) == '1')
         {
            decimal += pow;
         }//end if
         pow *= 2;
      }//end for
   }//end method
   
   public String toString()
   {
      return decimal + " is " + binary + " to binary";
   }
}//end binarynumber