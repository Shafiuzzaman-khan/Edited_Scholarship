package prapty;

public class Puja {

public float calculateFeesWithMerits(int fees, float waivour) {
		
		float totalFees =fees- (fees*(waivour/100));

		return totalFees;
	}
		
		public int calculateFess(int credit) {
			
			return credit*5000;
		}
		
		public int offerScholarship(float cGpa) {
			if(cGpa >3.79) {
				System.out.println("Presedentail scholarship");
				return 50;
			}
			if(cGpa>=3.5 && cGpa<=3.79) {
				System.out.println("Vc scholarship");
				return 30;
			}
			
			if(cGpa>=3.3 && cGpa<=3.49) {
				System.out.println("Deans scholarship");
				return 10;
			}
			
			return 0;
		}

}
