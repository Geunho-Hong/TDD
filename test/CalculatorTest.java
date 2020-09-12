import calculator.Calculator;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    // TDD 의 핵심은 간결하게 코드를 작성할 수 있으면 그렇게 하라.

    @Test
    public void createCalculator(){
        // 초기 default Vaoue = 0 Setting
        Calculator calculator = new Calculator();
        int value = calculator.getInitalValue();
        assertEquals(0,value);
    }

    @Test
    public void createCalculatorWithValue(){
        // 주소값이 다르면 False Return
        Calculator calculator = new Calculator(20);
        assertEquals(calculator,new Calculator(20));
    }

    @Test
    public void createCalculatorWithValue2(){
        Calculator calculator = new Calculator(25);
        assertEquals(25,calculator.getInitalValue());
    }

    @Test
    public void add(){
        Calculator calculator = new Calculator(20);
        calculator.add(50);
        assertEquals(70,calculator.getInitalValue());
    }

    @Test
    public void minus(){
        Calculator calculator = new Calculator(35);
        calculator.minus(25);
        assertEquals(10,calculator.getInitalValue());
    }

    @Test
    public void multiply(){
        Calculator calculator = new Calculator(5);
        calculator.multiply(-5);
        assertEquals(-25,calculator.getInitalValue());
    }

    @Test
    public void divide(){
        Calculator calculator = new Calculator(100);
        calculator.divide(10);
        assertEquals(10,calculator.getInitalValue());
    }

    @Test
    public void clearValue(){
        Calculator calculator = new Calculator(999);
        calculator.clearValue();
        assertEquals(0,calculator.getInitalValue());
    }


}