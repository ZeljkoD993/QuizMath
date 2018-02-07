

public class Calculator {

  public int add(int a, int b){
    return 0;
  }
  
  public int subtract(int a, int b){
    return 0;
  }
	
  public int multiply (int a, int b){
    return 0;
  }
  
  public int divide(int a, int b){
    return 0;
  }

public void shouldAddTwoNumbers (){
  Calculator calculator = new Calculator();
  
  int zbir = calculator.add(1,5);
  
}
  
  public void shouldSubtractTwoNumbers (){
  Calculator calculator = new Calculator();
  
  int razlika = calculator.subtract(5,1);
  
}
  public void shouldMultiplyTwoNumbers (){
  Calculator calculator = new Calculator();
  
  int proizvod = calculator.multiply(1,5);
  
}
  public void shouldDivideTwoNumbers (){
  Calculator calculator = new Calculator();
  
  int kolicina = calculator.divide(5,5);
  
}
  public static void main(String[] args) {
	Calculator c = new Calculator();
	c.shouldAddTwoNumbers();
	c.shouldDivideTwoNumbers();
	c.shouldMultiplyTwoNumbers();
	c.shouldSubtractTwoNumbers();
	System.out.println();
  
  }
}






