package dgsw.y2.c1.n11.calc1;

public abstract class Calculator {
	protected int op1;
	protected int op2;
	
	public void inputOperand(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public abstract int getResult();
	
	public abstract String getOperator();
	
	public void showResult() {
		System.out.printf("%d %s %d = %d", op1, getOperator(), op2, getResult());
	}
}
