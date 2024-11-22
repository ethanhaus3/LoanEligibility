package edu.sbcc.cs105;

public class LoanEligibilityCalculator {

	public boolean isEligible(double amountRequested, double annualIncome, double downPayment, int ficoScore, boolean hasLatePayments) {
		double a = annualIncome / amountRequested;
		double b = downPayment / amountRequested;
		boolean isEligible = false;
		if(ficoScore >= 700) {
			if(a >= 0.15 && b > 0.10) {
				isEligible = true;
			}
		}
		else if(ficoScore >= 600) {
			if(a >= 0.2 && b > 0.15) {
				isEligible = true;
			}
			else if(a >= 0.15 && b > 0.15 && hasLatePayments == false) {
				isEligible = true;
			}
		}else {
			isEligible = false;
		}
		return isEligible;
	}

	
}
