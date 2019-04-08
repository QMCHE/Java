package dgsw.y2.c1.n11.calc;

public class Adder {
	private static final String OPERATOR = "+";
	
	protected String operator;
	protected int op1;
	protected int op2;
	
	public Adder() {
		this.operator = OPERATOR;
	}
	
	public void inputOperands(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public int getResult() {
		return this.op1 + this.op2;
	}
	
	public void showResult() {
		System.out.println(getResult());
	}
}
