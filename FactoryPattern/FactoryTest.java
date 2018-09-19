/**
 * Test
 */
public class FactoryTest {

    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.createOperation("*");
        operation.setNumberA(5);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }

}