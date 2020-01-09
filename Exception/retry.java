import java.util.Scanner;

public class retry {
	private static final int RetryAttempt = 3;
    private static int remainAttempt = RetryAttempt;
    static int j=-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = 1400;
        

		while(attempt()) {
			//clearSystem.out.format("Enter the divisor.");
			
			try {
				int k = i/j;
				System.out.format("The result of division is %d",k);
				break;
			}catch(Exception ee) {
				try {
					System.out.println("Make sure do not enter zero, Enter another value of devisor.");
					errorEncountered();
				}catch(Exception e) {
					System.err.println("\n"+e.getMessage()+"\n"+e+" "+ee);
				}	
			}	
		}
		sc.close();
	}
	public static boolean attempt() {
        j=j+1;
		return remainAttempt>0;
	}
	public static void errorEncountered() throws Exception {
		remainAttempt--;
		if(!attempt()) {
			throw new Exception("Retry Failed: Total number of attempt "+RetryAttempt);
		}
	}
}