package calculator;

public class Calculator {

    private static int initalValue = 0;

    public int getInitalValue(){
        return initalValue;
    }

    public Calculator(){

    }

    public Calculator(int value){
        initalValue = value;
    }

    public void add(int value){
        initalValue += value;
    }

    public void minus(int value){
        initalValue -= value;
    }

    public void multiply(int value){
        initalValue *= value;
    }

    public void divide(int value){
        initalValue /= value;
    }

    public void clearValue(){
        initalValue = 0;
    }


}
