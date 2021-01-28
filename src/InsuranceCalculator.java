public class InsuranceCalculator {

    private InsuranceStrategy strategyLow = new InsuranceStrategyLow();
    private InsuranceStrategy strategyMedium = new InsuranceStrategyMedium();
    private InsuranceStrategy strategyHigh = new InsuranceStrategyHigh();
    private InsuranceStrategy strategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {

        return strategyLow.calculate(income, (income <= 10000)) +
                strategyMedium.calculate(income, (income > 10000 && income <= 30000)) +
                strategyHigh.calculate(income, (income > 30000 && income <= 60000)) +
                strategyVeryHigh.calculate(income, (income > 60000));
    }
}
