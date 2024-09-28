// Абстрактный класс, описывающий операцию умножения
abstract class MultiplicationOperation {
    protected int multiplier;


    public MultiplicationOperation(int multiplier) {
        this.multiplier = multiplier;
    }

    public abstract int multiply(int number);
    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
