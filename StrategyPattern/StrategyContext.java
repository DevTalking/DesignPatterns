/**
 * StrategyContext
 */
public class StrategyContext {

    public AlgorithmStrategy algorithmStrategy;

    public StrategyContext(AlgorithmType algorithmType) {
        switch (algorithmType) {
            case A:
                this.algorithmStrategy = new ConcreteAlgorithmA();
                break;
            case B:
                this.algorithmStrategy = new ConcreteAlgorithmB();
                break;
            case C:
                this.algorithmStrategy = new ConcreteAlgorithmC();
                break;
            default:
                break;
        }
    }

    public void runAlgorithm() {
        this.algorithmStrategy.algorithmInterface();
    }

}