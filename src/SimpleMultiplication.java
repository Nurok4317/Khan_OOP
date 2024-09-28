
class SimpleMultiplication extends MultiplicationOperation {

    public SimpleMultiplication(int multiplier) {
        super(multiplier);
    }

    @Override
    public int multiply(int number) {
        return number * multiplier;
    }
}
