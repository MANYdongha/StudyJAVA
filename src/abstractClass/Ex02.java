package abstractClass;


abstract class Program {
	abstract void run();	// 실행할 때 호출 할 함수, 내용은 결정되어 있지 않다
	
	void execute(String cmd) {	// 구체적인 실행 내용을 담은 함수, cmd를 받아서 실행해야 한다
		try {
			Runtime.getRuntime().exec(cmd);
		} catch(Exception e) { e.printStackTrace(); }
	}
}
class Chrome extends Program {
	private String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
	@Override
	void run() {
		execute(cmd);
	}
}
class MsEdge extends Program {
	private String cmd = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
	@Override
	void run() {
		execute(cmd);
	}
	void run(String url) {
		execute(cmd + " " + url);
	}
}
class Notepad extends Program {
	@Override
	void run() {
		execute("notepad");
	}
}

public class Ex02 {
	public static void main(String[] args) {
//		Chrome ob1 = new Chrome();
//		ob1.run();
//		Notepad ob2 = new Notepad();
//		ob2.run();
//		MsEdge ob3 = new MsEdge();
//		ob3.run("lol.inven.co.kr");
		
		Program ob4 = new Program() {
			@Override
			void run() {
				execute("mspaint");
			}
		}; 
		ob4.run();
		
		Program ob5 = new Program() {
			@Override
			void run() {
				execute("control");
			}
		};
		ob5.run();
		
		Program ob6 = new Program() {
			@Override
			void run() {
				execute("shutdown /s /t 60");
				try { Thread.sleep(5000); } catch(Exception e) {}
				execute("shutdown /a");
				System.out.println("놀랬쥬?");
			}
		};
		ob6.run();
		
		
		
		
		
		
		
		
		
		
		
	}
}
