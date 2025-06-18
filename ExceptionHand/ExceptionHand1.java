package ExceptionHand;
public class ExceptionHand1{
	  public static void main(String[] args) {
		  ExceptionHand1 h=new ExceptionHand1();
	    try {
	      int r = h.divideNumbers(5, 0);
	      System.out.println("Result: " + r);
	    } catch (ArithmeticException e) {
	      System.out.println("Exp occure here: " + e.getMessage());
	    }
	  }
	      int divideNumbers(int x, int y) {
	    if (y == 0) {
	      throw new ArithmeticException("Can't divide the given number by zero");
	    }
	    return x /y;
	  }
	}
