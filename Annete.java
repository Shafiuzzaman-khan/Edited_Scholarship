package prapty;
import java.util.Scanner;
public class Annete {
	
public static void main (String[] args) {
		
		int credit;
		float cGpa;
			
		
		Puja obj = new Puja();
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter your credit:");
		credit = getInput.nextInt();
		int totalFees = obj.calculateFess(credit) ;
		System.out.println("Total fees without weiver is:");
		
		System.out.println("Toatl fees"+totalFees+" " );
		cGpa = getInput.nextFloat();
		int weiver = obj.offerScholarship(cGpa);
		System.out.println("My weiver:"+ weiver);
		
		
		//System.out.println(weiver);
		//System.out.println(totalFees);
		
		//cGpa obj2 = new cGpa();

		
		float feesAfterWeiver = obj.calculateFeesWithMerits(totalFees, weiver);
		System.out.println("SO your fees after weiver: "+feesAfterWeiver);

	}
	


}
