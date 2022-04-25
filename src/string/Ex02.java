package string;
//프로그래머스 문제(신규아이디 추천)
public class Ex02 {
	static String solution(String id) {
		String result = "";
//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		id = id.toLowerCase();
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		String files= "abcdefghijklmnopqrstuvwxyz1234567890-_.";
		for(int i=0; i<id.length(); i++) {
			if(files.contains(id.charAt(i)+"")) {
				result += id.charAt(i);
			}
		}
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		while(result.contains("..")) {
			result = result.replace("..", ".");
		}
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		if(result.charAt(0) == '.') {
			result = result.substring(1);
		}
		if(result.equals("") == false) {
			if(result.charAt(result.length()-1) == '.') {
				result = result.substring(0, result.length()-1);
			}
		}
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if(result.equals("")) {
			result = "a";
		}
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//	     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if(result.length() >= 16) {
			result = result.substring(0, 15);				
			if(result.charAt(result.length()-1) == '.') {
				result = result.substring(0, 14);
			}
		}
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.	
		while(result.length() <= 2) {
			char ch = result.charAt(result.length()-1);
			result += ch;
		}
		
		return result;
	} 
	
	public static void main(String[] args) {
String s1 = "...!@BaT#*..y.abcdefghijklm";			String r1="bat.y.abcdefghi";
String s2 = "z-+.^.";								String r2="z--";
String s3 = "=.=";									String r3="aaa";
String s4 = "123_.def";								String r4="123_.def";
String s5 = "abcdefghijklmn.p";						String r5="abcdefghijklmn";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
		System.out.println(solution(s5));
	


		
		boolean flag1 = r1.equals(solution(s1));  
		boolean flag2 = r2.equals(solution(s2));  
		boolean flag3 = r3.equals(solution(s3));  
		boolean flag4 = r4.equals(solution(s4));  
		boolean flag5 = r5.equals(solution(s5));  
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);
		System.out.println(flag5);
		
		
	}
}
