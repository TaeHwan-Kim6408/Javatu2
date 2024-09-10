package _08_Array2;
public class _99_04_Test {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		// 문제4. 전체 배열의 값중 짝수는 모두 몇개인가?
				
		int[][] a = {{1,2,3,4,5},
			        {6,7,8,9,10},
				    {11,12,13,14,15},
			        {16,17,18,19,20},
			        {21,22,23,24,25}};
		
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a.length; j++) {
				if(a[i][j]%2 == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
