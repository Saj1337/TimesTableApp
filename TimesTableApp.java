import java.util.Scanner; 

public class TimesTableApp {
    public static void main( String[] args )
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numm = num.nextInt(); { 
    	for (int i = 1; i <=12; i++) {
        	while (numm < 2 || numm > 100); //while loop
			System.out.print(i + "x" + numm + "=" + (i * numm) + "\n");
    		if (!(numm < 2 || numm > 100)) //if loop is false
    		{
    			System.out.print("error"); //error msg
    		}
        }   	
        	System.out.print("END OF PROGRAM"); //end of program
    }
    }
}

