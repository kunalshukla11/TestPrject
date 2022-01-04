package eight.functionInterface;

import java.util.Arrays;
import java.util.List;

public class InterestTester {
	public static void main(String args[]) {
		
		List<Float> amounts = Arrays.asList(20000f,35000f,40000f,45000f);
		float interestRate = 3.99f;

		InterestCalculator interestCalculator = (amt, intrestRate)->{
			return amt*intrestRate;
		};
		InterestCalculator ic= new InterestCalculator() {
			@Override
			public float calculateInterestAmount(float amount, float interestRate) {
				return 0;
			}
		};
		
		amounts.stream()
				.forEach(amount -> System.out.println(interestCalculator.calculateInterestAmount(amount, 0.99f)
						)
				);
		

	}
}
