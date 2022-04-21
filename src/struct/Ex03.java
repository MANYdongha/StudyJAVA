package struct;
//스택을 함수로 구현하여 사용하기	
class Stack{
int data;
Stack link;

}
public class Ex03 {
	static Stack top = null;
	
	static Stack Push(int num) { //Stack을 쌓는 작업
		Stack backup = top;
		top = new Stack();
		top.data = num;
		top.link = backup;
		
		return top;
	}
	static void showList() {	//지금들어가있는 Stack의 데이터를 보여주는 작업
		while(true) {
			if(top.link != null) {
				System.out.println(top.data);
			}
			else if(top.link == null){
				System.out.println(top.data);
			}
			top = top.link;
			break;
			}
		}
	static void Pop() {
		top = top.link;
		
	}
	
	
	public static void main(String[] args) {
		Push(10);
		Push(20);
		Push(30);
		
		System.out.println(top.data);
		System.out.println(top.link.data);
		System.out.println(top.link.link.data);
		System.out.println();
		showList();
		
		Pop();
		showList();
		System.out.println();
		Pop();
		showList();
		System.out.println();
		Pop();
		showList();
		
		
	}
}
