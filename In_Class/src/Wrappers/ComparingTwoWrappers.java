package Wrappers;

public class ComparingTwoWrappers {

	public static void main(String[] args) {
		String str = "12345";
		
		String str2 = "123";
		
		Integer integer1 = new Integer(str);
		Integer integer2 = new Integer(str);
		Integer integer3 = integer1;
		
		Double int4 = new Double(str2);
		int4 = Double.valueOf(str);
		Float float1 = new Float(str2);
		float1 = Float.parseFloat(str);
		
		float1 = Float.valueOf(43);
		
		System.out.println(float1);
		
		System.out.println(int4);
		
		String b12Parse = "true";
		
		Boolean b12 = new Boolean(b12Parse);
		
		System.out.println(b12);
		
		String char1 = "a";
		
		Character ch1 = new Character('g'); // not parsable
		
		// COME BACK AT 9:15
		
		
//		System.out.println(integer1);
//		System.out.println(integer2);
//		
//		System.out.println(integer1.intValue()==integer2.intValue());
//		
//		System.out.println(integer1==integer3);

	}

}
