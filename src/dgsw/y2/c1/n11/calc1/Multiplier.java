package dgsw.y2.c1.n11.calc1;

public class Multiplier extends Calculator {
	@Override
	public int getResult() {
		return this.op1 * this.op2;
	}
	
	@Override
	public String getOperator() {
		return "*";
	}
	
	public static void main(String[] args) {
		Calculator multiplier = new Multiplier();
		multiplier.inputOperand(518, 410);
		multiplier.showResult();
	}
}
