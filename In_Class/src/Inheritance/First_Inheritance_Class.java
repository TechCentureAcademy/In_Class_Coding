package Inheritance;

public class First_Inheritance_Class extends SuperClass {
	
    int speed = 90;
    
    public First_Inheritance_Class() {
    	super("Java is getting harder and harder");
    	System.out.println("Hi, this is SubClass!");
    }
    
    // COME BACK AT 8PM 
	
	public void print() {
		System.out.println("We are driving with speed " + speed + " mph");
	}
	
	public static void main(String[] args) {
		First_Inheritance_Class inheritance = new First_Inheritance_Class();
		inheritance.test();
	}
	
	public void test() {
		super.print();
	}

}
