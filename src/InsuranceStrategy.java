
public abstract class InsuranceStrategy {
    double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    double calculate(double income, boolean condition) {
        return ((income - getAdjustment()) * getWeight() + getConstant()) * boolToInt(condition);
    }

    int boolToInt(Boolean condition) {
        return condition.compareTo(false);
    }

    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();
}
