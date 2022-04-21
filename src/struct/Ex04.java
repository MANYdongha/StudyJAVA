package struct;
//class와 재귀함수를  이용한 스텍구현
class Stack2{
int data;
Stack2 link = null;
Stack2 top =null;

	Stack2 push(int data) {
		Stack2 backup = top;
		top = new Stack2();
		top.data = data;
		top.link = backup;
	
		return top;
	}
	
	int pop() {
		int num = top.data;
		top = top.link;
	
		return num;
	}

	public void printStack(Stack2 top) {
		if(top !=null) {
			System.out.println("data =  " + top.data);
			if(top.link !=  null) printStack(top.link);
		}
		
	}
	
	
	

}//end of class Stack2
public class Ex04 {
	public static void main(String[] args) {
		
		Stack2 ob = new Stack2();
		System.out.println("=======================================");
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.printStack(ob.top);
		System.out.println("=======================================");
		System.out.println("pop :" + ob.pop());
		System.out.println("pop :" + ob.pop());
		System.out.println("pop :" + ob.pop());
		System.out.println("=======================================");
		ob.printStack(ob.top);
		
	}
}
