
public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
		int sum = 0;
		for(int i=0; i<score.length; i++)
			for(int j=0; j<score[i].length; j++)
				System.out.printf("score["+i+"]["+j+"]="+score[i][j]+"\n");
		for(int[] tmp : score)
			for(int i=0; i<tmp.length; i++)
					sum+=tmp[i];
		System.out.println("sum = " + sum);
	}
}