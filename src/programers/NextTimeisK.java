package programers;
//K번쨰수 
import java.util.Arrays;
public class NextTimeisK {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int st = 0;
		int en = 0;
		int	po = 0;
		
//		for(int i=0; i<array.length; i++) {
//		System.out.print(array[i] + " ");
//	}
//		System.out.println();
		
		int[] result = new int[commands.length];


		for(int i =0; i<commands.length; i++) {
		st = commands[i][0];	//시작 인덱스
		en = commands[i][1];	//끝나는 인덱스
		po = commands[i][2];	//찾는 인덱스

		int[] arr = new int[en-st+1];
			int index=0;
			for(int j=st-1; j<en; j++) {
				arr[index] = array[j]; //함수를 또 만들필요가 없음..2중포문에 집착하지 말자...
				index++; 			   //여기서 for문을 잘 이해하지 못하고 해맸음.
									   //j를 호출해야 지정한 범위에서 인덱스에 맞게 가져온다.
				}	
									   //그리고 인덱스++로 순서호출하면 되는데 계속 for문을 돌려서 답을 찾으려함
			
//			for(int p=0; p<arr.length; p++) {
//				System.out.println(arr[p]);
//			}		
			
//			System.out.println();
			Arrays.sort(arr);			//sort함수로 정렬

			result[i]= arr[po-1];		//인덱스 개념이 아닌 인덱스기때문에 -1을 해줘서 정확한 위치찾아줌
			System.out.println(result[i]);
			}

		System.out.println();
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
