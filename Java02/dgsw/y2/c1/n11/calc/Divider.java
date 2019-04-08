package dgsw.y2.c1.n11.calc;

public class Divider extends Adder {
	protected static final String OPERATOR = "/";
	
	public int getResult() {
		return this.op1 / this.op2;
	}

	public static void main(String[] args) {
		Divider divider = new Divider();
		divider.inputOperands(10, 5);
		
		divider.showResult();
	}
}
