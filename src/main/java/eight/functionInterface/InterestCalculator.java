package eight.functionInterface;

@FunctionalInterface
public interface InterestCalculator {
	float calculateInterestAmount(float amount, float interestRate);
}
