public class Example {

   public static void main(String[] args){

       //default values
       int i = 200;

        //cast to a short
       	short s = (short)i;
       	System.out.println(s);
       	
       	//cast to a double
       	double d = (double)i;
       	System.out.println(d);
       	
       	/*cast to a byte- a an 8-bit number that follows two�s complement system. 
       	This means its range of values is from -128 to 127. 
       	200 is outside of this range. Should print 200 but prints -56.
       	Should not downcast 200 to byte*/ 
       	byte b = (byte)i;
       	System.out.println(b);
   }

}       
