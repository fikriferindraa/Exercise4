abstract class Parent 
{
	abstract void Message() ;
    void printMethod() {
    	System.out.println("Message");
    }
}
    
class sub extends Parent 
{        
	void Message() {
		System.out.println("This is first Subclass");
    }
}
    
class sub1 extends Parent 
{     
	void Message() {
		System.out.println("This is second Subclass");
    }
}
        
public class Exercise1 {
	public static void main (String[] args) {
		sub a = new sub();
		sub1 b = new sub1();
		a.Message();
		b.Message();
    }
}