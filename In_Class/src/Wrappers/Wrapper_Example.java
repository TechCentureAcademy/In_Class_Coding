package Wrappers;

public class Wrapper_Example {
	
	int i = 10;
    // different way to create Wrapper class object
    Integer i1 = 10;
    Integer i2 = i;
    Integer i3 = new Integer(1);
    int b = i1;
   // i1.
    //How to reverse a string
    String abc = "abc";
   // String temp = 
   // StringBuilder and StringBuffer
    int num = 123;
    
    
    // What is boxing? Converting from primitive to wrapper
    
    // Before Java 1.5 you had to convert in a different way.
    
    int primitive = 12;
    Integer wrapper = primitive;
    Integer wrapper2 = new Integer(14);
    
    
    
    // What is unboxing? Converting from wrapper to primitive
    
    int unboxing = wrapper.intValue();
   // String ssn = "123456789";
   // Integer convertedSSN = .valueOf(ssn);    
    
    // What is autoboxing? Implicit conversion from primitive to wrapper
    
    
    // What is autounboxing? Implicit conversion from wrapper to primitive
                          //  Converting from wrapper to primitive
    
    int anotherUnboxing = wrapper2;
    
    //----------------------------------------------------------------------------------------
    
    static byte b1 = 3;
    static short sh = 55;
    int in = 1355;
    long l1 = 123456789;
    char c1 = 'A';
    boolean bool = false;
    double d1 = 5.6;
    float f1 = 6.5f;
    
    // Creating Wrapper objects for each primitive
    
    static Byte b2 = b1;
    static Short sh2 = new Short(sh);
    Integer in2 = in;
    Long l2 = new Long(l1);
    Character c2 = new Character(c1);
    Boolean bool2 = bool;
    Double d2 = d1;
    Float f2 = new Float(f1);
    
    
    // ParseInt vs valueOF
    int num2 = Integer.parseInt("123");  // parse method will parse it to the primitive datatype only
    Integer num3 = Integer.valueOf("123"); // valueOf is going to parse it into Wrapper data type only
    // another difference between parse and valueOF is that parse is only converting from one data type to another, 
    // with valueOF you can conver or replace with a same data type
    
    public static void main(String[] args) {
    	
    	System.out.println(b2.byteValue() + sh2.shortValue());
		
    	// COME BACK AT 8:17
	}

}
