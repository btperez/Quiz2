
public class carPayment{
	private double carCost; //sticker price + taxes + extras
	private double downPayment;
	private double loanLength; //in months
	private double interestRate;

	public payment((double) monthlyPayment){
		monthlyPayment = (double) (((interestRate/12) * carCost)/(1 - (1 + (Math.pow(interestRate/12, loanLength)))));
		return monthlyPayment;
	}
	public interest((double) totalInterest){
		totalInterest = ((monthlyPayment * loanLength) - carCost);
		return totalInterest;
	}
}