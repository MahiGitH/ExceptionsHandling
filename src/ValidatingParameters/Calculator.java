package ValidatingParameters;

public class Calculator {
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive ");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Parameters should be positive");
        } else if (subsetSize > setSize) {
            throw new IllegalArgumentException("The subset should not be greater than the set size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
