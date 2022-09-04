
public class TestFanApp{
    public static void main(String args[]){
    	
    	final int SLOW = 1;		
		final int MEDIUM = 2;	
		final int FAST = 3;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(MEDIUM, true, 8, "Blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}