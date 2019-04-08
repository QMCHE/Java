package dgsw.y2.c1.n11.calc;

public class Square extends Multiplier {
	
	public void inputOperands(int op1) {
		super.inputOperands(op1, op1);
	}
	
	public static void main(String[] args) {
		Square square = new Square();
		square.inputOperands(125);
		
		square.showResult();
	}
}
