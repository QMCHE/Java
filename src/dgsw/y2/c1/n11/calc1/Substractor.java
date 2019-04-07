package dgsw.y2.c1.n11.calc1;

public class Substractor extends Calculator {
	@Override
	public int getResult() {
		return this.op1 - this.op2;
	}
	
	@Override
	public String getOperator() {
		return "-";
	}
	
	public static void main(String[] args) {
		Calculator substractor = new Substractor();
		substractor.inputOperand(518, 410);
		substractor.showResult();
	}
}