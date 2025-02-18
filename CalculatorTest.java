import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        runCalculateTest();
    }

    public static void runCalculateTest() {
        List<Float> numbers = new ArrayList<>();
        numbers.add(10f);
        numbers.add(5f);
        numbers.add(4f);
        numbers.add(3f);

        List<String> operations = new ArrayList<>();
        operations.add("+");
        operations.add("*");
        operations.add("+");

        Calculator.Calculate(numbers, operations);

        float expected = 32f;
        float result = Calculator.finalResult;

        if (result == expected) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed! Expected: " + expected + ", but got: " + result);
        }
    }

}
