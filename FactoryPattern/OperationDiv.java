/**
 * OperationDiv
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0) {
            System.out.println("��������Ϊ0!");  
        } else {
            result = getNumberA() / getNumberB();
        }
        return result;
    }
    
}