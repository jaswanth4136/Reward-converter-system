public class RewardValue {
    private double cashValue;
    public static final double TO_MILES = 0.01;
    public static final double TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            this.cashValue = miles * TO_CASH;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue / TO_MILES;
    }
}
