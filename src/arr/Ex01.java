package arr;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 만들기
	      // 1) 배열은 Reference Type이다(=대상이 위치를 가리키는 형식이다.)
	      int[] arr1;                           //변수만 만들었을 뿐 대상을 지정하지 않았다(초기화 x)
	      int[] arr2 = {1,2,3,4,5};               //arr2 변수가 우측의 배열을 가리키고 있다.
	      int[] arr3 = new int[5];               //길이 5짜리 비어있는 배열을 가리키고 있다.
	      int[] arr4 = new int[] {10, 20, 30, 40};   //지정한 요소로  배열을 생성함
	      
	      arr1 = new int[] {11, 22, 33};
	      //new 연산자를 황요하지 않으면 새로운 대상을 가리키게 할 수 없다.
	      // {} 안에 멤버를 적기만 하는 방식은 참조변수 초기화시에만 가능하다.
	      
	      arr3 = new int[] {1, 2, 3};
	      //기존에 대상을 가지고 있더라도  new 연산자를 이용하면 새로운 배열을 가리키게 할 수 있다.
	      
	      for(int i = 0; i< arr3.length;i++) {
	         System.out.println(arr3[i] + " => ");
	         
	         arr3[i] = (i+1)*10;
	         //대입도 가능
	         
	         arr3[i] *= 2;
	         System.out.println(arr3[i]);
	         
	      }
	      System.out.println();
	      
	      
	}
}
