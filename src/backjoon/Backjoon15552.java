package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon15552 {
	public static void main(String[] args) throws IOException { //꼭 IO예외처리하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			//=Scanner유사
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));			//=System.out.println유사

			int num = Integer.parseInt(br.readLine());	//문자열을 정수로 형변환 후 입력받아 저장한다.
			// BufferedReader한 데이터는 Line단위로만 나눠져서 공백단위로 데이터를 가공하려면 따로 작업해줘야한다.
			StringTokenizer st;	//StringTokenizer함수를 사용

			for(int i=0; i< num; i++) {	//입력받은 정수만큼 반복
				st = new StringTokenizer(br.readLine());	// StringTokenizer공간에 전부 입력받기
				bw.write((Integer.parseInt(st.nextToken())+(Integer.parseInt(st.nextToken())) + "\n" ));	// nextToken으로 쪼개서 순서대로 호출

			}
			br.close();    //버퍼입력닫기
			bw.flush();    //버퍼를 잡아놨기때문에 flush로 청소해주기
			bw.close();    //버퍼출력닫기


		}
}
