package struct;

//배열로 구성하는 스텍
public class Ex02 {
	public static void main(String[] args) {
		int[] stack = new int[5];
		push(stack, 10);	//스텍에 10을 넣는다.
		push(stack, 20);	//스텍에 20을 넣는다.
		push(stack, 30);	//스텍에 30을 넣는다.

		int num = pop(stack);				//스텍에서 가장 위에 올려진 값을 가져온다.
		System.out.println(num);			//가져온 값을 출력
		System.out.println(pop(stack));		//스텍 가장 위의 값을 가져와서 출력
		System.out.println(pop(stack));		//스텍 가장 위의 값을 가져와서 출력


	}
	static void push(int[] arr, int num) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == 0){
				arr[i] = num; // 자료를 넣었기 때문에 쌓는 중

				return;

			}
		}
	}

	static int pop(int[] arr) {
		int num;
		for(int i = arr.length -1; i != -1; i--) {
			if(arr[i] !=0) {
				num = arr[i];
				arr[i] = 0;	// 자료를 뺐기때문에 empty 그래서 0으로 초기화 시켜준다.
				return num;
			}
		}
		return 0;
	}
}
